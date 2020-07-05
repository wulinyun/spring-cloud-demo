package com.landasoft.mas.springboot.datajpa;

import com.landasoft.mas.springboot.datajpa.dao.*;
import com.landasoft.mas.springboot.datajpa.entity.Roles;
import com.landasoft.mas.springboot.datajpa.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.annotation.Rollback;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
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
    @Autowired
    private UsersRepositoryPagingAndSorting usersRepositoryPagingAndSorting;
    @Autowired
    private UserRepositorySpecification userRepositorySpecification;
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
     * JpaRepository	排序测试
     */
    @Test
    public void testJpaRepositorySort(){
        //Order	定义了排序规则
        Sort.Order order=new Sort.Order(Sort.Direction.DESC,"id");
        //Sort对象封装了排序规则
        Sort sort=Sort.by(order);
        List<Users> list= this.usersRepository.findAll(sort);
        for (Users users:list){
            System.out.println(users);
        }
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
    /**
     *PagingAndSortingRepository接口
     */
    @Test
    public void testPagingAndSortingRepositorySort(){
        //Order	定义了排序规则
        Sort.Order order = new Sort.Order(Sort.Direction.ASC,"id");
        //Sort对象封装了排序规则
        Sort sort=Sort.by(order);
        List<Users> list= (List<Users>) this.usersRepositoryPagingAndSorting.findAll(sort);
        for (Users users:list){
            System.out.println(users);
        }
    }
    @Test
    public void testPagingAndSortingRepositoryPageing(){
        //Pageable:封装了分页的参数，当前页，每页显示的条数。注意：它的当前页是从0开始
        //PageRequest(page,size):page表示当前页，size表示每页显示多少条
        Sort sort=Sort.by(new Sort.Order(Sort.Direction.DESC,"id"));
        //Pageable pageable = PageRequest.of(1,2);
        Pageable pageable = PageRequest.of(1,2,sort);
        Page<Users> page=this.usersRepositoryPagingAndSorting.findAll(pageable);
        System.out.println("数据的总条数："+page.getTotalElements());
        System.out.println("总页数："+page.getTotalPages());
        List<Users> list=page.getContent();
        for (Users users:list){
            System.out.println(users);
        }
    }
    /**
     * JpaSpecificationExecutor	 单条件查询
     */
    @Test
    public void testJpaSpecificationExecutor1(){
        /**
         * Specification:用于封装查查询条件
         */
        Specification<Users> spec = new Specification<Users>() {
            //Predicate：封装了单个查询条件

            /**
             *
             * @param root 对查询对象属性的封装
             * @param criteriaQuery 	封装了我们要执行的查询中的各个部分的信息，select from order
             * @param criteriaBuilder 查询条件的构造器
             * @return
             */
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //where name="张三"
                /**
                 *
                 */
                Predicate predicate = criteriaBuilder.equal(root.get("name"),"王五");
                return predicate;
            }
        };
        List<Users> list=this.userRepositorySpecification.findAll(spec);
        for (Users users:list){
            System.out.println(users);
        }
    }
    /**
     * JpaSpecificationExecutor		多条件查询方式一
     */
    @Test
    public void testJpaSpecificationExecutor2() {
        /**
         * Specification:用于封装查查询条件
         */
        Specification<Users> spec=new Specification<Users>() {
            //Predicate：封装了单个查询条件

            /**
             * @param root		对查询对象属性的封装
             * @param criteriaQuery	封装了我们要执行的查询中的各个部分的信息，select from order
             * @param criteriaBuilder	查询条件的构造器
             * @return
             */
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //where name="张三" and age=20
                /**
                 * 参数一：查询的属性
                 * 参数二：条件的值
                 */
                List<Predicate> list=new ArrayList<>();
                list.add(criteriaBuilder.equal(root.get("name"),"王五"));
                list.add(criteriaBuilder.equal(root.get("age"),20));
                Predicate[] arr=new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(arr));
                //(name='张三' and age=20) or id=2
                //return criteriaBuilder.or(criteriaBuilder.and(criteriaBuilder.equal(root.get("name"),"王五"),criteriaBuilder.equal(root.get("age"),20)),criteriaBuilder.equal(root.get("id"),1));
            }
        };
        List<Users> list=this.userRepositorySpecification.findAll(spec);
        for (Users users:list){
            System.out.println(users);
        }
    }
}
