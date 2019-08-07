package com.landasoft.demo.springcloud.springcloudzipkinstreamclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/call/{id}")
    public String callHome(@PathVariable String id){
        logger.info("calling from trace demo backend");
        String result= this.restTemplate.getForObject("http://localhost:11022/call/" + id, String.class);
        return result+" world";
    }
    @RequestMapping("/call2/{id}")
    public String callSpringBootDocker(@PathVariable String id){
        logger.info("calling from trace demo backend spring-docker-demo");
        String result= this.restTemplate.getForObject("http://localhost:8080/rest/image/listImageDatas?userId=" + id, String.class);
        return result+" world";
    }
}
