package com.landasoft.demo.springcloud.springcloudseataorderserver.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 订单
 * @Date 2020/1/17 15:51
 */
@Data
public class Order {
    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    /**订单状态：0：创建中；1：已完结*/
    private Integer status;

}
