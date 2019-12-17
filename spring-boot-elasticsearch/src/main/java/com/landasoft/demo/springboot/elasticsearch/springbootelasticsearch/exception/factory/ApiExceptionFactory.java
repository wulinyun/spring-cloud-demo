package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.exception.factory;

import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.exception.ApiException;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/17 16:33
 */
public interface ApiExceptionFactory {
    String prefix();

    default ApiException apply(String errorCode, String errorMsg) {
        return new ApiException(this.prefix() + errorCode, errorMsg);
    }
}
