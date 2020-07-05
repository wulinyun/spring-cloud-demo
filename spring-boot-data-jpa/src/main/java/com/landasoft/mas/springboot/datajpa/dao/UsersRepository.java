package com.landasoft.mas.springboot.datajpa.dao;

import com.landasoft.mas.springboot.datajpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2020/7/5 14:17
 */

/**
 * 参数一 T :当前需要映射的实体
 * 参数二 ID :当前映射的实体中的OID的类型
 */
public interface UsersRepository extends JpaRepository<Users,Integer> {
}
