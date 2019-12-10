package com.landasoft.demo.springboot.kafka.springbootkafka.sender;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/10 18:57
 */
@Component
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    /**
     * 发送消息到kafka
     */
    public void sendChannelMess(String channel, String message){
        kafkaTemplate.send(channel,message);
    }

    public void sendChannelMap(String channel, Map<String,Object> message){
        kafkaTemplate.send(channel, JSON.toJSONString(message));
    }
}
