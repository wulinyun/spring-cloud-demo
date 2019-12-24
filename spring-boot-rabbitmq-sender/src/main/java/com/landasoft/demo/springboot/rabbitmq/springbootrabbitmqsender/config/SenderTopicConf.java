package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.config;

import org.springframework.context.annotation.Configuration;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description topic通配符主题订阅模式
 * 需要配置队列Queue,再配置交换机(Exchange),再把队列按照相应的规则绑定到交换机上
 * 应用场景：
 * 单发送，单接收的应用场景
 * 多发送，单接收的应用场景（主要）
 * @Date 2019/12/24 9:42
 */
@Configuration
public class SenderTopicConf {
}
