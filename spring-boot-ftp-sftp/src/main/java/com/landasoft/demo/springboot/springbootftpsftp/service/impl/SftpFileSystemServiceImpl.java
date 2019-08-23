package com.landasoft.demo.springboot.springbootftpsftp.service.impl;

import com.landasoft.demo.springboot.springbootftpsftp.service.FileSystemService;

import java.io.File;
import java.io.InputStream;

/**
 * sftp实现文件系统服务
 * @author 伍林云
 * @date 2019/8/23  16:32
 */
public class SftpFileSystemServiceImpl implements FileSystemService {
    @Override
    public boolean uploadFile(String targetPath, InputStream inputStream) throws Exception {
        return false;
    }

    @Override
    public boolean uploadFile(String targetPath, File file) throws Exception {
        return false;
    }

    @Override
    public File downloadFile(String targetPath) throws Exception {
        return null;
    }

    @Override
    public boolean deleteFile(String targetPath) throws Exception {
        return false;
    }
}
