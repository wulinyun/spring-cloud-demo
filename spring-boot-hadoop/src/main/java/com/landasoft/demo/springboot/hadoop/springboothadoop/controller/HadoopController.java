package com.landasoft.demo.springboot.hadoop.springboothadoop.controller;

import com.landasoft.demo.springboot.hadoop.springboothadoop.util.HdfsClientUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.security.UserGroupInformation;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.PrivilegedExceptionAction;
import java.util.Map;

/**
 * @Author wulinyun
 * @Date 2019/12/3 14:46
 * @Version 1.0
 * Hadoop的hdfs的一些简单操作
 */
@RestController
@RequestMapping("/HadoopController")
public class HadoopController {
    //创建文件夹
    @PostMapping("/mkdir")
    public String mkdir(String mkdirPath) throws Exception {
        return HdfsClientUtils.mkdir(mkdirPath);
    }

    //下载文件
    @GetMapping("/downloadFile")
    public void downloadFile(String inPath, String outPath, int buffSize) throws Exception {
        HdfsClientUtils.downloadFile(inPath,outPath,buffSize);
    }

    //上传文件
    @PostMapping("/uploadFile")
    public void uploadFile(String inPath, String outPath, int buffSize) throws Exception {
        HdfsClientUtils.uploadFile(inPath, outPath,buffSize);
    }

    //删除文件
    @PostMapping("/delete")
    public String delete(String deletePath, boolean recursive) throws Exception {
        return HdfsClientUtils.delete(deletePath,recursive);
    }
    @GetMapping("/getFileList")
     public FileStatus[] getFileList (@RequestParam( name ="path",defaultValue="/dzqz/4200002019006010011574405250/1-0017c6fd-9519-4167-aa35-cc51ad00ff90.JWF") String path) throws IOException{
       return HdfsClientUtils.getFileList(path);
    }

}