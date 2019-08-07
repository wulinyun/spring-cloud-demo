package com.landasoft.demo.springcloud.springcloudsleuthzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class SpringCloudSleuthZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSleuthZipkinServerApplication.class, args);
    }

}
