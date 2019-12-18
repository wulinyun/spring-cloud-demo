package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.docindex.service;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.config.properties.IndexEntity;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.exception.BaseException;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.model.IndexConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 同步门店索引数据
 * @Author wulinyun
 * @Version 1.0
 * @Description
 * @Date 2019/12/18 14:35
 */
@Service
@Slf4j
public class StoreDocumentIndexService extends AbstractDocumentIndexService{
    @Resource
    private IndexEntity indexEntity;
    @Resource
    private ObjectMapper objectMapper;
    private final TypeReference<Map<String, Object>> typeReference = new TypeReference<Map<String, Object>>() {
    };

    /**
     * 同步门店信息
     * @param store 门店信息
     * @param refresh   是否刷新
     * @return  ID
     */
    public Map index(Map<String, Object> store, boolean refresh) {
        String id = store.get("id").toString();
        log.info("更新门店索引,id:{}", id);

        final IndexConfig config = indexEntity.getConfigByDocCode(IndexEntity.DOC_CODE_STORE);

        // 更新索引
        index(config.getIndexName(), config.getType(), id, store, refresh);
        return store;
    }
    /**
     * 同步门店信息
     * @param store 门店信息
     * @return ID
     */
    public Map index(Map<String, Object> store) {

        return index(store, true);
    }

    /**
     * 批量更新门店数据
     * @param idList  需要更新的文档的ID
     * @param doc   需要更新的内容
     */
    public void bulkUpdate(List<Object> idList, String doc) {
        final IndexConfig config = indexEntity.getConfigByDocCode(IndexEntity.DOC_CODE_STORE);

        try {
            bulkUpdate(config.getIndexName(), config.getType(), idList, objectMapper.readValue(doc, typeReference));
        } catch (IOException e) {
            log.error("批量更新门店数据解析异常, id:{}, doc:{}, e:{}", JSON.toJSONString(idList), doc, e);
            throw BaseException.BULK_UPDATE_INDEX_EXCEPTION.build();
        }
    }

    @Override
    public void loadExpansion(Map sourceData) {
        String id = sourceData.get("id").toString();
        log.info("加载门店索引扩展数据,id:{}", id);
    }
}
