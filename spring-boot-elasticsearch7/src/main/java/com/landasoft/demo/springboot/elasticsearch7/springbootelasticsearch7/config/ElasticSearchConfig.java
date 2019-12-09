package com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author wulinyun
 * @Date 2019/12/9 17:57
 * @Version 1.0
 * @Description es-config
 */
@SpringBootConfiguration
public class ElasticSearchConfig {
    @PostConstruct
    void init() {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
    }
}
