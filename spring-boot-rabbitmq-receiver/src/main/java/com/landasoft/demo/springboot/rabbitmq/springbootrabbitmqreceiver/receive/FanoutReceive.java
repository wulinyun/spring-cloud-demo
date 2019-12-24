package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqreceiver.receive;

import com.landasoft.demo.springboot.rabbitmq.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description Fanout广播形式消息接收监听器
 * @Date 2019/12/24 11:27
 */
@Component
@Slf4j
public class FanoutReceive {
    /*@RabbitListener(queues="fanout.A")    //监听器监听指定的Queue
    public void processA(String str) {
        log.info("ReceiveA:"+str);
    }*/
    @RabbitListener(queues="fanout.A")    //监听器监听指定的Queue
    public void processA(User user) {
        log.info("ReceiveA:"+user);
    }
    /*@RabbitListener(queues="fanout.B")    //监听器监听指定的Queue
    public void processB(String str) {
        log.info("ReceiveB:"+str);
    }*/
    @RabbitListener(queues="fanout.B")    //监听器监听指定的Queue
    public void processB(User user) {
        log.info("ReceiveB:"+user);
    }
   /* @RabbitListener(queues="fanout.C")    //监听器监听指定的Queue
    public void processC(String str) {
        log.info("ReceiveC:"+str);
    }*/
    @RabbitListener(queues="fanout.C")    //监听器监听指定的Queue
    public void processC(User user) {
        log.info("ReceiveC:"+user);
    }
}
