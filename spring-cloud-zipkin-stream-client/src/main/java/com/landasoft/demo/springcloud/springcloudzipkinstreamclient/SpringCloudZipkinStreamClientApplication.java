package com.landasoft.demo.springcloud.springcloudzipkinstreamclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudZipkinStreamClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinStreamClientApplication.class, args);
    }

}
