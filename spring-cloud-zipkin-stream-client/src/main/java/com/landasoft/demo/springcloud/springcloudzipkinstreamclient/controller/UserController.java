package com.landasoft.demo.springcloud.springcloudzipkinstreamclient.controller;

import com.landasoft.demo.springcloud.springcloudzipkinstreamclient.feign.ZipkinStreamClientBackendFeign;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 伍林云
 * @date 2019/8/5  18:45
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    @Qualifier("originRestTemplate")
    private RestTemplate originRestTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean(name = {"originRestTemplate"})
    public RestTemplate RestTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private ZipkinStreamClientBackendFeign zipkinStreamClientBackendFeign;
    /**
     * 直接调用接口地址
     * @param id
     * @return
     */
    @ApiOperation(value = "直接调用接口地址")
    @GetMapping("/call/{id}")
    public String callHome(@PathVariable String id){
        logger.info("calling from trace demo backend");
        String result= this.originRestTemplate.getForObject("http://localhost:11022/call/" + id, String.class);
        return result+" world";
    }

    /**
     * 通过feign调用接口地址
     * @param id
     * @return
     */
    @ApiOperation(value = "通过feign调用接口地址")
    @GetMapping("/call_f/{id}")
    public String callHomeF(@PathVariable String id){
        logger.info("calling from trace demo backend by feign");
        //String result= this.restTemplate.getForObject("http://localhost:11022/call/" + id, String.class);
        String result = zipkinStreamClientBackendFeign.call(id);
        return result+" world by feign ";
    }

    /**
     * 通过注册中心的服务名称调用接口
     * @param id
     * @return
     */
    @ApiOperation(value = "通过注册中心的服务名称调用接口")
    @GetMapping("/call_e/{id}")
    public String callHomeE(@PathVariable String id){
        logger.info("calling from trace demo backend by eureka");
        String result= this.restTemplate.getForObject("http://landa-mas-zipkin-stream-client-backend/call/" + id, String.class);
        return result+" world by eureka";
    }
    @ApiOperation(value = "直接接口地址调用中转调用另外一个服务")
    @GetMapping("/call1/{id}")
    public String callHome1(@PathVariable String id){
        logger.info("calling from trace demo backend");
        String result= this.originRestTemplate.getForObject("http://localhost:11022/call1/" + id, String.class);
        return result+" world";
    }
    @ApiOperation(value = "直接调用另外一个服务")
    @GetMapping("/call2/{id}")
    public String callSpringBootDocker(@PathVariable String id){
        logger.info("calling from trace demo backend spring-docker-demo");
        String result= this.originRestTemplate.getForObject("http://localhost:8080/rest/image/listImageDatas?userId=" + id, String.class);
        return result+" world";
    }
}
