package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description Joda时间序列化
 * @Date 2019/12/17 17:46
 */
public class JodaDateTimeSerializer extends JsonSerializer<DateTime> {
    @Override
    public void serialize(DateTime dateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
        jsonGenerator.writeString(formatter.print(dateTime));
    }
}
