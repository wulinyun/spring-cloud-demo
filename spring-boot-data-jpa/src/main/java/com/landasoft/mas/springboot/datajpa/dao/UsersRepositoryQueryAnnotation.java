package com.landasoft.mas.springboot.datajpa.dao;

import com.landasoft.mas.springboot.datajpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2020/7/5 20:19
 */
public interface UsersRepositoryQueryAnnotation extends JpaRepository<Users,Integer> {
    @Query("from Users where name = ?1")
    List<Users> queryByNameUseHQL(String name);
    @Query(value = "select * from t_users where name=?",nativeQuery = true)
    List<Users> queryByNameUseSQL(String name);
    @Query("update Users set name=?1 where id=?2")
    /**
     * 需要执行一个更新操作
     */
    @Modifying
    void updateUsersNameById(String name,Integer id);
}
