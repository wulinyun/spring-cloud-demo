package com.landasoft.demo.springboot.springbootjar.practice.thread;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 接口Runnable
 * @Date 2021/3/11 23:49
 */
public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("this is started by Runnable");
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
    }
}
