package com.landasoft.demo.springboot.springbootftpsftp.controller;

import com.landasoft.demo.springboot.springbootftpsftp.domain.Message;
import com.landasoft.demo.springboot.springbootftpsftp.service.FileSystemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    @ApiOperation(value="浏览器下载文件")
    @GetMapping("/download")
    public Message download(@RequestParam(value = "targetPath")String targetPath ,HttpServletResponse response) throws Exception{
        // 如果文件名不为空，则进行下载
        File file = fileSystemService.downloadFile(targetPath);
        String fileName = targetPath.substring(targetPath.lastIndexOf("/")+1);
        if (file.exists()) {
            // 如果文件名存在，则进行下载
                // 配置文件下载
                response.setHeader("content-type", "application/octet-stream");
                response.setContentType("application/octet-stream");
                // 下载文件能正常显示中文
                response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode(fileName, "UTF-8"));
                try {
                    OutputStream os = response.getOutputStream();
                    IOUtils.copy(new FileInputStream(file),os);
                    System.out.println("Download the song successfully!");
                }
                catch (Exception e) {
                    System.out.println("Download the song failed!"+e.getMessage());
                }
                finally {
                    System.out.println("getAbsolutePath:"+file.getAbsolutePath());
                    file.delete();
                }
        }
        return null;
    }
    @ApiOperation(value="浏览器显示图片")
    @GetMapping("/showPic")
    public Message showPic(@RequestParam(value = "targetPath")String targetPath ,HttpServletResponse response) throws Exception{
        // 如果文件名不为空，则进行下载
        InputStream inputStream = fileSystemService.getDownloadFileInputStream(targetPath);
        String fileName = targetPath.substring(targetPath.lastIndexOf("/")+1);
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        if (inputStream!=null) {
            // 如果文件名存在，则进行图片展示
            response.setContentType("\"image/"+suffixName.substring(suffixName.lastIndexOf(".")+1)+"\"");
            try {
                OutputStream os = response.getOutputStream();
                IOUtils.copy(inputStream,os);
            }
            catch (Exception e) {
                System.out.println("Show the picture failed!"+e.getMessage());
            }
            finally {
                inputStream.close();
            }
        }
        return null;
    }
}
