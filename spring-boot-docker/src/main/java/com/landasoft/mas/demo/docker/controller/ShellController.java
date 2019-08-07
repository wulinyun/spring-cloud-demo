package com.landasoft.mas.demo.docker.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShellController {
	private final static Log logger = LogFactory.getLog(ShellController.class);
	@RequestMapping("/shell")
    public String shell(@RequestParam(value="shell")String shellString) {
		logger.info("shell》"+shellString);
        return shellString;
    }
}
