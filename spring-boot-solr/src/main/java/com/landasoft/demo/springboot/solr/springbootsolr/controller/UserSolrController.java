package com.landasoft.demo.springboot.solr.springbootsolr.controller;

import com.landasoft.demo.springboot.solr.springbootsolr.domain.User;
import com.landasoft.demo.springboot.solr.springbootsolr.service.UserSolrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/26 18:26
 */
@RestController("/user")
@Api(value = "UserSolrController",tags = "UserSolrController")
public class UserSolrController {
    @Autowired
    private UserSolrService userSolrService;
    @GetMapping("/list")
    public String list(){
        return "user_search";
    }

    @PostMapping("/add")
    @ApiOperation(value = "增加用户")
    public User add(@RequestBody User user){
         return userSolrService.add(user);
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除用户")
    public Map<String,Object> delete(@RequestParam("query") String query){
        return userSolrService.delete(query);
    }

    @GetMapping("/queryAll")
    @ApiOperation(value = "查询所有用户")
    public List<User> queryAll(){
        return userSolrService.queryAll();
    }

    @GetMapping("/queryById")
    @ApiOperation(value = "通过ID查询用户")
    public User queryById(@RequestParam("id")String id){
        return userSolrService.queryById(id);
    }

    @PutMapping("/update")
    @ApiOperation(value = "更新用户")
    public User update(@RequestBody User user){
        return userSolrService.update(user);
    }

    @GetMapping("/query")
    @ApiOperation(value = "通过查询条件查询用户")
    public List<User> query(@RequestParam("query")String query){
        return userSolrService.query(query);
    }
    @GetMapping("/select/{q}/{page}/{size}")
    @ApiOperation(value = "通过查询条件查用户信息分页")
    public Map<String,Object> select(@PathVariable String q, @PathVariable Integer page, @PathVariable Integer size,
                                     @RequestParam(name = "enable",defaultValue = "false")boolean enable,
                                     @RequestParam(name = "keyword",required = false)String ... keyword) throws IOException, SolrServerException {
        return userSolrService.select(enable,q,page,size,keyword);
    }
}
