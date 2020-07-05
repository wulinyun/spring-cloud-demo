package com.landasoft.mas.springboot.datajpa.dao;

import com.landasoft.mas.springboot.datajpa.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 角色持久操作层
 * @Date 2020/7/5 22:52
 */
public interface RolesRepository extends JpaRepository<Roles,Integer> {
}
