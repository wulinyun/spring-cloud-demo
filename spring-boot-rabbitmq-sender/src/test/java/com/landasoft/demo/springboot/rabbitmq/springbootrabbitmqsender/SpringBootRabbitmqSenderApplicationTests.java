package com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender;

import com.landasoft.demo.springboot.rabbitmq.bean.User;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.config.SenderFanoutConf;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.config.SenderTopicConf;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender.FanoutSender;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender.Sender;
import com.landasoft.demo.springboot.rabbitmq.springbootrabbitmqsender.sender.TopicSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRabbitmqSenderApplicationTests {
    @Autowired
    private Sender sender;//direct路由模式消息发送器
    @Autowired
    private TopicSender topicSender;//topic通配符订阅模式消息发送器
    @Autowired
    private FanoutSender fanoutSender;//fanout广播模式消息发送器

    @Test
    void contextLoads() {
    }
    @Test
    public void testRabbit() {
        sender.send("hello,rabbit~");
        User user = new User();
        user.setUserName("wulinyun");
        user.setUserPassword("88888888");
        sender.send(user);
    }
    @Test
    public void testTopicRabbit() {
        //topicSender.send(SenderTopicConf.EXCHANGE, "topic.message", "hello,rabbit~");;
        User user = new User();
        user.setUserName("wulinyun");
        user.setUserPassword("88888888");
        topicSender.send(SenderTopicConf.EXCHANGE, "topic.messages", user);
    }
    @Test
    public void testFanoutRabbit() {
        //fanoutSender.send(SenderFanoutConf.FANOUTEXCHANGE, "", "hello,fanout rabbit~");;
        User user = new User();
        user.setUserName("wulinyun");
        user.setUserPassword("88888888");
        fanoutSender.send("fanoutExchange", "", user);
    }

}
