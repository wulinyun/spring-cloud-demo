package com.landasoft.demo.springcloud.springcloudgateway.config;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * 网关整合所有swagger文档
 * @author 伍林云
 * @date 2019/8/9  18:42
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    private static Logger logger = LoggerFactory.getLogger(Swagger2Config.class);
    @Value("${swagger.title}")
    private String title;

    @Value("${swagger.description}")
    private String description;

    @Value("${swagger.version}")
    private String version;

    @Value("${swagger.contact.name}")
    private String name;

    @Value("${swagger.contact.url}")
    private String url;

    @Value("${swagger.contact.email}")
    private String email;

    @Value("${swagger.show}")
    private boolean swaggerShow;
    @Autowired
    ZuulProperties zuulProperties;
    @Autowired
    DiscoveryClient discoveryClient;

    @Bean
    public Docket createRestApi() {
        logger.info("gateway create docket init.....");
        logger.info("zuulProperties:{}", zuulProperties.getRoutes().values());
        logger.info("discoveryClient:{}", discoveryClient.getServices());
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swaggerShow)
                .apiInfo(apiInfo());

    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .contact(new Contact(name, url, email))
                .version(version)
                .build();
    }
    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration(null, "list", "alpha", "schema",
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, true, 60000L);
    }
    @Primary
    @Bean
    public SwaggerResourcesProvider swaggerResourcesProvider() {
        logger.info("swaggerResourcesProvider----------");
        return () -> {
            List<SwaggerResource> resources = new ArrayList<>();
            //zuulProperties.getRoutes().values().stream().forEach(zuulRoute -> resources.add(createResource(zuulRoute.getServiceId(), zuulRoute.getServiceId(), "2.0")));
            //通过注册的服务来增加swagger的资源，可能有些服务没有配置swagger，这样在聚合页面的下拉框里的访问路径将是错误的，先暂认为都存在。
            //未来这里的实现方式可以考虑从配置文件或者数据库里来配置swagger资源的路径和版本信息

            discoveryClient.getServices().stream().forEach(
                    service -> {
                        //只收录mas的服务，排除网关，注册中心服务
                        if (StringUtils.containsIgnoreCase(service, "mas") && (
                                !StringUtils.containsIgnoreCase(service, "landa-mas-eureka")) &&
                                (!StringUtils.containsIgnoreCase(service, "landa-mas-gateway"))
                                ) {
                            logger.info("swaggerResourcesProvider add resource:{}",service);
                            resources.add(createResource(service, service, "2.0"));
                        }
/*                        logger.info("swaggerResourcesProvider add resource:{}",service);
                        resources.add(createResource(service, service, "2.0"));*/
                    }


            );
            return resources;
        };
    }

    private SwaggerResource createResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        String gatewayLocation = "/" + location + "/v2/api-docs";
        swaggerResource.setLocation(gatewayLocation);
        swaggerResource.setSwaggerVersion(version);
        logger.info("create swagger resource: name={},location={},version={}", new String[]{name, gatewayLocation, version});
        return swaggerResource;
    }
}
