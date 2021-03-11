package com.landasoft.demo.springboot.springbootjar.practice.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description Executors工厂方法创建
 * @Date 2021/3/12 0:07
 */
public class TestThreadPoolExecutor {
    //创建使用单个线程的线程池
    public static void testEs1(){
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        for(int i =0; i<10; i++){
            es1.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" doing task print" );
                }
            });
        }
        es1.shutdown();
    }

    //创建使用固定线程数的线程池
    public static void testEs2(){
        ExecutorService es2 = Executors.newFixedThreadPool(3);
        for(int i = 0; i<10; i++){
            es2.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " doing task");
                }
            });
        }
        es2.shutdown();
    }

    //创建一个会根据需要创建新线程的线程池
    public static void testEs3(){
        ExecutorService es3 = Executors.newCachedThreadPool();
        for(int i = 0; i<20; i++){
            es3.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " doing task");
                }
            });
        }
        es3.shutdown();
    }

    //创建拥有固定线程数量的定时线程任务的线程池
    public static void testEs4(){
        ScheduledExecutorService es4 = Executors.newScheduledThreadPool(2);
        System.out.println("时间：" + System.currentTimeMillis());
        for (int i = 0; i<5; i++){
            es4.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("时间："+System.currentTimeMillis()+"--"+Thread.currentThread().getName() + "正在执行任务");
                }
            },3, TimeUnit.SECONDS);
        }
        es4.shutdown();
    }

    //创建只有一个线程的定时线程任务的线程池
    public static void testEs5(){
        ScheduledExecutorService es5 = Executors.newSingleThreadScheduledExecutor();
        System.out.println("时间：" + System.currentTimeMillis());
        for (int i = 0; i<5; i++){
            es5.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("时间："+System.currentTimeMillis()+"--"+Thread.currentThread().getName() + "正在执行任务");
                }
            },3, TimeUnit.SECONDS);
        }
        es5.shutdown();
    }

    public static void main(String[] args) {
        //testEs1();
        //testEs2();
        //testEs3();
        //testEs4();
        testEs5();
    }
}
