package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqreceiver.receive;

import com.landasoft.demo.springboot.rabbitmq.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description direct路由模式消息接收监听器
 * @Date 2019/12/24 11:24
 */
@Component
@Slf4j
public class Receive {
    public final static String ROUTING_KEY="DIRECT_QUEUE";
    @RabbitListener(queues=ROUTING_KEY)
    public void processC(String str) {
        log.info("Receive:"+str);
    }
    @RabbitListener(queues=ROUTING_KEY)
    public void processC(User user) {
        log.info("Receive:"+user);
    }
}
