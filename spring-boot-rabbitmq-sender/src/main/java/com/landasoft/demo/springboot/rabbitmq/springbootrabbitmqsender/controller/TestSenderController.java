package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.controller;

import com.landasoft.demo.springboot.rabbitmq.bean.User;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.config.SenderTopicConf;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender.FanoutSender;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender.Sender;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/27 20:30
 */
@RestController
public class TestSenderController {
    @Autowired
    private Sender sender;
    @Autowired
    private TopicSender topicSender;
    @Autowired
    private FanoutSender fanoutSender;
    @GetMapping("/")
    public void sender(){
        User user = new User();
        user.setUserName("wulinyun");
        user.setUserPassword("88888888");
        sender.send(user);
        topicSender.send(SenderTopicConf.EXCHANGE, "topic.message", user);;
        topicSender.send(SenderTopicConf.EXCHANGE, "topic.messages", user);
        fanoutSender.send("fanoutExchange", "", user);
    }

}
