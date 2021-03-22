package com.landasoft.demo.springboot.springbootjar.practice.exception;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 测试异常
 * @Date 2021/3/22 11:33
 */
public class TestExceptionDemo {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("A");
            throw new Exception();
        }catch (Exception exception){
            System.out.println("B");
            throw new Exception();
            //System.out.println("C");
        }finally {
            System.out.println("D");
        }
        //System.out.println("D");
    }
}
