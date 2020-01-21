package com.landasoft.demo.springboot.springbootsecurityjwt.entity;

import org.springframework.security.core.GrantedAuthority;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 角色
 * @Date 2020/1/21 15:13
 */
public class Role implements GrantedAuthority {
    private Long id;
    private String name;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getAuthority() {
        return null;
    }
}
