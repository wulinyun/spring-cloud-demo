package com.landasoft.demo.springboot.springbootftpsftp.controller;

import com.landasoft.demo.springboot.springbootftpsftp.domain.Message;
import com.landasoft.demo.springboot.springbootftpsftp.service.FileSystemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author 伍林云
 * @date 2019/8/23  18:51
 */
@RestController
@Api(description = "文件操作控制器")
public class FileController {
    @Autowired
    @Qualifier("sftpFileSystemService")
    private FileSystemService fileSystemService;
    private DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    @ApiOperation(value="文件上传")
    @PostMapping("/upload")
    public Message upload(MultipartFile fileUpload){
        //获取文件名
        String fileName = fileUpload.getOriginalFilename();
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //重新生成文件名
        //fileName = UUID.randomUUID()+suffixName;
        //指定服务器文件夹存储图片
        //以日期为文件夹，自己可以根据自己的规则定义文件夹规则
        String filePath = dateFormat.format(new Date())+"/"+fileName;
        try {
            //将图片保存到远程服务器文件夹里
            //fileUpload.transferTo(new File(filePath+fileName));
            fileSystemService.uploadFile(filePath,fileUpload.getInputStream());
            return new Message(0,"success to upload "+filePath);
        } catch (Exception e) {
            e.printStackTrace();
            return new Message(-1,"fail to upload "+filePath);
        }
    }
}
