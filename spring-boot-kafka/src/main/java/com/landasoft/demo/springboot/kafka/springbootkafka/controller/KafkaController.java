package com.landasoft.demo.springboot.kafka.springbootkafka.controller;

import com.alibaba.fastjson.JSON;
import com.landasoft.demo.springboot.kafka.springbootkafka.entity.MessageEntity;
import com.landasoft.demo.springboot.kafka.springbootkafka.sender.KafkaSender;
import com.landasoft.demo.springboot.kafka.springbootkafka.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description kafka演示
 * @Date 2019/12/10 19:12
 */
@RequestMapping(value = "/kafka")
@RestController
@Api(value = "KafkaController",tags = "KafkaController")
public class KafkaController {
    @Autowired
    private KafkaSender kafkaSender;

    @ApiOperation(value = "测试")
    @GetMapping(value = "/test")
    public R test(){
        //直接发送String消息
        kafkaSender.sendChannelMess("testTopic","testTopic");

        //发送实体对象消息
        MessageEntity messageEntity =new MessageEntity();
        messageEntity.setMsg("testTopic");
        messageEntity.setSendTime(new Date());
        Map<String,Object> msg = JSON.parseObject(JSON.toJSONString(messageEntity), Map.class);
        kafkaSender.sendChannelMap("testTopic",msg);

        //直接发送map对象消息
        Map<String,Object> map = new HashMap<>();
        map.put("msg","test2");
        kafkaSender.sendChannelMap("test2",map);
        return R.ok();

    }

}
