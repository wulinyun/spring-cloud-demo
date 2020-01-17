package com.landasoft.demo.springcloud.springcloudseatastorageserver.service;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 库存服务接口
 * @Date 2020/1/17 16:58
 */
public interface StorageService {
    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    void decrease(Long productId, Integer count);
}
