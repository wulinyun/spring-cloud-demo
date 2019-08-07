package com.landasoft.demo.spirngcloud.springcloudzipkinstreamclientbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudZipkinStreamClientBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinStreamClientBackendApplication.class, args);
    }

}
