package com.landasoft.demo.springcloud.springcloudseataorderserver.controller;

import com.landasoft.demo.springcloud.springcloudseataorderserver.entity.Order;
import com.landasoft.demo.springcloud.springcloudseataorderserver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/17 16:26
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {
    @Autowired
    private OrderService orderServiceImpl;
    /**
     * 创建订单
     * @param order
     * @return
     */
    @GetMapping("create")
    public String create(Order order){
        orderServiceImpl.create(order);
        return "Create order success";
    }

    /**
     * 修改订单状态
     * @param userId
     * @param money
     * @param status
     * @return
     */
    @RequestMapping("update")
    String update(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money, @RequestParam("status") Integer status){
        orderServiceImpl.update(userId,money,status);
        return "订单状态修改成功";
    }
}
