package com.landasoft.demo.springcloud.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 测试spring-cloud-configs-client测试方法
 * 注明：自动刷新只能刷新 @RefreshScope 注解下的配置，一些特殊配置，如数据库等，需要同样先设置数据库链接ConfigServer类，然后通过加 @RefreshScope 注解方式
 * @Date 2019/12/30 13:53
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${easy.hello}")
    private String msg;
    @GetMapping("/")
    public String hello(){
        return msg;
    }
}
