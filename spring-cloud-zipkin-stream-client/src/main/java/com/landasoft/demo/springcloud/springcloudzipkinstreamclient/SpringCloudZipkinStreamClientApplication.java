package com.landasoft.demo.springcloud.springcloudzipkinstreamclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient  //开启注册中心客户端
@EnableFeignClients //开启feigin
@SpringBootApplication
public class SpringCloudZipkinStreamClientApplication {

    /**
     * 走注册中心通过服务名称调用的restTemplate
     * @return
     */
    @Bean(name = {"loadBalancedRestTemplate"})
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 普通的restTemplate
     * @return
     */
    @Bean(name = {"originRestTemplate"})
    public RestTemplate RestTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinStreamClientApplication.class, args);
    }

}
