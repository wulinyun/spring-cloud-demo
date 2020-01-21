package com.landasoft.demo.springboot.springbootsecurityjwt.controller;

import com.landasoft.demo.springboot.springbootsecurityjwt.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.AuthenticationException;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/21 16:43
 */
@RestController
public class AuthController {
    @Autowired
    private AuthService authService;
    /**
     * 登录
     */
    @PostMapping(value = "/auth/login")
    public String login( String username,String password ) throws AuthenticationException {
        // 登录成功会返回Token给用户
        return authService.login( username, password );
    }
    @PostMapping(value = "/user/hi")
    public String userHi( String name ) throws AuthenticationException {
        return "hi " + name + " , you have 'user' role";
    }
    @PostMapping(value = "/admin/hi")
    public String adminHi( String name ) throws AuthenticationException {
        return "hi " + name + " , you have 'admin' role";
    }
}
