package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description joda时间反序列化
 * @Date 2019/12/17 17:39
 */
public class JodaDateTimeDeserializer extends JsonDeserializer<DateTime> {
    @Override
    public DateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
        String s = jsonParser.getValueAsString();
        if (s != null) {
            try {
                return formatter.parseDateTime(s);
            } catch (Exception e) {
                formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ");
                return formatter.parseDateTime(s);
            }
        }
        return null;
    }
}
