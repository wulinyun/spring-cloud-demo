package com.landasoft.demo.springboot.springbootjar.practice.test.childparentextends;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2021/3/22 12:08
 */
public class ParentDemo {
    public void sayHi(){
        System.out.println("parentDemo say Hi");
    }
    public ParentDemo(){
        System.out.println("before parentDemo say Hi");
        sayHi();
        System.out.println("after parentDemo say Hi");
    }
}
