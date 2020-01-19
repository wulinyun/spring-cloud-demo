package com.landasoft.demo.springcloud.springcloudseataaccountserver.service.impl;

import com.landasoft.demo.springcloud.springcloudseataaccountserver.dao.AccountDao;
import com.landasoft.demo.springcloud.springcloudseataaccountserver.feign.OrderApiFeignClient;
import com.landasoft.demo.springcloud.springcloudseataaccountserver.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 账户服务接口实现
 * @Date 2020/1/17 14:54
 */
@Service("accountServiceImpl")
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private OrderApiFeignClient orderApiFeignClient;
    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------->扣减账户开始account中");
        //模拟超时异常，全局事务回滚
//        try {
//            Thread.sleep(30*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        accountDao.decrease(userId,money);
        log.info("------->扣减账户结束account中");

        //修改订单状态，此调用会导致调用成环
        log.info("修改订单状态开始");
        String mes = orderApiFeignClient.update(userId, money.multiply(new BigDecimal("0.09")),0);
        log.info("修改订单状态结束：{}",mes);
    }
}
