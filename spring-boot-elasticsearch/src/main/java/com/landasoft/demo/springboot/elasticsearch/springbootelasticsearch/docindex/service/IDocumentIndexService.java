package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.docindex.service;

import java.util.Map;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/18 14:17
 */
public interface IDocumentIndexService {
    /**
     * 加载扩展数据
     * @param sourceData 原数据
     */
    void loadExpansion(Map sourceData);
}
