package com.landasoft.demo.springboot.hadoop.springboothadoop;

import com.landasoft.demo.springboot.hadoop.springboothadoop.controller.HadoopController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class SpringBootHadoopApplicationTests {
    @Autowired
    private HadoopController hadoopController;
    @Test
    void contextLoads() {
    }
    @Test
    public void mkdir() throws Exception {
        String hello = hadoopController.mkdir("/dzqz/test");
        System.out.println(hello);
    }
    @Test
    public void deleteDir(){
        String deletePath = "/dzqz/test";
        try {
            hadoopController.delete(deletePath,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void uploadFile() throws Exception {
        String localPath = "D:\\src\\upload.txt";
        File file = new File(localPath);
        hadoopController.uploadFile(localPath,"/dzqz/test.txt",Integer.valueOf(file.length()+""));
    }
    @Test
    public void listFiles() throws Exception {
        String path="/dzqz/";
        hadoopController.getFileList(path);
    }
    @Test
    public void downloadFile() throws Exception{
        hadoopController.downloadFile("/dzqz/test.txt","D:\\src\\test.txt",128*1024);
    }
    @Test
    public void deleteFile() throws Exception{
        hadoopController.delete("/dzqz/test.txt",false);
    }

}
