package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqreceiver.receive;

import com.landasoft.demo.springboot.rabbitmq.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description topic通配符模式消息接收监听器
 * @Date 2019/12/24 11:30
 */
@Component
@Slf4j
public class TopicReceive {
    /*@RabbitListener(queues="topic.message")    //监听器监听指定的Queue
    public void processC1(String str) {
        log.info("topic.message Receive:"+str);
    }*/
    @RabbitListener(queues="topic.message")    //监听器监听指定的Queue
    public void processC1(User user) {
        log.info("topic.message Receive :"+user);
    }
    /*@RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
    public void processC2(String str) {
        log.info("topic.messages Receive:"+str);
    }*/
    @RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
    public void processC2(User user) {
        log.info("topic.messages Receive:"+user);
    }
}
