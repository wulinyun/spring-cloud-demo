package com.landasoft.demo.springboot.kafka.springbootkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/10 19:08
 */
@Component
public class KafkaConsumer {
    /**
     * 监听testTopic主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"testTopic"})
    public void receiveMessage(String message){
        //收到通道的消息之后执行操作
        System.out.println("消息1："+message);


    }

    /**
     * 监听test2主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test2"})
    public void receiveMap(String message){
        //收到通道的消息之后执行操作
        System.out.println("消息2："+message);
    }
}
