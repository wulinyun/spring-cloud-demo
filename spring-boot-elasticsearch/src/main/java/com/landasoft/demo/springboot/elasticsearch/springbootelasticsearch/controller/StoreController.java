package com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.controller;

import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.docindex.service.StoreDocumentIndexService;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.exception.BaseException;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.global.Global;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.response.ResponseResult;
import com.landasoft.demo.springboot.elasticsearch.springbootelasticsearch.search.impl.StoreSearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

/**
 * 门店控制器
 * @Author wulinyun
 * @Version 1.0
 * @Description store商店索引控制器
 * @Date 2019/12/17 17:32
 */
@RestController
@RequestMapping("/store")
@Api(value = "StoreController",tags = "StoreController")
public class StoreController extends BaseController {
    @Resource
    private StoreDocumentIndexService storeDocumentIndexService;
    @Resource
    private StoreSearchService storeSearchService;
    /**
     * 保存索引
     * @param params 数据
     * @return ID
     */
    @PostMapping("/index")
    @ApiOperation(value = "保存索引")
    public ResponseResult index(@RequestBody Map<String, Object> params) {

        return ResponseResult.success(storeDocumentIndexService.index(params));
    }
    /**
     * 搜索
     * @param params 查询参数
     * @return 搜索结果
     */
    @PostMapping("/search")
    @ApiOperation(value = "搜索")
    public ResponseResult search(@RequestBody Map<String, String> params) {

        return ResponseResult.success(storeSearchService.search(params));
    }
    /**
     * 搜索
     * @param params 查询参数
     * @return 搜索结果
     */
    @ApiOperation(value = "搜索")
    @PostMapping("/aggregate")
    public ResponseResult aggregate(@RequestBody Map<String, String> params) {

        return ResponseResult.success(storeSearchService.aggregate(params));
    }
    /**
     * 搜索数量
     * @param params 查询参数
     * @return 搜索结果
     */
    @PostMapping("/count")
    @ApiOperation(value = "搜索数量")
    public ResponseResult count(@RequestBody Map<String, String> params) {

        return ResponseResult.success(storeSearchService.count(params));
    }
    /**
     * 根据ID获取数据
     * @param id ID
     * @return 搜索结果
     */
    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据ID获取数据")
    public ResponseResult get(@PathVariable String id) {
        return ResponseResult.success(storeSearchService.get(id));
    }
    /**
     * 批量更新
     * @param params 更新的数据
     * @return ResponseResult
     */
    @PostMapping("/sync/bulk/update")
    @ApiOperation(value = "批量更新")
    public ResponseResult bulkUpdate(@RequestBody Map<String, String> params) {
        if (!params.containsKey("ids") || !params.containsKey("source")) {
            return ResponseResult.fail(BaseException.NULL_PARAM_EXCEPTION.build());
        }
        storeDocumentIndexService.bulkUpdate(Arrays.asList(params.get("ids").split(Global.SPLIT_FLAG_COMMA)),
                params.get("source"));
        return ResponseResult.success(null);
    }

}
