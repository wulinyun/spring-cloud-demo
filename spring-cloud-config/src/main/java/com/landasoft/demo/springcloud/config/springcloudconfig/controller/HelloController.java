package com.landasoft.demo.springcloud.config.springcloudconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 伍林云
 * @date 2019/8/20  17:12
 */
@RestController
public class HelloController {
    @Value(value = "${demo.msg}")
    private String msg;
    @GetMapping("/")
    public String hello(){
        return msg;
    }
}
