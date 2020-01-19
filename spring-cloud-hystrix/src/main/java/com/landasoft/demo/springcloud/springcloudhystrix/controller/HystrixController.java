package com.landasoft.demo.springcloud.springcloudhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 断路器控制器
 * @Date 2020/1/14 10:09
 */
@RestController
public class HystrixController {
    @GetMapping("/")
    public String hello(){
        return "this is hystrix controller";
    }
    @HystrixCommand(fallbackMethod = "getNameFallback",
    threadPoolKey = "hystrixControllerThreadPool",
    threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "30"),
            @HystrixProperty(name = "maxQueueSize", value = "10")
    })
    @GetMapping("/test")
    public String testHystrix(String username){
        randomlyRunLong();
        return "randomlyRunLong"+username;
    }
    // 1/3的机率会让线程睡3秒
    private void randomlyRunLong() {
        Random rand = new Random();
        int randomNum = rand.nextInt(3) + 1;
        if (randomNum == 3) sleep();
    }

    //线程睡3秒
    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 出错后会调用该降级方法，返回指定的信息
     *
     * @param username
     * @return
     */
    public String getNameFallback(String username) {
        return " this username is not exist ";
    }
}
