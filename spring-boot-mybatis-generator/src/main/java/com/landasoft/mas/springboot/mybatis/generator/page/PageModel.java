package com.landasoft.mas.springboot.mybatis.generator.page;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2020/6/24 1:21
 */
public class PageModel<T> {
    //当前页数
    private Integer pageIndex = 1;
    //一页显示数量
    private Integer pageSize = 10;
    //查询起始行
    private Integer startRow;
    //总记录行数
    private Long total;
    // 泛型的使用！//查询结果返回数据
    private List<T> rows;
    //查询对象
    private T queryObj;
    public PageModel() {

    }
    public PageModel(Integer pageIndex, Integer pageSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }
    public PageModel(Integer pageIndex, Integer pageSize, List<T> rows) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.rows = rows;
    }

    public PageModel(Integer pageIndex, Integer pageSize, Long total, List<T> rows) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.total = total;
        this.rows = rows;
    }

    public PageModel(Integer pageIndex, Integer pageSize, Integer startRow, Long total, List<T> rows) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.startRow = startRow;
        this.total = total;
        this.rows = rows;
    }

    @Override
    public String toString() {
        return String.format("[pageIndex=%d, pageSize=%d]",
                pageIndex, pageSize) ;
    }

    /**
     * pageNumber有-1的操作，可能会出现负值，所以需要进行整数判断！
     * @return
     */
    public Integer getStartRow() {
        if (pageIndex != null && pageSize != null && pageIndex >= 1) {
            return (pageIndex - 1) * pageSize;
        } else {
            return 0;
        }
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public void setQueryObj(T queryObj) {
        this.queryObj = queryObj;
    }

    public T getQueryObj() {
        return queryObj;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }
}
