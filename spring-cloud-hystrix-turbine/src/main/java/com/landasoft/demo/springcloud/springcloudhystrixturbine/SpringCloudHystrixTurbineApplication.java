package com.landasoft.demo.springcloud.springcloudhystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableHystrixDashboard
@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudHystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixTurbineApplication.class, args);
    }
}
