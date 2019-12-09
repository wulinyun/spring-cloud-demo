package com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.service;

import com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.bean.ESDocument;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description es search
 * @Date 2019/12/9 18:33
 */
public interface DocumentSearchService {
    ESDocument getDocumentById(String id);
    void deleteDocumentById(String id);
    void saveDocument(List<ESDocument> ESDocuments);
    List<ESDocument> getDocumentsByNameOrderByCreateOn(String name,String projectId,String orderField);
    void save(ESDocument esDocument);
    void delete(String id);
    void getById(String id);
    void getByName(String name, String projectId);
}
