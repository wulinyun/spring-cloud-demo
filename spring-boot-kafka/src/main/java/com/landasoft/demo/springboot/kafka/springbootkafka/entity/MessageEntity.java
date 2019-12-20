package com.landasoft.demo.springboot.kafka.springbootkafka.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/10 17:13
 */
public class MessageEntity {

    private Date sendTime;//发送时间
    private String msg; //发送消息

    public Date getSendTime() {
        return sendTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
