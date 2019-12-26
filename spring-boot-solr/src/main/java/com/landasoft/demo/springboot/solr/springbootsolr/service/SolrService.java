package com.landasoft.demo.springboot.solr.springbootsolr.service;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description Solr服务接口定义
 * @Date 2019/12/26 13:57
 */
public interface SolrService<T> {
    void add(T t);
    void delete(String collection,String query);
    T update(T t);
    List<T> query(String collection,String query);
    List<T> queryAll(String collection);
    T queryById(String collection,String id);
}
