package com.landasoft.mas.demo.docker.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	private static final Log logger = LogFactory.getLog(HelloController.class);
	@RequestMapping("/")
    public String home() {
		logger.info("Hello Docker World Update！！！！！！");
        return "Hello Docker World Update 88888888888888888";
    }
}
