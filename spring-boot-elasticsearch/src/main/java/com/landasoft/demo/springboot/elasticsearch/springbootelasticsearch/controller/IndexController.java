package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.controller;

import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.init.InitIndexService;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 索引
 * @Date 2019/12/17 16:26
 */
@RestController
@RequestMapping("/index")
public class IndexController extends BaseController{
    @Resource
    private InitIndexService initIndexService;
    /**
     * 初始化索引、mapping
     * @return ResponseResult
     */
    @GetMapping("/init")
    public ResponseResult init() {
        return ResponseResult.success(initIndexService.initIndex());
    }
}