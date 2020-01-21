package com.landasoft.demo.springboot.springbootsecurityjwt.entity;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 角色权限
 * @Date 2020/1/21 15:32
 */
public class RolePermisson {
    private String url;
    private String roleName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
