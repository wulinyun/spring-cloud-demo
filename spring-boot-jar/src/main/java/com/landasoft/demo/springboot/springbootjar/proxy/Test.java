package com.landasoft.demo.springboot.springbootjar.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description JDK动态代理
 * @Date 2021/3/12 12:47
 */
public class Test {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        userDao.add();
        System.out.println("--------");

        // 我们要创建一个动态代理对象
        // Proxy类中有一个方法可以创建动态代理对象
        // public static Object newProxyInstance(ClassLoader loader,Class<?>[]
        // interfaces,InvocationHandler h)
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userDao);
        UserDao proxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),myInvocationHandler);
        proxy.add();
    }
}
