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
    void add(T t);
    UpdateResponse delete(String query);
    T update(T t);
    List<T> query(String query);
    List<T> queryAll();
    T queryById(String id);
    Map<String,Object> select(String q, Integer page, Integer size) throws IOException, SolrServerException;
}
