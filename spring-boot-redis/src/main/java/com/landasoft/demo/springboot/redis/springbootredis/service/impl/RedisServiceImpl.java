package com.landasoft.demo.springboot.redis.springbootredis.service.impl;

import com.landasoft.demo.springboot.redis.springbootredis.service.RedisService;
import com.landasoft.demo.springboot.redis.springbootredis.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description Redis的服务操作接口实现
 * @Date 2019/12/23 10:04
 */
@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private RedisUtils redisUtils;
    @Override
    public boolean expire(String key, long timeout) {
        return redisUtils.expire(key,timeout);
    }

    @Override
    public long getExpire(String key) {
        return redisUtils.getExpire(key);
    }

    @Override
    public boolean hasKey(String key) {
        return redisUtils.hasKey(key);
    }

    @Override
    public void del(String... keys) {
        redisUtils.del(keys);
    }

    @Override
    public Object get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public boolean set(String key, Object value) {
        return redisUtils.set(key,value);
    }

    @Override
    public boolean set(String key, Object value, long timeout) {
        return redisUtils.set(key,value,timeout);
    }

    @Override
    public long incr(String key, long delta) {
        return redisUtils.incr(key,delta);
    }

    @Override
    public long decr(String key, long delta) {
        return redisUtils.decr(key,delta);
    }

    @Override
    public Object hget(String key, String hashKey) {
        return redisUtils.hget(key,hashKey);
    }

    @Override
    public Map<Object, Object> hmget(String key) {
        return redisUtils.hmget(key);
    }

    @Override
    public boolean hmset(String key, Map<String, Object> map) {
        return redisUtils.hmset(key,map);
    }

    @Override
    public boolean hmset(String key, Map<String, Object> map, long timeout) {
        return redisUtils.hmset(key,map,timeout);
    }

    @Override
    public boolean hset(String key, String hashKey, Object value, long timeout) {
        return redisUtils.hset(key,hashKey,value,timeout);
    }

    @Override
    public void hdel(String key, Object... hashKeys) {
        redisUtils.hdel(key,hashKeys);
    }

    @Override
    public boolean hHasKey(String key, String hashKey) {
        return redisUtils.hHasKey(key,hashKey);
    }

    @Override
    public double hincr(String key, String hashKey, double delta) {
        return redisUtils.hincr(key,hashKey,delta);
    }

    @Override
    public double hdecr(String key, String hashKey, double delta) {
        return redisUtils.hdecr(key,hashKey,delta);
    }

    @Override
    public Set<Object> sGet(String key) {
        return redisUtils.sGet(key);
    }

    @Override
    public boolean sHasKey(String key, Object value) {
        return redisUtils.sHasKey(key,value);
    }

    @Override
    public long sSet(String key, Object... values) {
        return redisUtils.sSet(key,values);
    }

    @Override
    public long sSet(String key, long timeout, Object... values) {
        return redisUtils.sSet(key,timeout,values);
    }

    @Override
    public long sGetSetSize(String key) {
        return redisUtils.sGetSetSize(key);
    }

    @Override
    public long setRemove(String key, Object... values) {
        return redisUtils.setRemove(key,values);
    }

    @Override
    public List<Object> lGet(String key, long start, long end) {
        return redisUtils.lGet(key,start,end);
    }

    @Override
    public long lGetListSize(String key) {
        return redisUtils.lGetListSize(key);
    }

    @Override
    public Object lGetIndex(String key, long index) {
        return redisUtils.lGetIndex(key,index);
    }

    @Override
    public boolean lSet(String key, Object value) {
        return redisUtils.lSet(key,value);
    }

    @Override
    public boolean lSet(String key, Object value, long timeout) {
        return redisUtils.lSet(key,value,timeout);
    }

    @Override
    public boolean lSet(String key, List<Object> values) {
        return redisUtils.lSet(key,values);
    }

    @Override
    public boolean lSet(String key, List<Object> values, long timeout) {
        return redisUtils.lSet(key,values,timeout);
    }

    @Override
    public boolean lUpdateIndex(String key, long index, Object value) {
        return redisUtils.lUpdateIndex(key,index,value);
    }

    @Override
    public long lRemove(String key, long count, Object value) {
        return redisUtils.lRemove(key,count,value);
    }
}
