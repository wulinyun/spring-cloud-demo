package com.landasoft.demo.springboot.solr.springbootsolr.service;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.UpdateResponse;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description Solr服务接口定义
 * @Date 2019/12/26 13:57
 */
public interface SolrService<T> {
    T add(T t);
    Map<String,Object> delete(String query);
    T update(T t);
    List<T> query(String query);
    List<T> queryAll();
    T queryById(String id);

    /**
     * 分页查询用户数据（当开启关键字查询功能时为关键字查询）
     * @param enable 是否开启，true开启 false关闭
     * @param q 查询条件
     * @param page 页面
     * @param size  页大小
     * @param keyword 默认域以及指定域关键字
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    Map<String,Object> select(boolean enable,String q, Integer page, Integer size,String... keyword) throws IOException, SolrServerException;
}
