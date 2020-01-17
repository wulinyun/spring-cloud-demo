package com.landasoft.demo.springcloud.springcloudseatastorageserver.entity;

import lombok.Data;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 库存
 * @Date 2020/1/17 16:52
 */
@Data
public class Storage {
    private Long id;

    /**产品id*/
    private Long productId;

    /**总库存*/
    private Integer total;

    /**已用库存*/
    private Integer used;

    /**剩余库存*/
    private Integer residue;
}
