package com.landasoft.mas.springboot.datajpa;

import com.landasoft.mas.springboot.datajpa.dao.UsersRepository;
import com.landasoft.mas.springboot.datajpa.dao.UsersRepositoryByName;
import com.landasoft.mas.springboot.datajpa.entity.Roles;
import com.landasoft.mas.springboot.datajpa.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootDataJpaApplicationTests {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UsersRepositoryByName usersRepositoryByName;
    @Test
    void contextLoads() {
    }
    @Test
    public void testSave(){
        Users users = new Users();
        users.setAddress("上海市");
        users.setAge(29);
        users.setName("王五");
        Roles roles1 = new Roles();
        roles1.setRoleName("角色1");
        Roles roles2 = new Roles();
        roles2.setRoleName("角色2");
        users.setRoles(roles1);
        this.usersRepository.save(users);
    }
    @Test
    public void testDelete(){
        Users users = new Users();
        users.setId(1);
        users.setAddress("上海市");
        users.setAge(29);
        users.setName("王五");
        //this.usersRepository.deleteById(1);
        this.usersRepository.delete(users);
    }
    @Test
    public void usersRepositoryByName(){
        List<Users> list = this.usersRepositoryByName.findByName("王五");
        for(Users users : list){
            System.out.println(users.toString());
        }

    }
    @Test
    public void usersRepositoryByNameAndAge(){
        List<Users> usersList = this.usersRepositoryByName.findByNameAndAge("王五",29);
        for(Users users:usersList){
            System.out.println(users.toString());
        }
    }
    @Test
    public void findByNameLike(){
        List<Users> usersList = this.usersRepositoryByName.findByNameLike("王%");
        for(Users users:usersList){
            System.out.println(users.toString());
        }
    }
}
