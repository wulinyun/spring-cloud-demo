package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.model;

import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.search.enums.QueryTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/16 15:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FieldDefinition {
    /**
     * 查询参数
     */
    private String key;
    /**
     * 查询类型
     */
    private QueryTypeEnum queryType;
    /**
     * 查询参数对应的文档中的字段
     */
    private String queryField;
    /**
     * from后缀
     */
    private String fromSuffix;
    /**
     * to后缀
     */
    private String toSuffix;
    /**
     * 分隔符
     */
    private String separator;
    /**
     * 嵌套查询的路径
     */
    private String nestedPath;

}
