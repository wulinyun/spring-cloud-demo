package com.landasoft.demo.springboot.kafka.springbootkafka.aop;

import com.landasoft.demo.springboot.kafka.springbootkafka.exception.CustomException;
import com.landasoft.demo.springboot.kafka.springbootkafka.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description BaseControllerExceptionHandler
 * @Date 2019/12/10 18:22
 */
public class BaseControllerExceptionHandler {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    /**
     * 拦截业务异常
     */
    @ExceptionHandler(CustomException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Object notFount(CustomException e) {
        log.error("业务异常:", e);
        return R.fail(e.getCode(), e.getMessage());
    }
}
