package com.landasoft.mas.springboot.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author wulinyun
 */
@SpringBootApplication
public class SpringbootDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataJpaApplication.class, args);
    }

}
