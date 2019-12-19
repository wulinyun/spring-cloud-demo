package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch;

import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.docindex.repo.StoreRepository;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.document.StoreDocument;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.document.store.StoreBaseInfo;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import javax.annotation.Resource;

@SpringBootTest
class SpringBootElasticsearchApplicationTests {
    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;
    @Resource
    private StoreRepository storeRepository;
    @Test
    void contextLoads() {
    }

    /**
     * 创建索引，创建映射
     */
    @Test
    public void testCreate(){
        //创建索引
        System.out.println(elasticsearchTemplate.createIndex(StoreDocument.class));
        //创建映射
        System.out.println(elasticsearchTemplate.putMapping(StoreDocument.class));
    }

    /**
     * 新增修改文档
     */
    @Test
    public void testSave(){
        StoreDocument storeDocument = new StoreDocument();
        storeDocument.setId("1");
        StoreBaseInfo baseInfo = new StoreBaseInfo();
        baseInfo.setStoreId("1");
        baseInfo.setCreatedTime(DateTime.now());
        storeDocument.setBaseInfo(baseInfo);
        storeRepository.save(storeDocument);
    }

    /**
     * 删除索引
     */
    @Test
    public void  testDelete(){
        //删除索引
        System.out.println(elasticsearchTemplate.deleteIndex(StoreDocument.class));
    }
}
