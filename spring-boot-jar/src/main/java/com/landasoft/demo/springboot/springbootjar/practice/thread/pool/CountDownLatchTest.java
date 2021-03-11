package com.landasoft.demo.springboot.springbootjar.practice.thread.pool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2021/3/10 23:31
 */
public class CountDownLatchTest {
    private static final Logger logger = LoggerFactory.getLogger(CountDownLatchTest.class);
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //初始化CountDownLatch 计数器的值
        CountDownLatch countDownLatch = new CountDownLatch(3);
        try {
            for (int i = 0; i < 3; i++) {
                //创建三个线程, 每个线程执行完后调用countDownLatch 对象的countDown()方法将计数器减1
                executorService.submit(new Callable<List<String>>() {

                    @Override
                    public List<String> call() throws Exception {
                        try {
                            //doSomeThing()
                            Thread.sleep(1000);
                            logger.info(Thread.currentThread().getName() + "线程开始执行");
                        } catch (Exception e) {

                        } finally {
                            countDownLatch.countDown();

                        }
                        return new ArrayList<>();

                    }

                });
            }

            executorService.submit(new Callable<List<String>>() {

                @Override
                public List<String> call() throws Exception {
                    try {
                        //doSomeThing()
                        //当计数器的值变为0之后,调用同一个countDownLatch对象的await()方法的主线程将会被唤醒
                        countDownLatch.await();
                        logger.info("测试线程开始执行");
                    } catch (Exception e) {

                    } finally {

                    }
                    return new ArrayList<>();

                }

            });

        } catch (Exception e) {

        }finally {
            executorService.shutdown();
        }

    }

}
