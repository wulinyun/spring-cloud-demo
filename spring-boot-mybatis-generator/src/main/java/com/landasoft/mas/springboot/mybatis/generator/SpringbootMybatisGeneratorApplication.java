package com.landasoft.mas.springboot.mybatis.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.landasoft.mas.springboot.mybatis.generator.dao")
public class SpringbootMybatisGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisGeneratorApplication.class, args);
    }

}
