package com.landasoft.demo.springboot.kafka.springbootkafka.consumer;

import com.alibaba.fastjson.JSON;
import com.landasoft.demo.springboot.kafka.springbootkafka.entity.MessageEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Map;

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
        MessageEntity messageEntity = JSON.parseObject(message,MessageEntity.class);
        //收到通道的消息之后执行操作
        System.out.println("testTopic消息1："+messageEntity.toString());

    }
    /**
     * 监听test2主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test2"})
    public void receiveMap(String message){
        Map<String,Object> map = JSON.parseObject(message,Map.class);
        //收到通道的消息之后执行操作
        System.out.println("test2消息2："+map);
    }
}
