package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender;

import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.bean.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description topic通配符主题订阅模式 订阅模式消息发送器
 * @Date 2019/12/24 10:24
 */
@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    public void send(String exchange,String queue,String str) {
        amqpTemplate.convertAndSend(exchange, queue, str);;
    }
    public void send(String exchange, String queue, User user) {
        amqpTemplate.convertAndSend(exchange, queue, user);
    }
}
