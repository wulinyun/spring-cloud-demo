package com.landasoft.demo.springcloud.springcloudseataorderserver.service;

import com.landasoft.demo.springcloud.springcloudseataorderserver.entity.Order;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/17 16:04
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     * @return
     */
    void create(Order order);

    /**
     * 修改订单状态
     * @param userId
     * @param money
     * @param status
     */
    void update(Long userId, BigDecimal money, Integer status);
}
