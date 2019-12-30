package com.landasoft.demo.springcloud.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 测试spring-cloud-config-client测试方法
 * @Date 2019/12/30 13:53
 */
@RestController
public class HelloController {
    @Value("${easy.hello}")
    private String msg;
    @GetMapping("/")
    public String hello(){
        return msg;
    }
}
