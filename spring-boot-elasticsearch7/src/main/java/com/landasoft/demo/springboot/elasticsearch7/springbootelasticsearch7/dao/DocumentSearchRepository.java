package com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.dao;

import com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.bean.ESDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description es dao
 * @Date 2019/12/9 18:30
 */
public interface DocumentSearchRepository extends ElasticsearchRepository<ESDocument,String> {
}
