package com.landasoft.mas.springboot.datajpa.dao;

import com.landasoft.mas.springboot.datajpa.entity.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description CrudRepository接口,主要是完成一些增删改查的操作。注意：CrudRepository接口继承了Repository接口
 * @Date 2020/7/5 20:51
 */
public interface UsersRepositoryCrudRepository extends CrudRepository<Users,Integer> {
}
