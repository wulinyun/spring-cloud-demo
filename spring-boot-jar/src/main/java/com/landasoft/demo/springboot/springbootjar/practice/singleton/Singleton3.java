package com.landasoft.demo.springboot.springbootjar.practice.singleton;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 饿汉式（静态常量）[可用]
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 * @Date 2021/3/11 23:35
 */
public class Singleton3 {
    private final static Singleton3 INSTANCE = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return INSTANCE;
    }
}
