package com.landasoft.demo.springcloud.springcloudseataaccountserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description  账户操作mapper接口
 * @Date 2020/1/17 14:51
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
