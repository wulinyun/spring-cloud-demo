package com.landasoft.demo.springboot.springbootjar.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2021/3/12 12:42
 */
public class MyInvocationHandler implements InvocationHandler {
    /**
     * 目标对象
     */
    private Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        Object result = method.invoke(target, args);
        System.out.println("日志记录");
        return result;
    }

}
