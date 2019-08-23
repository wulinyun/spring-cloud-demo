package com.landasoft.demo.springboot.springbootftpsftp.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 伍林云
 * @date 2019/8/23  18:45
 */
@Controller
@Api(description = "页面模板控制器")
public class HtmlController {
    @GetMapping("/uploadFile")
    @ApiOperation(value = "跳转上传文件页面")
    public String uploadFile(){
        return "uploadFile";
    }
}
