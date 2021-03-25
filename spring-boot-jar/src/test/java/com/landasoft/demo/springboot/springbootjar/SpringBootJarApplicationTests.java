package com.landasoft.demo.springboot.springbootjar;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.util.StringUtil;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJarApplicationTests {
    @Test
    public void contextLoads() {
    }
    @Test
    public  void testLog(){
        //headers
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        requestHeaders.add("Referer", "http://10.0.11.1");
        //body
        MultiValueMap<String, Object> requestBody = new LinkedMultiValueMap<>();
        requestBody.add("token", "hbqbldrzjc1875964541");
        requestBody.add("user_id", 84);
        requestBody.add("user_name", "landa");
        requestBody.add("oper_time", "2019-09-19 14:45");
        requestBody.add("oper_desc", "wulin测试日志接口");
        requestBody.add("app_type", "蓝灯");
        requestBody.add("ip", "10.44.2.246");
        requestBody.add("apply_result", 1);
        requestBody.add("apply_content", "测试日志接口是否成功");
        //HttpEntity
        HttpEntity<MultiValueMap> requestEntity = new HttpEntity<MultiValueMap>(requestBody, requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        //ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://10.128.1.210:8480/qbxxpt/logAbout/addAppLogInfo",requestEntity,String.class);
        ResponseEntity<String> responseEntity = restTemplate.exchange("http://10.0.11.1:8082/qbxxpt/logAbout/addAppLogInfo", HttpMethod.POST,requestEntity,String.class);
        System.out.println(responseEntity.getBody());
    }
    @Test
    public  void testLog2(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        //定义请求参数类型，这里用json所以是MediaType.APPLICATION_JSON
        headers.setContentType(MediaType.APPLICATION_JSON);
        //headers.add("Referer", "http://10.128.1.210");
        headers.add("Referer", "http://10.0.11.1");
        //RestTemplate带参传的时候要用HttpEntity<?>对象传递
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("token", "hbqbldrzjc1875964541");
        map.put("user_id", 84);
        map.put("user_name", "landa");
        map.put("oper_time", "2019-09-19 16:55");
        map.put("oper_desc", "wulin测试日志接口");
        map.put("app_type", "蓝灯");
        map.put("ip", "10.44.2.246");
        map.put("apply_result", 1);
        map.put("apply_content", "测试日志接口是否成功");
        HttpEntity<Map<String, Object>> request = new HttpEntity<Map<String, Object>>(map, headers);

        //ResponseEntity<String> entity = restTemplate.postForEntity("http://10.128.1.210:8480/qbxxpt/logAbout/addAppLogInfo", request, String.class);
        ResponseEntity<String> entity = restTemplate.postForEntity("http://10.0.11.1:8082/qbxxpt/logAbout/addAppLogInfo", request, String.class);
        //获取3方接口返回的数据通过entity.getBody();它返回的是一个字符串；
        String body = entity.getBody();
        Assert.assertEquals(1, 1);
        System.out.println(body);
    }
}
