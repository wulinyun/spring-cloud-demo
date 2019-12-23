package com.landasoft.demo.springboot.redis.springbootredis.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description Redis的服务操作接口定义
 * @Date 2019/12/23 9:28
 */
public interface RedisService {
    /**
     * 指定缓存失效时间
     * @param key 键
     * @param timeout 时间(秒)
     * @return true 设置成功，false 异常
     */
    public boolean expire(String key,long timeout);
    /**
     * 根据key获取失效时间
     * @param key 键 不能为null
     * @return 时间(秒) 返回0代表为永久有效
     */
    public long getExpire(String key);
    /**
     * 判断key是否存在
     * @param key 键
     * @return true 存在 false 不存在
     */
    public boolean hasKey(String key);
    /**
     * 删除key对应缓存
     * @param keys key的键值列表
     */
    public void del(String... keys);
    /**
     * 普通缓存获取
     * @param key 键
     * @return 值
     */
    public Object get(String key);
    /**
     * 普通缓存放入
     * @param key 键
     * @param value 值
     * @return true 成功 false 失败
     */
    public boolean set(String key,Object value);
    /**
     * 普通缓存放入并且设置失效时间
     * @param key 键
     * @param value 值
     * @param timeout 时间(秒) timeout要大于0 如果time小于等于0 将设置无限期
     * @return true 成功 false 失败
     */
    public boolean set(String key,Object value,long timeout);
    /**
     * 普通缓存递增
     * @param key 键
     * @param delta 要增加几(大于0)
     * @return long 递增之后的值
     */
    public long incr(String key, long delta);
    /**
     * 普通缓存递减
     * @param key 键
     * @param delta 要减少几(大于0)
     * @return long 递减之后的值
     */
    public long decr(String key, long delta);
    /**
     * HashGet
     * @param key 键 不能为null
     * @param hashKey 项 不能为null
     * @return Object 值
     */
    public Object hget(String key, String hashKey);
    /**
     * 获取hashkey对应的所有键值
     * @param key 键
     * @return 对应的多个键值
     */
    public Map<Object,Object> hmget(String key);
    /**
     * HashSet 设置缓存
     * @param key 键
     * @param map 对应多个键值
     * @return true 成功 false失败
     */
    public boolean hmset(String key,Map<String,Object> map);
    /**
     * HashSet 设置缓存并设置失效时间
     * @param key 键
     * @param map 对应多个键值
     * @return true 成功 false失败
     */
    public boolean hmset(String key,Map<String,Object> map,long timeout);
    /**
     * 向一张hash表中放入数据，如果不存在将创建
     * @param key 键
     * @param hashKey 项
     * @param value 值
     * @param timeout 时间（秒）注意如果已存在的hash表中有时间，这里将会替换原有的时间
     * @return true 成功， false 失败
     */
    public boolean hset(String key,String hashKey,Object value,long timeout);
    /**
     * 删除hash表中值
     * @param key 键 不能为null
     * @param hashKeys 项 可以多个 不能为null
     */
    public void hdel(String key,Object... hashKeys);
    /**
     * 判断hash表中是否有该项的值
     * @param key 键 不能为null
     * @param hashKey 项 不能为null
     * @return true 存在 false 不存在
     */
    public boolean hHasKey(String key ,String hashKey);
    /**
     *hash递增 如果不存在，就会创建一个并把新增后的值返回
     * @param key 键
     * @param hashKey 项
     * @param delta 要增加几（大于0）
     * @return double 递增之后的返回值
     */
    public double hincr(String key, String hashKey, double delta);
    /**
     *hash递减 如果不存在，就会创建一个并把新增后的值返回
     * @param key 键
     * @param hashKey 项
     * @param delta 要减少几（大于0）
     * @return double 递减之后的值
     */
    public double hdecr(String key, String hashKey, double delta);
    /**
     * 根据key获取Set中的所有值
     * @param key 键
     * @return  Set<Object> set值列表
     */
    public Set<Object> sGet(String key);
    /**
     *根据value从一个set中查询是否存在
     * @param key 键
     * @param value 值
     * @return true 存在 false 不存在
     */
    public boolean sHasKey(String key, Object value);
    /**
     * 将数据放入set缓存
     * @param key 键
     * @param values 值 可以是多个
     * @return 成功个数
     */
    public long sSet(String key,Object... values);
    /**
     * 将数据放入set缓存并设置失效时间
     * @param key 键
     * @param timeout 时间（秒）
     * @param values 值 可以是多个
     * @return 成功个数
     */
    public long sSet(String key,long timeout,Object... values);
    /**
     *获取set缓存长度
     * @param key 键
     * @return long set缓存长度
     */
    public long sGetSetSize(String key);
    /**
     *移除set中key对应的多个值
     * @param key 键
     * @param values 可变参数的多个值
     * @return long 移除的个数
     */
    public long setRemove(String key,Object... values);
    /**
     * 获取list缓存内容
     * @param key 键
     * @param start 开始
     * @param end 结束  0到-1代表所有值
     * @return List<Object> 值列表数组
     */
    public List<Object> lGet(String key, long start , long end);
    /**
     * 获取list缓存的长度
     * @param key 键
     * @return long list缓存的长度
     */
    public long lGetListSize(String key);
    /**
     * 通过键和索引获取list中的值
     * @param key 键
     * @param index index>=0时 0 表头，1 第二个元素，依次类推；index<0时，-1 表尾，-2倒数第二个元素依次类推
     * @return Object list数组中的项
     */
    public Object lGetIndex(String key , long index);
    /**
     * 将list项放入缓存
     * @param key 键
     * @param value 值
     * @return boolean 是否放入成功
     */
    public boolean lSet(String key, Object value);
    /**
     *将list项放入缓存并设置失效时间
     * @param key 键
     * @param value 值
     * @param timeout 时间秒
     * @return boolean list项是否放入成功
     */
    public boolean lSet(String key, Object value, long timeout);
    /**
     * 将list数组放入缓存
     * @param key 键
     * @param values 值
     * @return boolean 是否放入成功
     */
    public boolean lSet(String key,List<Object> values);
    /**
     * 将list放入缓存并设置失效时间
     * @param key 键
     * @param values 值
     * @param timeout 时间（秒）
     * @return boolean 是否设置成功
     */
    public boolean lSet(String key,List<Object> values, long timeout);
    /**
     * 根据索引修改list中的某项数据
     * @param key 键
     * @param index 索引
     * @param value 值
     * @return boolean 是否修改成功
     */
    public boolean lUpdateIndex(String key,long index,Object value);
    /**
     * 移除N个值为value项
     * @param key 键
     * @param count 移除多少个
     * @param value 值
     * @return long 移除的个数
     */
    public long lRemove(String key, long count , Object value);

}
