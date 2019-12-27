package com.landasoft.demo.springboot.solr.springbootsolr.domain;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/25 20:02
 */
@Data
@SolrDocument(collection = "admin")
public class User {
    @Id
    @Field
    private String id;
    @Field
    private String user_username;
    @Field
    private String user_sex;
    @Field
    private String user_address;

}
