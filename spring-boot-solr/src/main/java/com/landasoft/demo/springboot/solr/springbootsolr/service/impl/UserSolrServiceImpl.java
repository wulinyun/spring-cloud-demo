package com.landasoft.demo.springboot.solr.springbootsolr.service.impl;

import com.alibaba.fastjson.JSON;
import com.landasoft.demo.springboot.solr.springbootsolr.domain.User;
import com.landasoft.demo.springboot.solr.springbootsolr.service.UserSolrService;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.noggit.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 用户solr接口服务实现
 * @Date 2019/12/26 14:14
 */
@Service
public class UserSolrServiceImpl implements UserSolrService {
    private static final String collection = User.class.getAnnotation(org.springframework.data.solr.core.mapping.SolrDocument.class).collection();
    @Autowired
    private SolrClient solrClient;
    @Override
    public User add(User user) {
        try {
            solrClient.addBean(collection,user);
            UpdateResponse updateResponse = solrClient.commit(collection);
            //添加成功
            if(updateResponse.getStatus()==0){
                return user;
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String,Object> delete(String query) {
        Map<String,Object> resultMap = new HashMap<>();
        try {
            solrClient.deleteByQuery(collection,query);
            UpdateResponse updateResponse = solrClient.commit(collection);
            resultMap.put("status",updateResponse.getStatus());
            resultMap.put("QTime",updateResponse.getQTime());
            resultMap.put("msg","删除成功");
            return resultMap;
        } catch (SolrServerException e) {
            e.printStackTrace();
            resultMap.put("status",-1);
            resultMap.put("msg",e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            resultMap.put("status",-1);
            resultMap.put("msg",e.getMessage());
        }
        return resultMap;
    }

    @Override
    public User update(User user) {
        try {
            solrClient.addBean(collection,user);
            UpdateResponse updateResponse = solrClient.commit(collection);
            //添加成功
            if(updateResponse.getStatus()==0){
                return user;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SolrServerException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> query(String query) {
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
    public List<User> queryAll() {
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
    public User queryById(String id) {
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

    @Override
    public Map<String, Object> select(String q, Integer page, Integer size) throws IOException, SolrServerException {
        SolrQuery params = new SolrQuery();
        //查询条件
        params.set("q", q);
        //排序
        params.addSort("id", SolrQuery.ORDER.desc);
        //分页
        params.setStart(page);
        params.setRows(size);
        //默认域
        params.set("df", "user_username");
        //只查询指定域
        params.set("fl", "id,user_username");
        //开启高亮
        params.setHighlight(true);
        //设置前缀
        params.setHighlightSimplePre("<span style='color:red'>");
        //设置后缀
        params.setHighlightSimplePost("</span>");
        //solr数据库是admin
        QueryResponse queryResponse = solrClient.query(collection,params);
        SolrDocumentList results = queryResponse.getResults();
        //数量，分页用
        long total = results.getNumFound();
        //获取高亮显示的结果，高亮显示的结果和查询结果是分开放的
        Map<String,Map<String,List<String>>> hightLight = queryResponse.getHighlighting();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("total", total);
        map.put("data", hightLight);
        return map;

    }
}
