package com.mejust.merchant.api.domain;


/**
 * 分页对象
 *
 * @author wangmingsen
 * @create 2017-08-15-2:03 PM
 **/


public class Query<T> {
    /**
     * 默认的当前页
     */
    private static final Integer DEFAULT_FIRST_PAGE = 1;


    /**
     * 默认的每页条数
     */
    private static final Integer DEFAULT_PAGE_SIZE = 20;

    /**
     * 当前页
     */
    private Integer currentPage = DEFAULT_FIRST_PAGE;

    /**
     * 每页条数
     */
    private Integer pageSize = DEFAULT_PAGE_SIZE;

    private  T date;


    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
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
}
