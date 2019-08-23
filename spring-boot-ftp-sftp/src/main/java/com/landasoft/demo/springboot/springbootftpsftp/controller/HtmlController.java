package com.landasoft.demo.springboot.springbootftpsftp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 伍林云
 * @date 2019/8/23  18:45
 */
@Controller
public class HtmlController {
    @RequestMapping("/uploadFile")
    public String uploadFile(){
        return "uploadFile";
    }
}
