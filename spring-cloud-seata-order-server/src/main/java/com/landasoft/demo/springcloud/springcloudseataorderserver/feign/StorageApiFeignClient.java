package com.landasoft.demo.springcloud.springcloudseataorderserver.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/17 16:02
 */
@FeignClient(value = "storage-server")
public interface StorageApiFeignClient {
    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @GetMapping(value = "/storage/decrease")
    String decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
