package com.landasoft.demo.springboot.springbootsecurityjwt.service;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 认证接口
 * @Date 2020/1/21 15:51
 */
public interface AuthService {
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    String login( String username, String password );
}
