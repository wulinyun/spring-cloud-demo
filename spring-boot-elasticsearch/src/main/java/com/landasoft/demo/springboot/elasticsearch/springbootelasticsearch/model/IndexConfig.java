package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.model;

import lombok.Data;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/16 17:59
 */
@Data
public class IndexConfig {
    /**
     * 文档编码
     */
    private String docCode;
    /**
     * 索引名称
     */
    private String indexName;
    /**
     * 索引类型
     */
    private String type;
    /**
     * 索引文档路径
     */
    private String documentPath;
}
