package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description direct模式相当于一对一模式,一个消息被发送者发送后,会被转发到一个绑定的消息队列中,然后被一个接收者接收!
 * 实际上RabbitMQ还可以支持发送对象:当然由于涉及到序列化和反序列化,该对象要实现Serilizable接口
 * 应用场景：单发送，单接收的简单的应用场景
 * @Date 2019/12/24 9:01
 */
@Configuration
public class SenderConf {
    public final static String ROUTINGKEY="DIRECT_QUEUE";
    @Bean
    public Queue queue() {

        //ROUTINGKEY 队列的名称，不可为空 durable 队列是否可持久化，默认为true
        return new Queue(ROUTINGKEY, true);

    }
}
