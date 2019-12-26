package com.landasoft.demo.springboot.solr.springbootsolr.service.impl;

import com.alibaba.fastjson.JSON;
import com.landasoft.demo.springboot.solr.springbootsolr.domain.User;
import com.landasoft.demo.springboot.solr.springbootsolr.service.UserSolrService;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.noggit.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 用户solr接口服务实现
 * @Date 2019/12/26 14:14
 */
public class UserSolrServiceImpl implements UserSolrService {
    @Autowired
    private SolrClient solrClient;
    @Override
    public void add(User user) {
        try {
            solrClient.addBean(user);
            solrClient.commit();
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String collection,String query) {
        try {
            solrClient.deleteByQuery(collection,query);
            solrClient.commit();
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User update(User user) {
        try {
            solrClient.addBean(user);
            solrClient.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SolrServerException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> query(String collection,String query) {
        List<User> bookList = new ArrayList<User>();
        SolrQuery solrQuery = new SolrQuery();
        //设置默认搜索的域
        solrQuery.set("df", "user_username");
        solrQuery.setQuery(query);
        //高亮显示
        solrQuery.setHighlight(true);
        //设置高亮显示的域
        solrQuery.addHighlightField("user_username");
        //高亮显示前缀
        solrQuery.setHighlightSimplePre("<font color='red'>");
        //后缀
        solrQuery.setHighlightSimplePost("</font>");
        try {
            QueryResponse queryResponse = solrClient.query(collection,solrQuery);
            if (queryResponse == null){
                return null;
            }
            SolrDocumentList solrDocumentList = queryResponse.getResults();
            if (solrDocumentList.isEmpty()){
                return null;
            }
            //获取高亮
            Map<String, Map<String, List<String>>> map = queryResponse.getHighlighting();
            for (SolrDocument solrDocument : solrDocumentList){
                User user;
                List<String> list = map.get(solrDocument.get("id")).get("user_username");
                if (!CollectionUtils.isEmpty(list)){
                    solrDocument.setField("user_username",list.get(0));
                }
                String userStr = JSONUtil.toJSON(solrDocument);
                user = JSON.parseObject(userStr,User.class);
                bookList.add(user);
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public List<User> queryAll(String collection) {
        List<User> userList = new ArrayList<User>();
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.setQuery("*:*");
        try {
            QueryResponse queryResponse = solrClient.query(collection,solrQuery);
            if (queryResponse != null){
                userList = queryResponse.getBeans(User.class);
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public User queryById(String collection,String id) {
        User user = null;
        try {
            SolrDocument solrDocument = solrClient.getById(collection,id);
            String str = JSONUtil.toJSON(solrDocument);
            user = JSON.parseObject(str,User.class);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
