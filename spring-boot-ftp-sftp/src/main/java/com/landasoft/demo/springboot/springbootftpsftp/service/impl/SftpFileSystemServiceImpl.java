package com.landasoft.demo.springboot.springbootftpsftp.service.impl;

import com.jcraft.jsch.*;
import com.landasoft.demo.springboot.springbootftpsftp.config.SftpProperties;
import com.landasoft.demo.springboot.springbootftpsftp.service.FileSystemService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;

/**
 * 使用jsch Jar实现SFTP上传、下载、创建、删除文件
 * @author 伍林云
 * @date 2019/8/23  16:32
 */

@Service("sftpFileSystemService")
public class SftpFileSystemServiceImpl implements FileSystemService {
    private static final Log log = LogFactory.getLog(SftpFileSystemServiceImpl.class);
    //设置第一次登陆的时候提示，可选值：(ask | yes | no)
    private static final String SESSION_CONFIG_STRICT_HOST_KEY_CHECKING = "StrictHostKeyChecking";
    @Autowired
    private SftpProperties config;
    /**
     * 创建SFTP连接
     * @return
     * @throws Exception
     */
    private ChannelSftp createSftp() throws Exception {
        JSch jsch = new JSch();
        log.info("Try to connect sftp[" + config.getUsername() + "@" + config.getHost() + "], use password[" + config.getPassword() + "]");

        Session session = createSession(jsch, config.getHost(), config.getUsername(), config.getPort());
        session.setPassword(config.getPassword());
        session.connect(config.getSessionConnectTimeout());

        log.info("Session connected to {}."+config.getHost());

        Channel channel = session.openChannel(config.getProtocol());
        channel.connect(config.getChannelConnectedTimeout());

        log.info("Channel created to {}."+config.getHost());

        return (ChannelSftp) channel;
    }
    /**
     * 加密秘钥方式登陆
     * @return
     */
    private ChannelSftp connectByKey() throws Exception {
        JSch jsch = new JSch();

        // 设置密钥和密码 ,支持密钥的方式登陆
        if (StringUtils.isNotBlank(config.getPrivateKey())) {
            if (StringUtils.isNotBlank(config.getPassphrase())) {
                // 设置带口令的密钥
                jsch.addIdentity(config.getPrivateKey(), config.getPassphrase());
            } else {
                // 设置不带口令的密钥
                jsch.addIdentity(config.getPrivateKey());
            }
        }
        log.info("Try to connect sftp[" + config.getUsername() + "@" + config.getHost() + "], use private key[" + config.getPrivateKey()
                + "] with passphrase[" + config.getPassphrase() + "]");

        Session session = createSession(jsch, config.getHost(), config.getUsername(), config.getPort());
        // 设置登陆超时时间
        session.connect(config.getSessionConnectTimeout());
        log.info("Session connected to " + config.getHost() + ".");

        // 创建sftp通信通道
        Channel channel = session.openChannel(config.getProtocol());
        channel.connect(config.getChannelConnectedTimeout());
        log.info("Channel created to " + config.getHost() + ".");
        return (ChannelSftp) channel;
    }

    /**
     * 创建session
     * @param jsch
     * @param host
     * @param username
     * @param port
     * @return
     * @throws Exception
     */
    private Session createSession(JSch jsch, String host, String username, Integer port) throws Exception {
        Session session = null;

        if (port <= 0) {
            session = jsch.getSession(username, host);
        } else {
            session = jsch.getSession(username, host, port);
        }

        if (session == null) {
            throw new Exception(host + " session is null");
        }

        session.setConfig(SESSION_CONFIG_STRICT_HOST_KEY_CHECKING, config.getSessionStrictHostKeyChecking());
        return session;
    }

    /**
     * 关闭连接
     * @param sftp
     */
    private void disconnect(ChannelSftp sftp) {
        try {
            if (sftp != null) {
                if (sftp.isConnected()) {
                    sftp.disconnect();
                } else if (sftp.isClosed()) {
                    log.info("sftp is closed already");
                }
                if (null != sftp.getSession()) {
                    sftp.getSession().disconnect();
                }
            }
        } catch (JSchException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean uploadFile(String targetPath, InputStream inputStream) throws Exception {
        ChannelSftp sftp = this.createSftp();
        try {
            sftp.cd(config.getRoot());
            log.info("Change path to {}"+config.getRoot());

            int index = targetPath.lastIndexOf("/");
            String fileDir = targetPath.substring(0, index);
            String fileName = targetPath.substring(index + 1);
            boolean dirs = this.createDirs(fileDir, sftp);
            if (!dirs) {
                log.error("Remote path error. path:{}"+targetPath);
                throw new Exception("Upload File failure");
            }
            sftp.setFilenameEncoding("UTF-8");
            sftp.put(inputStream, fileName);
            return true;
        } catch (Exception e) {
            log.error("Upload file failure. TargetPath: {}"+targetPath, e);
            throw new Exception("Upload File failure");
        } finally {
            this.disconnect(sftp);
        }
    }

    @Override
    public boolean uploadFile(String targetPath, File file) throws Exception {
        return this.uploadFile(targetPath, new FileInputStream(file));
    }

    @Override
    public File downloadFile(String targetPath) throws Exception {
        ChannelSftp sftp = this.createSftp();
        sftp.setFilenameEncoding("UTF-8");
        OutputStream outputStream = null;
        try {
            sftp.cd(config.getRoot());
            log.info("Change path to {}"+config.getRoot());
            String fileName=targetPath.substring(targetPath.lastIndexOf("/") + 1);
            //获取文件后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            //生成新的文件
            File file = new File(UUID.randomUUID().toString()+suffixName);

            outputStream = new FileOutputStream(file);
            sftp.get(targetPath, outputStream);
            log.info("Download file success. TargetPath: {}"+targetPath);
            return file;
        } catch (Exception e) {
            log.error("Download file failure. TargetPath: {}"+targetPath, e);
            throw new Exception("Download File failure");
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            this.disconnect(sftp);
        }
    }

    @Override
    public InputStream getDownloadFileInputStream(String targetPath) throws Exception {
        ChannelSftp sftp = this.createSftp();
        try {
            sftp.cd(config.getRoot());
            log.info("Change path to {}"+config.getRoot());
            log.info("Download fileInputStream success. TargetPath: {}"+targetPath);
            InputStream inputStream = sftp.get(targetPath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) > -1 ) {
                baos.write(buffer, 0, len);
            }
            baos.flush();
            InputStream input = new ByteArrayInputStream(baos.toByteArray());
            return input;
        } catch (Exception e) {
            log.error("Download file failure. TargetPath: {}"+targetPath, e);
            throw new Exception("Download File failure");
        } finally {
            this.disconnect(sftp);
        }
    }

    @Override
    public boolean deleteFile(String targetPath) throws Exception {
        ChannelSftp sftp = null;
        try {
            sftp = this.createSftp();
            sftp.cd(config.getRoot());
            sftp.rm(targetPath);
            return true;
        } catch (Exception e) {
            log.error("Delete file failure. TargetPath: {}"+targetPath, e);
            throw new Exception("Delete File failure");
        } finally {
            this.disconnect(sftp);
        }
    }
    /**
     * 创建一级或者多级目录
     * @param dirPath
     * @param sftp
     * @return
     */
    private boolean createDirs(String dirPath, ChannelSftp sftp) {
        if (dirPath != null && !dirPath.isEmpty()
                && sftp != null) {
            String[] dirs = Arrays.stream(dirPath.split("/"))
                    .filter(StringUtils::isNotBlank)
                    .toArray(String[]::new);

            for (String dir : dirs) {
                try {
                    sftp.cd(dir);
                    log.info("Change directory {}"+dir);
                } catch (Exception e) {
                    try {
                        sftp.mkdir(dir);
                        log.info("Create directory {}"+dir);
                    } catch (SftpException e1) {
                        log.error("Create directory failure, directory:{}"+dir, e1);
                        e1.printStackTrace();
                    }
                    try {
                        sftp.cd(dir);
                        log.info("Change directory {}"+dir);
                    } catch (SftpException e1) {
                        log.error("Change directory failure, directory:{}"+dir, e1);
                        e1.printStackTrace();
                    }
                }
            }
            return true;
        }
        return false;
    }
}
