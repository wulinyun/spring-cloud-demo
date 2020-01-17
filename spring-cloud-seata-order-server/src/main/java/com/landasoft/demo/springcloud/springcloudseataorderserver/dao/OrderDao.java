package com.landasoft.demo.springcloud.springcloudseataorderserver.dao;

import com.landasoft.demo.springcloud.springcloudseataorderserver.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/17 15:53
 */
@Repository
public interface OrderDao {
    /**
     * 创建订单
     * @param order
     * @return
     */
    void create(Order order);

    /**
     * 修改订单金额
     * @param userId
     * @param money
     */
    void update(@Param("userId") Long userId, @Param("money") BigDecimal money, @Param("status") Integer status);
}
