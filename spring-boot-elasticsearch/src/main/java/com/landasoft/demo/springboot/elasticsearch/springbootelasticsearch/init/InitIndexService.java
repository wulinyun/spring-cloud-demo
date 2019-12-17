package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.init;

import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.config.properties.IndexEntity;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.model.IndexConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/17 16:13
 */
@Service
@Slf4j
public class InitIndexService {
    @Resource
    private IndexEntity indexEntity;
    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;
    /**
     * 初始化索引
     * @return true:创建成功，其他：失败
     */
    public Object initIndex() {

        List<String> documentPath = indexEntity.getConfigs().stream().map(IndexConfig::getDocumentPath).collect(Collectors.toList());

        try {
            for (String path : documentPath) {
                try {
                    Class clazz = Class.forName(path);

                    if (!elasticsearchTemplate.indexExists(clazz.newInstance().getClass())) {
                        log.info("创建索引，clazz:{}", clazz);
                        elasticsearchTemplate.createIndex(clazz.newInstance().getClass());
                        log.info("创建索引SUCCESS，clazz:{}", clazz);
                    }

                    log.info("创建Mapping映射，clazz:{}", clazz);
                    elasticsearchTemplate.putMapping(clazz.newInstance().getClass());
                    log.info("创建Mapping映射SUCCESS，clazz:{}", clazz);
                } catch (ClassNotFoundException e) {
                    log.error("未加载到索引文件", e);
                    throw new ClassNotFoundException("未加载到索引文件,ClassPath:" + path);
                }
            }
        } catch (Exception e) {
            log.error("创建索引异常", e);
            return e.getMessage();
        }

        return true;
    }

}
