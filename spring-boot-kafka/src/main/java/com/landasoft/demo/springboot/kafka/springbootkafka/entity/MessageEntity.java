package com.landasoft.demo.springboot.kafka.springbootkafka.entity;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/10 17:13
 */
@Data
public class MessageEntity implements Serializable {

    private Date sendTime;//发送时间
    private String msg; //发送消息
}
