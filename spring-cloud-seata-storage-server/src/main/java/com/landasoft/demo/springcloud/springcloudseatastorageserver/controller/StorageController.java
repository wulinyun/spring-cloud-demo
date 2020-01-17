package com.landasoft.demo.springcloud.springcloudseatastorageserver.controller;

import com.landasoft.demo.springcloud.springcloudseatastorageserver.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/17 17:02
 */
@RestController
@RequestMapping("storage")
public class StorageController {
    @Autowired
    private StorageService storageServiceImpl;
    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    @RequestMapping("decrease")
    public String decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        storageServiceImpl.decrease(productId,count);
        return "Decrease storage success";
    }
}
