package com.landasoft.demo.springboot.springbootjar.practice.singleton;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 饿汉式（静态代码块）[可用]
 * 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中
 * @Date 2021/3/11 23:38
 */
public class Singleton4 {
    private static Singleton4 INSTANCE;
    static {
        INSTANCE = new Singleton4();
    }
    private Singleton4(){}
    public static Singleton4 getInstance(){
        return  INSTANCE;
    }
}
