package com.landasoft.demo.springboot.elasticsearch7.springbootelasticsearch7.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @Author wulinyun
 * @Date 2019/12/9 17:44
 * @Version 1.0
 * @Description es bean
 */
@Data
@Document(indexName = "poms", type = "content")
public class ESDocument {
    @Id
    private String id;
    @Field(analyzer = "ik_smart", searchAnalyzer = "ik_smart")
    private String name;
    private String projectId;
    public ESDocument(String id, String name, String projectId) {
        this.id = id;
        this.name = name;
        this.projectId = projectId;
    }
    public ESDocument() {

    }
}
