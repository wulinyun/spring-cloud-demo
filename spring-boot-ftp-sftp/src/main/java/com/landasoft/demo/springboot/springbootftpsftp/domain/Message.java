package com.landasoft.demo.springboot.springbootftpsftp.domain;

/**
 * 返回值类
 * @author 伍林云
 * @date 2019/8/23  18:57
 */
public class Message {
    //0表示成功;-1表示失败
    int status;
    //向前端返回的内容
    String message;
    public Message(){
        super();
    }
    public Message(int status, String message){
        super();
        this.status = status;
        this.message = message;
    }
}
