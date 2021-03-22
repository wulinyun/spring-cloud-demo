package com.landasoft.demo.springboot.springbootjar.practice.thread;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 测试线程使用join控制顺序
 * @Date 2021/3/22 11:20
 */
public class TestThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("B");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("A");
        TestThreadDemo testThreadDemo = new TestThreadDemo();
        testThreadDemo.start();
        System.out.println("C");
        testThreadDemo.join();
        System.out.println("D");
    }
}
