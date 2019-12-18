package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.document.store;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/17 18:34
 */
@Data
public class StoreTags {
    @Field(type = FieldType.Keyword)
    private String key;

    @Field(type = FieldType.Keyword)
    private String value;

    private String showName;
}
