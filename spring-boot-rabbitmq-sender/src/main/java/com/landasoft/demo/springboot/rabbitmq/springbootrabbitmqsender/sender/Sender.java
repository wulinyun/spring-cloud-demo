package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender;

import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.bean.User;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.config.SenderConf;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/24 10:17
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 发送普通string对象
     * @param str 参数string
     */
    public void send(String str) {
        amqpTemplate.convertAndSend(SenderConf.ROUTINGKEY, str);
    }

    /**
     * 发送自定义序列化消息对象
     * @param user
     */
    public void send(User user) {
        amqpTemplate.convertAndSend(SenderConf.ROUTINGKEY, user);
    }
}
