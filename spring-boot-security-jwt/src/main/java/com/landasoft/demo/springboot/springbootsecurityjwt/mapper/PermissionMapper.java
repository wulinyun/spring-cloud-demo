package com.landasoft.demo.springboot.springbootsecurityjwt.mapper;

import com.landasoft.demo.springboot.springbootsecurityjwt.entity.RolePermisson;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/21 15:47
 */
@Mapper
public interface PermissionMapper {
    /**
     * 得到所有的权限
     * @return
     */
    @Select( "SELECT A.NAME AS roleName,C.url FROM role AS A LEFT JOIN role_permission B ON A.id=B.role_id LEFT JOIN permission AS C ON B.permission_id=C.id" )
    List<RolePermisson> getRolePermissions();
}
