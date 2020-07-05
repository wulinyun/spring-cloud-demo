package com.landasoft.mas.springboot.datajpa.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 菜单
 * @Date 2020/7/5 22:35
 */
@Entity
@Table(name = "t_menus")
public class Menus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menus_id")
    private Integer menusId;
    @Column(name = "menus_name")
    private String menusName;
    @Column(name = "menus_url")
    private String menusUrl;
    @Column(name = "father_id")
    private Integer fatherId;
    @ManyToMany(mappedBy = "menus")
    private Set<Roles> roles=new HashSet<>();

    public Integer getMenusId() {
        return menusId;
    }

    public void setMenusId(Integer menusId) {
        this.menusId = menusId;
    }

    public String getMenusName() {
        return menusName;
    }

    public void setMenusName(String menusName) {
        this.menusName = menusName;
    }

    public String getMenusUrl() {
        return menusUrl;
    }

    public void setMenusUrl(String menusUrl) {
        this.menusUrl = menusUrl;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Menus{");
        sb.append("menusId=").append(menusId);
        sb.append(", menusName='").append(menusName).append('\'');
        sb.append(", menusUrl='").append(menusUrl).append('\'');
        sb.append(", fatherId=").append(fatherId);
        sb.append('}');
        return sb.toString();
    }
}
