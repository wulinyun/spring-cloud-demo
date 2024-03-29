package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
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
    public final static String EXCHANGE="exchange";
    @Bean(name="message")
    public Queue queueMessage() {
        return new Queue("topic.message",true);
    }
    @Bean(name="messages")
    public Queue queueMessages() {
        return new Queue("topic.messages",true);
    }
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE, true, false);
    }
    @Bean
    Binding bindingExchangeMessage(@Qualifier("message") Queue queueMessage,
                                   TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }
    @Bean
    Binding bindingExchangeMessages(@Qualifier("messages") Queue queueMessages, TopicExchange exchange) {
        //*表示一个词,#表示零个或多个词
        //当topic.messages对象消息发送过去的时候，只有topic.messages队列能够匹配接收，topic.message的routingKey为topic.message没法匹配
        //当topic.message对象消息发送过去的时候，topic.messages和topic.message的队列都可以收到消息因为他们的routingKey都能够匹配
        //当
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}
