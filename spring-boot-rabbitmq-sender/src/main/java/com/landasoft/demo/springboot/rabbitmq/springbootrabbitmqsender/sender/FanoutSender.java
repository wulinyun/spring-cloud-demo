package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender;

import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.bean.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description Fanout广播模式消息发送器
 * @Date 2019/12/24 10:22
 */
@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    public void send(String exchange,String queue,String str) {
        amqpTemplate.convertAndSend(exchange, queue, str);;
    }
    public void send(String exchange, String queue, User user) {
        amqpTemplate.convertAndSend(exchange, queue, user);
    }
}
