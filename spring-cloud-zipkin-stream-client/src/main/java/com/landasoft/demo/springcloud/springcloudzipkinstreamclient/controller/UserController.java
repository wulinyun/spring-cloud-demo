package com.landasoft.demo.springcloud.springcloudzipkinstreamclient.controller;

import com.landasoft.demo.springcloud.springcloudzipkinstreamclient.feign.ZipkinStreamClientBackendFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 伍林云
 * @date 2019/8/5  18:45
 */
@RestController
@Api(description = "客户端用户管理接口")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    @Qualifier("loadBalancedRestTemplate")
    private RestTemplate loadBalancedRestTemplate;

    @Autowired
    @Qualifier("originRestTemplate")
    private RestTemplate originRestTemplate;

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
        long time_start = System.currentTimeMillis();
        String result= this.originRestTemplate.getForObject("http://localhost:11022/call/" + id, String.class);
        long time_end = System.currentTimeMillis();
        return result+" world" +(time_end-time_start)/1000+"s";
    }

    /**
     * 通过feign调用接口地址
     * @param id
     * @return
     */
    @ApiOperation(value = "通过feign调用接口地址")
    @GetMapping("/call_f/{id}")
    public String callHomeF(@PathVariable String id, @RequestParam(name = "time",required = false)Long time){
        logger.info("calling from trace demo backend by feign");
        //String result= this.restTemplate.getForObject("http://localhost:11022/call/" + id, String.class);
        long time_start = System.currentTimeMillis();
        String result = zipkinStreamClientBackendFeign.call(id,time);
        long time_end = System.currentTimeMillis();
        return result+" world by feign " +(time_end-time_start)/1000.0+"s";
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
        //landa-mas-zipkin-stream-client-backend的值为被调用服务中配置的spring.application.name的值
        String result= this.loadBalancedRestTemplate.getForObject("http://landa-mas-zipkin-stream-client-backend/call/" + id, String.class);
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
