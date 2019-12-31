package com.landasoft.demo.springcloud.springcloudzipkinstreamclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign调用客户端定义  name的值为被调用服务中配置的spring.application.name的值
 * @author 伍林云
 * @date 2019/8/9  14:18
 */
@FeignClient(name = "landa-mas-zipkin-stream-client-backend")
public interface ZipkinStreamClientBackendFeign {
    @RequestMapping("/call/{id}")
    String call(@PathVariable("id") String id, @RequestParam(name = "time",required = false)Long time);
}
