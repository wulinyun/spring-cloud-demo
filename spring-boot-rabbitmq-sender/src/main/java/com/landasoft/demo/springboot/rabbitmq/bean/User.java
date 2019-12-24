package com.landasoft.demo.springboot.rabbitmq.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 发送消息体
 * @Date 2019/12/24 10:11
 */
@Data
public class User implements Serializable {

    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
}
