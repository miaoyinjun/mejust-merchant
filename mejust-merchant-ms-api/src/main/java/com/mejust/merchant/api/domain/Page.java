package com.mejust.merchant.api.domain;

import java.util.List;

/**
 * 分页查询
 * @author wangmingsen
 * @create 2017-08-15-1:52 PM
 **/
public class Page<T> {
    /**
     * 返回记录
     */
    private List<T> list;
    /**
     * 当前页
     */
    private Integer currentPage;
    /**
     * 每页条数
     */
    private Integer pageSize;
    /**
     *  总记录数
     */
    private Long totalCount;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
