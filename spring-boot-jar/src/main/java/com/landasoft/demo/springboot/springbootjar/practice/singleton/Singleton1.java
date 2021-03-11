package com.landasoft.demo.springboot.springbootjar.practice.singleton;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 双重检查[推荐用]
 * 优点：线程安全；延迟加载；效率较高
 * @Date 2021/3/11 23:20
 */
public class Singleton1 {
    private static volatile Singleton1 singleton1;
    private Singleton1(){ }
    public static Singleton1 getInstance(){
        if(singleton1 == null){
            synchronized(Singleton1.class){
                if(singleton1 == null){
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
