package com.landasoft.demo.springcloud.springcloudseataaccountserver.service;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 账户服务接口
 * @Date 2020/1/17 14:53
 */
public interface AccountService {
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(Long userId, BigDecimal money);
}
