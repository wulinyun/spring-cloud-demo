package com.landasoft.demo.springcloud.springcloudsleuthzipkinstreamserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import zipkin.server.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;


import javax.sql.DataSource;
@EnableZipkinServer
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudSleuthZipkinStreamServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSleuthZipkinStreamServerApplication.class, args);
    }
    @Bean
    public MySQLStorage mySQLStorage(DataSource datasource) {
        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
    }
}
