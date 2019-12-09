package com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.controller;

import com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/9 18:55
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/hello")
    public String hello(){
        return helloService.sayHello();
    }
    @RequestMapping("/get")
    public String getRedisInfo(){
        return helloService.getRedisInfo();
    }
}
