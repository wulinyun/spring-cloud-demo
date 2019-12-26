package com.landasoft.demo.springboot.springbootjar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootJarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJarApplication.class, args);
    }

}
