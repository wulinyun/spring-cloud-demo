package com.landasoft.demo.spirngcloud.springcloudzipkinstreamclientbackend.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author 伍林云
 * @date 2019/8/5  19:21
 */
@Api(description = "服务端用户管理接口")
@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/call/{id}")
    @ApiOperation(value = "call返回接口信息")
    public String callHome(@PathVariable String id, @RequestParam(name = "time",defaultValue = "0")Long time) throws InterruptedException {
        logger.info("calling trace demo backend");
        Thread.sleep(time);
        return "hello"+id+"feign waiting("+time+"ms)";
    }
    @GetMapping("/call1/{id}")
    @ApiOperation(value = "call返回其它服务接口信息")
    public String callSpringBootDocker(@PathVariable String id){
        logger.info("calling from trace demo backend spring-docker-demo");
        String result= this.restTemplate.getForObject("http://localhost:8080/rest/image/listImageDatas?userId=" + id, String.class);
        return result+" world";
    }
}
