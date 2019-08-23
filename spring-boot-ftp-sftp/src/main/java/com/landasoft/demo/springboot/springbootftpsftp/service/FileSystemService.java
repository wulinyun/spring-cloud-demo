package com.landasoft.demo.springboot.springbootftpsftp.service;

import java.io.File;
import java.io.InputStream;

/**
 * 文件系统服务接口定义
 * @author 伍林云
 * @date 2019/8/23  16:25
 */
public interface FileSystemService {
    /**
     * 通过源文件流上传到指定文件夹路径
     * @param targetPath   目标路径
     * @param inputStream   源文件流
     * @return
     * @throws Exception
     */
    boolean uploadFile(String targetPath, InputStream inputStream) throws Exception;

    /**
     * 通过源文件上传到指定路径
     * @param targetPath  目标路径
     * @param file  源文件
     * @return
     * @throws Exception
     */
    boolean uploadFile(String targetPath, File file) throws Exception;

    /**
     * 下载指定路径的文件
     * @param targetPath    文件路径
     * @return
     * @throws Exception
     */
    File downloadFile(String targetPath) throws Exception;

    /**
     * 获取指定路径文件的文件流
     * @param targetPath
     * @return
     * @throws Exception
     */
    InputStream getDownloadFileInputStream(String targetPath) throws Exception;

    /**
     * 删除指定路径的文件
     * @param targetPath    文件路径
     * @return
     * @throws Exception
     */
    boolean deleteFile(String targetPath) throws Exception;
}
