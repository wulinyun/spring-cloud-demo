package com.landasoft.demo.springcloud.springcloudseataorderserver.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/17 16:01
 */
@FeignClient(value = "account-server")
public interface AccountApiFeignClient {
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     * @return
     */
    @RequestMapping("/account/decrease")
    String decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
