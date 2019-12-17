package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description instant时间格式化
 * @Date 2019/12/17 17:34
 */
public class InstantDateDeserializer extends StdDeserializer<Instant> {
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS Z").withZone(ZoneOffset.UTC);
    public InstantDateDeserializer() {
        super(Instant.class);
    }
    @Override
    public Instant deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String s = jsonParser.getText();
        if(s != null){
            return Instant.from(fmt.parse(s));
        }
        return null;
    }
}
