package com.landasoft.mas.springboot.datajpa.dao;

import com.landasoft.mas.springboot.datajpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 该接口主要是提供了多条件查询的支持，并且可以在查询中添加排序与分页。注意JPASpecificationExecutor是单独存在的,完全独立
 * @Date 2020/7/5 22:10
 */
public interface UserRepositorySpecification extends JpaRepository<Users,Integer>, JpaSpecificationExecutor<Users> {
}
