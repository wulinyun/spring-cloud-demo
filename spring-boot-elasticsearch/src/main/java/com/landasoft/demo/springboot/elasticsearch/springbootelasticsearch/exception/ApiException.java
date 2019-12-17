package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.exception;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 异常类
 * @Date 2019/12/17 16:31
 */
public class ApiException extends RuntimeException  {
    private String code;
    private String message;

    public ApiException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "ApiException(code=" + this.getCode() + ", message=" + this.getMessage() + ")";
    }
}
