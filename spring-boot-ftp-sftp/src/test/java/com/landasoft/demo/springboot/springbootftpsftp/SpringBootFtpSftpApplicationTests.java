package com.landasoft.demo.springboot.springbootftpsftp;

import com.landasoft.demo.springboot.springbootftpsftp.service.FileSystemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootFtpSftpApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private FileSystemService fileSystemService;

    @Test
    public void sftpUpload() throws Exception {
        File file = new File("D:\\develop\\program\\idea\\spring-cloud-demo\\spring-boot-ftp-sftp\\src\\main\\resources\\static\\java职位要求.docx");
        InputStream inputStream = new FileInputStream(file);

        boolean uploadFile = fileSystemService.uploadFile("document/" + file.getName(), inputStream);
        if (uploadFile) {
            System.out.println("success.....");
        } else {
            System.out.println("failure.....");
        }

        inputStream.close();
    }

    @Test
    public void download() throws Exception {
        File file = fileSystemService.downloadFile("document/java职位要求.docx");
        if (file == null) {
            throw new FileNotFoundException("File not found!");
        }
        System.out.println(file.getName());

        file.delete();
    }

    @Test
    public void deleteFile() throws Exception {
        System.out.println(fileSystemService.deleteFile("document/java职位要求.docx"));
    }

}
