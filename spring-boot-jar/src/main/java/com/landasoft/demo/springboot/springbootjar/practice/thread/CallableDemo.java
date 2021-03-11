package com.landasoft.demo.springboot.springbootjar.practice.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 接口Callable
 * 接口Runnable和接口Callable的区别
 * 1.Callable可以有返回值。
 * 2.通过FutureTask包装成Runnable，传递给Thread，因为FutureTask是实现了Runnable接口。
 * @Date 2021/3/11 23:53
 */
public class CallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Callable";
    }

    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask(new CallableDemo());
        Thread thread = new Thread(futureTask);
        thread.start();
        try{
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
