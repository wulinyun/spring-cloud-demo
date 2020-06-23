package com.landasoft.demo.springboot.springbootjar.controller;

import com.landasoft.demo.springboot.springbootjar.util.IpAddressUtils;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

@RestController
public class TestController {
	    @Autowired  
	    private Environment env;  
	    @Value("${demo.msg}")
	    private String msg;
	    @RequestMapping("/")
	    public String hello(){  
	        return msg;  
	    }
	    @RequestMapping("/env")   
	    public String index2(String envName){  
	        return "方式二:"+env.getProperty(envName);  
	    }  
	    @RequestMapping("/getTime")   
	    public String getTime(){  
	    	System.out.println("获取时间" + new Date());

		    Date d = new Date();
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		    System.out.println("格式化输出：" + sdf.format(d));

		    sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		    
		    System.out.println("Asia/Shanghai:" + sdf.format(d));
		    return sdf.format(d);
	    }  
		@RequestMapping("/helloHtml")  
	    public String helloHtml(Map<String,Object> map){  
	       map.put("hello","from TemplateController.helloHtml");  
	       return"/helloHtml";  
	    }
		@RequestMapping("/getIp")
		public String obtainIP(HttpServletRequest request){
	    	String ip = IpAddressUtils.getIpAddr(request);
	    	return  ip;
		}
		@RequestMapping("/getLog")
		public String getChineseLog(HttpServletRequest request){
			String chinaStr = "我是中国人";
			System.out.println(chinaStr);
			return  chinaStr;
		}
		@RequestMapping("/getTiming")
		public String getTiming(@RequestParam(name = "time",defaultValue = "1")Integer time) throws InterruptedException {
			System.out.println("开始等待");
	    	Thread.sleep(time*1000);
			System.out.println("结束等待");
	    	return msg+"  等待时间(秒)"+time;
	}
}
