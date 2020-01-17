package com.landasoft.demo.springcloud.springcloudseataorderserver.service.impl;

import com.landasoft.demo.springcloud.springcloudseataorderserver.dao.OrderDao;
import com.landasoft.demo.springcloud.springcloudseataorderserver.entity.Order;
import com.landasoft.demo.springcloud.springcloudseataorderserver.feign.AccountApiFeignClient;
import com.landasoft.demo.springcloud.springcloudseataorderserver.feign.StorageApiFeignClient;
import com.landasoft.demo.springcloud.springcloudseataorderserver.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/17 16:05
 */
@Service("orderServiceImpl")
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private StorageApiFeignClient storageApiFeignClient;
    @Autowired
    private AccountApiFeignClient accountApiFeignClient;
    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------->交易开始");
        //本地方法
        orderDao.create(order);

        //远程方法 扣减库存
        storageApiFeignClient.decrease(order.getProductId(),order.getCount());

        //远程方法 扣减账户余额

        log.info("------->扣减账户开始order中");
        accountApiFeignClient.decrease(order.getUserId(),order.getMoney());
        log.info("------->扣减账户结束order中");

        log.info("------->交易结束");
    }

    @Override
    public void update(Long userId, BigDecimal money, Integer status) {
        log.info("修改订单状态，入参为：userId={},money={},status={}",userId,money,status);
        orderDao.update(userId,money,status);
    }
}
