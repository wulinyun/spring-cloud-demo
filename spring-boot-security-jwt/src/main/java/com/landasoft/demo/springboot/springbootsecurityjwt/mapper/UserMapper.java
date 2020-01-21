package com.landasoft.demo.springboot.springbootsecurityjwt.mapper;

import com.landasoft.demo.springboot.springbootsecurityjwt.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/21 15:34
 */
@Mapper
public interface UserMapper {
    /**
     * 通过名字查找用户
     * @param username
     * @return
     */
    @Select( "select id , username , password from user where username = #{username}" )
    User loadUserByUsername(@Param("username") String username);
}
