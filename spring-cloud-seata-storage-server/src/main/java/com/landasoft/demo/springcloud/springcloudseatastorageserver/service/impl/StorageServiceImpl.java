package com.landasoft.demo.springcloud.springcloudseatastorageserver.service.impl;

import com.landasoft.demo.springcloud.springcloudseatastorageserver.dao.StorageDao;
import com.landasoft.demo.springcloud.springcloudseatastorageserver.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/17 16:59
 */
@Service("storageServiceImpl")
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageDao storageDao;

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("------->扣减库存结束");
    }
}
