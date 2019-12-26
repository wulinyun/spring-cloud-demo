package com.landasoft.demo.springboot.solr.springbootsolr.domain;

import lombok.Data;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/25 20:02
 */
@Data
public class User {
    private String id;
    private String user_username;
    private String user_sex;
    private String user_address;

}
