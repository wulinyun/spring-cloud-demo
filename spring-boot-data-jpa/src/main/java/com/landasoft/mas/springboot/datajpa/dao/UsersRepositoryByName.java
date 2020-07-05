package com.landasoft.mas.springboot.datajpa.dao;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2020/7/5 19:06
 */

import com.landasoft.mas.springboot.datajpa.entity.Users;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Repository接口方法名称命名查询
 * 方法名称必须要遵循驼峰式命名规则，findBy（关键字）+属性名称（首字母大写）+查询条件（首字母大写）
 */
public interface UsersRepositoryByName extends Repository<Users,Integer> {

    List<Users> findByName(String name);

    List<Users> findByNameAndAge(String name,Integer age);

    List<Users> findByNameLike(String name);
}
