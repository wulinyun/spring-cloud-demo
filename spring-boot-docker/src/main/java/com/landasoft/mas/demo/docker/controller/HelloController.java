package com.landasoft.mas.demo.docker.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
	private static final Log logger = LogFactory.getLog(HelloController.class);
	@RequestMapping("/")
    public String home() {
		logger.info("Hello Docker World Update！！！！！！");
        return "Hello Docker World Update 88888888888888888";
    }
    @RequestMapping("/call1/{id}")
    public String callHome1(@PathVariable String id){
        logger.info("calling from trace demo backend");
        String result= this.restTemplate.getForObject("http://localhost:11021/call1/" + id, String.class);
        return result+" world";
    }
    @RequestMapping("/call2/{id}")
    public String callSpringBootDocker(@PathVariable String id){
        logger.info("calling from trace demo backend spring-docker-demo");
        String result= this.restTemplate.getForObject("http://localhost:11021/call2/" + id, String.class);
        return result+" world";
    }
}
