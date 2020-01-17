package com.landasoft.demo.springcloud.springcloudseataorderserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.landasoft.demo.springcloud.springcloudseataorderserver.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudSeataOrderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSeataOrderServerApplication.class, args);
    }

}
