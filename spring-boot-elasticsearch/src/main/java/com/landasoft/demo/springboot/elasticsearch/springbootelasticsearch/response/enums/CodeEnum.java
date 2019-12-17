package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.response.enums;

import lombok.Getter;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description code枚举
 * @Date 2019/12/17 17:00
 */
@Getter
public enum CodeEnum {
    SUCCESS("200", "成功")
    , BAD_REQUEST_CODE("400", "请求错误")
    , SYSTEM_ERROR_CODE("500", "操作失败")
    ;
    private String code;
    private String message;
    CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
