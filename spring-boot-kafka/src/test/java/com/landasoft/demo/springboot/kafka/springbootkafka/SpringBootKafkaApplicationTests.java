package com.landasoft.demo.springboot.kafka.springbootkafka;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringBootKafkaApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void gsonTest(){
        List<Map<String, String>> mapList = new ArrayList<>();
        Map map = new HashMap();
        map.put("id", "1");
        map.put("name", "葵花宝典");
        Map map2 = new HashMap();
        map2.put("id", "2");
        map2.put("name", "九阴真经");
        mapList.add(map);
        mapList.add(map2);
        Gson gson = new Gson();
        System.out.println(gson.toJson(mapList));
    }
}
