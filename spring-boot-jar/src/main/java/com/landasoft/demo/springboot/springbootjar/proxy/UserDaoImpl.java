package com.landasoft.demo.springboot.springbootjar.proxy;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 用户接口实现类
 * @Date 2021/3/12 12:40
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("添加功能");
    }
}
