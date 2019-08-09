package com.landasoft.demo.springcloud.springcloudzipkinstreamclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient  //开启注册中心客户端
@EnableFeignClients //开启feigin
@SpringBootApplication
public class SpringCloudZipkinStreamClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinStreamClientApplication.class, args);
    }

}
