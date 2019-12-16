package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.model;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/16 14:19
 */
public class Key {
    private String key;
    public Key(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}
