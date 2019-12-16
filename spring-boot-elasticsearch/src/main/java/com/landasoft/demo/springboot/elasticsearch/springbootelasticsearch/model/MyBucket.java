package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/16 14:16
 */
@NoArgsConstructor
@AllArgsConstructor
public class MyBucket {
    private Object key;
    private Long docCount;
}
