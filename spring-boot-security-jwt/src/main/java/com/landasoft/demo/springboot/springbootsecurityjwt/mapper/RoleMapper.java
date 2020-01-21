package com.landasoft.demo.springboot.springbootsecurityjwt.mapper;

import com.landasoft.demo.springboot.springbootsecurityjwt.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/21 15:36
 */
@Mapper
public interface RoleMapper {
    @Select( "SELECT A.id,A.name FROM role A LEFT JOIN user_role B ON A.id=B.role_id WHERE B.user_id=${userId}" )
    List<Role> getRolesByUserId(@Param("userId") Long userId);
}
