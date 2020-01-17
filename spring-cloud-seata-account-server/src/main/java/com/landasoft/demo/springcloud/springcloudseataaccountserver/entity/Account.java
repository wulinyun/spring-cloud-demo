package com.landasoft.demo.springcloud.springcloudseataaccountserver.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 账户实体
 * @Date 2020/1/17 14:49
 */
@Data
public class Account {
    private Long id;

    /**用户id*/
    private Long userId;

    /**总额度*/
    private BigDecimal total;

    /**已用额度*/
    private BigDecimal used;

    /**剩余额度*/
    private BigDecimal residue;
}
