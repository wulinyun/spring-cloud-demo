package com.landasoft.demo.springcloud.springcloudseataaccountserver.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description order远程feign调用客户端
 * @Date 2020/1/17 14:58
 */
@FeignClient(value = "order-server")
public interface OrderApiFeignClient {
    /**
     * 修改订单金额
     * @param userId
     * @param money
     * @param status
     * @return
     */
    @RequestMapping("/order/update")
    String update(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money, @RequestParam("status") Integer status);
}
