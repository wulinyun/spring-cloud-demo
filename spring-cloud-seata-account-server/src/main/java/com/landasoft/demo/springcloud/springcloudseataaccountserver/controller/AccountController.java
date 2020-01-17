package com.landasoft.demo.springcloud.springcloudseataaccountserver.controller;

import com.landasoft.demo.springcloud.springcloudseataaccountserver.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2020/1/17 15:23
 */
@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountServiceImpl;
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     * @return
     */
    @RequestMapping("decrease")
    public String decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountServiceImpl.decrease(userId,money);
        accountServiceImpl.decrease(userId,money);
        return "Account decrease success";
    }
}
