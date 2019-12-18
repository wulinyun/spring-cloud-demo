package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.docindex.repo;

import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.document.StoreDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 门店Repository
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/18 14:14
 */
public interface StoreRepository extends ElasticsearchRepository<StoreDocument,String> {
}
