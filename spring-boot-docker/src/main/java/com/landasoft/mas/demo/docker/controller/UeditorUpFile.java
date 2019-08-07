package com.landasoft.mas.demo.docker.controller;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.druid.pool.vendor.SybaseExceptionSorter;
import com.landasoft.mas.demo.docker.bean.WaterMarkGenerate;

@RestController
public class UeditorUpFile {
	private final static Log logger = LogFactory.getLog(UeditorUpFile.class);
	@RequestMapping(value = "ueditorUpFile")
	@ResponseBody
	public  Map<String,Object> ueditorUpFile(HttpServletRequest request){
	   Map<String,Object> resultMap = new HashMap<String,Object>();
	   MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
	   // 从config.json中取得上传文件的ID
	   MultipartFile upfile = multipartRequest.getFile("upfile");
	   //获取项目根路径
	   String realpath= request.getSession().getServletContext().getRealPath("/");
	   logger.info(realpath);
	   if(Objects.nonNull(upfile)){
	        try {
	        	 InputStream inputStream = upfile.getInputStream();
	          String tarfile = realpath+"testZh.jpg";
	          logger.info("targetPath:"+tarfile);
	           //添加水印
	          WaterMarkGenerate.generateWithTextMark(inputStream, tarfile, "伍林云");
	        } catch (Exception e) {
	           e.printStackTrace();
	        }
	   }
	return resultMap; 
	}
	public static void main(String[] args) {
		try {
			System.out.println("伍林云".getBytes("GBK").toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
