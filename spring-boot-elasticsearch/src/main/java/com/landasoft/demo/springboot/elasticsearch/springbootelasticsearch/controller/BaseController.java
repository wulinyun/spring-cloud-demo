package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/17 16:10
 */
public class BaseController {
    @Autowired
    protected HttpServletRequest request;
}
