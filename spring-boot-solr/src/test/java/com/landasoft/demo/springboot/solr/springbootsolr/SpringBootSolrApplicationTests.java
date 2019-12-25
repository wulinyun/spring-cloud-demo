package com.landasoft.demo.springboot.solr.springbootsolr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class SpringBootSolrApplicationTests {
    private static final String URL = "http://192.168.223.133:8983/solr";
    private static final String CORE = "/admin";
    @Test
    void contextLoads() {
    }
    @Test
    void testAddUser () throws IOException, SolrServerException {
        //添加Document
        HttpSolrClient solr = new HttpSolrClient.Builder(URL + CORE).withConnectionTimeout(10000).withSocketTimeout(60000).build();
        SolrInputDocument doc = new SolrInputDocument();
        doc.setField("id", "1001");
        doc.setField("user_username", "ch");
        doc.setField("user_address", "26");
        solr.add(doc);
        solr.commit();

        SolrInputDocument doc2 = new SolrInputDocument();
        doc2.setField("id", "1002");
        doc2.setField("user_username", "button");
        doc2.setField("user_address", "26");
        solr.add(doc2);
        solr.commit();

    }
    @Test
    void testQuery() throws IOException, SolrServerException {
        HttpSolrClient solr = new HttpSolrClient.Builder(URL + CORE).withConnectionTimeout(10000).withSocketTimeout(60000).build();
        SolrInputDocument doc = new SolrInputDocument();
        SolrQuery query = new SolrQuery();
        //设置solr查询参数
        query.set("q", "id:1001");
        //获取查询结果
        QueryResponse response = solr.query(query);
        //查询得到文档的集合
        SolrDocumentList solrDocumentList = response.getResults();
        System.out.println("查询结果的总数量：" + solrDocumentList.getNumFound());
        for (SolrDocument solrDocument : solrDocumentList) {
            System.out.println(solrDocument.get("id"));
            System.out.println(solrDocument.get("user_username"));
        }
        //关闭连接
        solr.close();

    }
    @Test
    void testDeleteOne() throws IOException, SolrServerException {
        HttpSolrClient solr = new HttpSolrClient.Builder(URL + CORE).withConnectionTimeout(10000).withSocketTimeout(60000).build();
        //删除文档
        solr.deleteById("1001");
        solr.commit();
        //关闭连接
        solr.close();
    }
    @Test
    void testDeleteAll() throws IOException, SolrServerException {
        HttpSolrClient solr = new HttpSolrClient.Builder(URL + CORE).withConnectionTimeout(10000).withSocketTimeout(60000).build();
        //删除所有
        solr.deleteByQuery("*:*");
        solr.commit();
        //关闭连接
        solr.close();
    }
}
