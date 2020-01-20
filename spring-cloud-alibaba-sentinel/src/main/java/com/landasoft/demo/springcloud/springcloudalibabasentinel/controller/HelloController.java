package com.landasoft.demo.springcloud.springcloudalibabasentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/20 14:05
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hi,spring-cloud-alibaba-sentinel";
    }
}
