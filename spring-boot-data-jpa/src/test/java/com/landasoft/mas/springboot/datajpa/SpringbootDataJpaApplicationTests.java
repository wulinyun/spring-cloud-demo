package com.landasoft.mas.springboot.datajpa;

import com.landasoft.mas.springboot.datajpa.dao.UsersRepository;
import com.landasoft.mas.springboot.datajpa.dao.UsersRepositoryByName;
import com.landasoft.mas.springboot.datajpa.dao.UsersRepositoryCrudRepository;
import com.landasoft.mas.springboot.datajpa.dao.UsersRepositoryQueryAnnotation;
import com.landasoft.mas.springboot.datajpa.entity.Roles;
import com.landasoft.mas.springboot.datajpa.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class SpringbootDataJpaApplicationTests {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UsersRepositoryByName usersRepositoryByName;
    @Autowired
    private UsersRepositoryQueryAnnotation usersRepositoryQueryAnnotation;
    @Autowired
    private UsersRepositoryCrudRepository usersRepositoryCrudRepository;
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
    /**
     * Repository
     */
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
    /**
     * Repository--@Query测试
     */
    @Test
    public void testQueryByNameUseHQL() {
        List<Users> list = this.usersRepositoryQueryAnnotation.queryByNameUseHQL("王五");
        for (Users users : list) {
            System.out.println(users);
        }
    }

    @Test
    public void testQueryByNameUseSQL() {
        List<Users> list = this.usersRepositoryQueryAnnotation.queryByNameUseSQL("王五");
        for (Users users : list) {
            System.out.println(users);
        }
    }
    @Test
    @Transactional
    public void testUpdateUsersNameById() {
        this.usersRepositoryQueryAnnotation.updateUsersNameById("王五", 1);
    }
    /**
     * CrudRepository接口
     */
    @Test
    public void testCrudRepositorySave() {
        Users users=new Users();
        users.setName("青衫");
        users.setAge(30);
        users.setAddress("湖南怀化");
        this.usersRepositoryCrudRepository.save(users);
    }
    @Test
    public void testCrudRepositoryUpdate() {
        Users users=new Users();
        users.setId(4);
        users.setName("青");
        users.setAge(18);
        users.setAddress("怀化");
        this.usersRepositoryCrudRepository.save(users);
    }

    @Test
    public void testCrudRepositoryFindOne() {

        java.util.Optional<Users> users=this.usersRepositoryCrudRepository.findById(4);
        System.out.println(users.get());
    }

    @Test
    public void testCrudRepositoryFindAll() {
        List<Users> list= (List<Users>) this.usersRepositoryCrudRepository.findAll();
        for (Users user:list){
            System.out.println(user);
        }
    }

    @Test
    public void testCrudRepositoryDeleteById() {
        this.usersRepositoryCrudRepository.deleteById(4);

    }
}
