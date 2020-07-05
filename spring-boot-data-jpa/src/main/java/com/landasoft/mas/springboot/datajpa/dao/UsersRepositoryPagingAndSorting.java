package com.landasoft.mas.springboot.datajpa.dao;

import com.landasoft.mas.springboot.datajpa.entity.Users;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description PagingAndSortingRepository接口的使用
 * 该接口提供了分页与排序的操作，注意：该接口继承了CrudRepository接口
 * @Date 2020/7/5 21:18
 */
public interface UsersRepositoryPagingAndSorting extends PagingAndSortingRepository<Users,Integer> {
}
