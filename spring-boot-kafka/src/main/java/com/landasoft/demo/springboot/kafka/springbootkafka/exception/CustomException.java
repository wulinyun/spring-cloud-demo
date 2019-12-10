package com.landasoft.demo.springboot.kafka.springbootkafka.exception;

import com.landasoft.demo.springboot.kafka.springbootkafka.enumeration.RetEnum;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 封装的自定义异常
 * @Date 2019/12/10 18:27
 */
public class CustomException extends RuntimeException{
    private Integer code;
    private String message;
    public CustomException(RetEnum retEnum) {
        this.code = retEnum.getRet();
        this.message = retEnum.getMsg();
    }

    public CustomException(String msg) {
        super(msg);
        this.message = msg;
    }

    public CustomException(String msg, Throwable e) {
        super(msg, e);
        this.message = msg;
    }

    public CustomException(String msg, int code, Throwable e) {
        super(msg, e);
        this.message = msg;
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
