package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.search.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/17 17:55
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface DefinitionQueryRepeatable {
    DefinitionQuery[] value();
}
