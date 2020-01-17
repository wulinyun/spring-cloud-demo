package com.landasoft.demo.springcloud.springcloudseatastorageserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@MapperScan("com.landasoft.demo.springcloud.springcloudseatastorageserver.dao")
public class SpringCloudSeataStorageServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSeataStorageServerApplication.class, args);
    }

}
