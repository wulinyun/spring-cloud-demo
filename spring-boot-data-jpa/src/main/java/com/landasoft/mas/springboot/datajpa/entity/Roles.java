package com.landasoft.mas.springboot.datajpa.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 角色实体
 * @Date 2020/7/5 14:13
 */
@Entity
@Table(name = "t_roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;
    @Column(name = "role_name")
    private String roleName;
    @OneToMany(mappedBy = "roles")
    private Set<Users> users=new HashSet<>();
    /**
     * FetchType.LAZY：懒加载，加载一个实体时，定义懒加载的属性不会马上从数据库中加载
     *
     * FetchType.EAGER：急加载，加载一个实体时，定义急加载的属性会立即从数据库中加载
     */
    @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    /**
     * 映射中间表  joinColumns:当前表中的主键关联中间表的外键
     */
    @JoinTable(name = "t_roles_menus",joinColumns =@JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "menu_id"))
    private Set<Menus> menus=new HashSet<>();

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }

    public Set<Menus> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menus> menus) {
        this.menus = menus;
    }
}
