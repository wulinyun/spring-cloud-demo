package com.landasoft.demo.springboot.springbootjar.practice.test;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2021/3/22 12:08
 */
public class ChildDemo extends ParentDemo{
    private String name;
    public ChildDemo(String name){
        this.name = name;
    }
    public void sayHi(){
        System.out.println(this.name + " say Hi");
    }
}
