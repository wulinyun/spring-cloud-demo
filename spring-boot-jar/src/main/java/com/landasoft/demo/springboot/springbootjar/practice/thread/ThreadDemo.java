package com.landasoft.demo.springboot.springbootjar.practice.thread;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 类Thread
 * @Date 2021/3/11 23:43
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("this is started by thread");
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
    }
}
