package com.landasoft.mas.springboot.mybatis.generator.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.landasoft.mas.springboot.mybatis.generator.entity.MemberGlobal;
import com.landasoft.mas.springboot.mybatis.generator.entity.MemberGlobalExample;
import com.landasoft.mas.springboot.mybatis.generator.page.PageModel;
import com.landasoft.mas.springboot.mybatis.generator.service.MemberGlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2020/6/24 0:23
 */
@RestController
@RequestMapping("/member")
public class MemberGlobalController {
    @Autowired
    private MemberGlobalService memberGlobalService;
    @GetMapping("/")
    public String index() {
        return "hello user";
    }
    @GetMapping("/queryMemberById")
    public MemberGlobal selectUserById(Long id) {
        System.out.println("id:" + id);
        MemberGlobal memberGlobal = memberGlobalService.selectByPrimaryKey(id);
        System.out.println(memberGlobal.toString());
        return memberGlobal;
    }

    @GetMapping("/queryMemberByPage")
    public PageModel<MemberGlobal> queryMemberByPage(int pageIndex, int pageSize){
        MemberGlobalExample memberGlobalExample = new MemberGlobalExample();
        //MemberGlobalExample.Criteria criteria = memberGlobalExample.or();
        PageHelper.startPage(pageIndex,pageSize);
        List<MemberGlobal> memberGlobalList = memberGlobalService.selectByExample(memberGlobalExample);
        PageInfo<MemberGlobal> pageInfo = new PageInfo<MemberGlobal>(memberGlobalList);
        return  new PageModel<MemberGlobal>(pageIndex,pageSize,pageInfo.getTotal(),memberGlobalList);
    }

}
