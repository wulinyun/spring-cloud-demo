package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.document;

import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.document.store.StoreBaseInfo;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.document.store.StoreTags;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.search.annotation.DefinitionQuery;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.search.enums.QueryTypeEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 门店Document
 * @Date 2019/12/17 17:50
 */
@Document(indexName = "store", type = "base")
@Data
@DefinitionQuery(key = "page", type = QueryTypeEnum.IGNORE)
@DefinitionQuery(key = "size", type = QueryTypeEnum.IGNORE)
@DefinitionQuery(key = "q", type = QueryTypeEnum.FULLTEXT)
public class StoreDocument {
    @Id
    @DefinitionQuery(type = QueryTypeEnum.IN)
    @DefinitionQuery(key = "id", type = QueryTypeEnum.IN)
    @Field(type = FieldType.Keyword)
    private String id;

    /**
     * 基础信息
     */
    @Field(type = FieldType.Object)
    private StoreBaseInfo baseInfo;

    /**
     * 标签
     */
    @Field(type = FieldType.Nested)
    @DefinitionQuery(key = "tagCode", mapped = "tags.key", type = QueryTypeEnum.IN)
    @DefinitionQuery(key = "tagValue", mapped = "tags.value", type = QueryTypeEnum.AND)
    @DefinitionQuery(key = "_tagValue", mapped = "tags.value", type = QueryTypeEnum.IN)
    private List<StoreTags> tags;

}
