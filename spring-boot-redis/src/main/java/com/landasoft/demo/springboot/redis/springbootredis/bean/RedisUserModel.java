package com.landasoft.demo.springboot.redis.springbootredis.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 测试redis存储对象方式
 * @Date 2019/12/20 15:08
 */
@Data
public class RedisUserModel implements Serializable {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String userPaasword;
}
