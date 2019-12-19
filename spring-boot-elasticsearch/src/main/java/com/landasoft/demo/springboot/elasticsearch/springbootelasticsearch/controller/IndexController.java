package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.controller;

import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.init.InitIndexService;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "IndexController",tags = "IndexController")
public class IndexController extends BaseController{
    @Resource
    private InitIndexService initIndexService;
    /**
     * 初始化索引、mapping
     * @return ResponseResult
     */
    @GetMapping("/init")
    @ApiOperation(value = "初始化索引")
    public ResponseResult init() {
        return ResponseResult.success(initIndexService.initIndex());
    }
}
