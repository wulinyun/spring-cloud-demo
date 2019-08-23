package com.landasoft.demo.springboot.springbootftpsftp.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * sftp属性配置类
 * @author 伍林云
 * @date 2019/8/23  16:16
 */
@lombok.Getter
@lombok.Setter
@Component
@ConfigurationProperties(ignoreUnknownFields = false, prefix = "sftp.client")
public class SftpProperties {
    private String host;

    private Integer port;

    private String protocol;

    private String username;

    private String password;

    private String root;

    private String privateKey;

    private String passphrase;

    private String sessionStrictHostKeyChecking;

    private Integer sessionConnectTimeout;

    private Integer channelConnectedTimeout;

}
