package com.landasoft.mas.springboot.datajpa;

import com.landasoft.mas.springboot.datajpa.dao.RolesRepository;
import com.landasoft.mas.springboot.datajpa.entity.Menus;
import com.landasoft.mas.springboot.datajpa.entity.Roles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.Set;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2020/7/5 22:54
 */
@SpringBootTest
public class ManyToManyTest {
    @Autowired
    private RolesRepository rolesRepository;
    /**
     * 添加测试
     */
    @Test
    public void testSave(){
        //创建角色对象
        Roles roles=new Roles();
        roles.setRoleName("项目经理");
        //创建菜单对象
        Menus menus=new Menus();
        menus.setMenusName("xxxx管理系统");
        menus.setFatherId(0);

        Menus menus2=new Menus();
        menus2.setFatherId(1);
        menus2.setMenusName("项目管理");
        //关联
        roles.getMenus().add(menus);
        roles.getMenus().add(menus2);
        menus.getRoles().add(roles);
        menus2.getRoles().add(roles);
        //保存
        this.rolesRepository.save(roles);
    }

    /**
     * 查询操作
     */
    @Test
    public void testFind(){
        Optional<Roles> roles=this.rolesRepository.findById(2);
        System.out.println(roles.get().getRoleName());
        Set<Menus> menus=roles.get().getMenus();
        for (Menus menu:menus){
            System.out.println(menu);
        }
    }
}
