package com.landasoft.demo.springboot.redis.springbootredis;

import com.landasoft.demo.springboot.redis.springbootredis.bean.RedisUserModel;
import com.landasoft.demo.springboot.redis.springbootredis.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class SpringBootRedisApplicationTests {
    @Autowired
    private RedisService redisService;
    @Test
    void contextLoads() {
    }
    @Test
    public void testRedisString() {
        System.out.println(redisService.set("testRedisString", "testRedisString", 60));
        System.out.println(redisService.get("testRedisString"));
    }
    @Test
    public void testRedisMap() {
        Map<String,Object> map = new HashMap<String,Object>();
        RedisUserModel redisUserModel = new RedisUserModel();
        redisUserModel.setUserName("wulinyun");
        redisUserModel.setUserPaasword("5888888");
        map.put("map1", "map1");
        map.put("map2", "map2");
        map.put("map3", redisUserModel);
        System.out.println(redisService.hmset("testRedisMap", map, 60));
        System.out.println(redisService.hmget("testRedisMap"));
        System.out.println(((RedisUserModel)redisService.hget("testRedisMap", "map3")).getUserName());
    }
    @Test
    public void testRedisSet() {
        Set<Object> set = new HashSet<>();
        set.add("set1");
        set.add("set2");
        set.add("set3");
        RedisUserModel  redisUserModel = new RedisUserModel();
        redisUserModel.setUserName("wulinyun");
        redisUserModel.setUserPaasword("5888888");
        set.add(redisUserModel);
        System.out.println(redisService.sSet("testRedisSet", 60, set.toArray()));
        redisService.setRemove("testRedisSet", redisUserModel);
        System.out.println(redisService.sGet("testRedisSet"));
    }
    @Test
    public void testRedisList() {
        List<Object> list = new ArrayList<>();
        list.add("11111");
        list.add("22222");
        list.add("33333");
        RedisUserModel  redisUserModel = new RedisUserModel();
        redisUserModel.setUserName("55555");
        redisUserModel.setUserPaasword("6666");
        //list.add(redisUserModel);
        System.out.println(redisService.lSet("testRedisList", list, 60));
        System.out.println(redisService.lGet("testRedisList", 0, -1));
    }
}
