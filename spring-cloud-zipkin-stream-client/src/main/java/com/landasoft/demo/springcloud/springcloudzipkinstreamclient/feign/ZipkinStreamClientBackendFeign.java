package com.landasoft.demo.springcloud.springcloudzipkinstreamclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign调用客户端定义
 * @author 伍林云
 * @date 2019/8/9  14:18
 */
@FeignClient(name = "landa-mas-zipkin-stream-client-backend")
public interface ZipkinStreamClientBackendFeign {
    @RequestMapping("/call/{id}")
    String call(@PathVariable("id") String id);
}
