package com.landasoft.demo.springboot.springbootsecurityjwt.service.impl;

import com.landasoft.demo.springboot.springbootsecurityjwt.entity.Role;
import com.landasoft.demo.springboot.springbootsecurityjwt.entity.User;
import com.landasoft.demo.springboot.springbootsecurityjwt.mapper.RoleMapper;
import com.landasoft.demo.springboot.springbootsecurityjwt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 用户详情服务实现
 * @Date 2020/1/21 15:58
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //查数据库
        User user = userMapper.loadUserByUsername( userName );
        if (null != user) {
            List<Role> roles = roleMapper.getRolesByUserId( user.getId() );
            user.setAuthorities( roles );
        }
        return user;
    }
}
