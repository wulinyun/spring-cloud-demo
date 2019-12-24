package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender;

import com.landasoft.demo.springboot.rabbitmq.bean.User;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.config.SenderConf;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description Direct路由模式相当于一对一模式,一个消息被发送者发送后,会被转发到一个绑定的消息队列中,然后被一个接收者接收!
 * 实际上RabbitMQ还可以支持发送对象:当然由于涉及到序列化和反序列化,该对象要实现Serilizable接口
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
