package com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.service.impl;

import com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description TODO
 * @Date 2019/12/9 18:49
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return null;
    }

    @Override
    public String getRedisInfo() {
        return null;
    }
}
