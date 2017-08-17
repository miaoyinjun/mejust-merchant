package com.mejust.merchant.service;

import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;

import java.util.List;

/**
 * 基础服务类
 *
 * @author wangmingsen
 * @create 2017-08-15-2:24 PM
 **/


public interface BaseService<T> {


    List<T> selectAll();

    List<T> select(T var1);

    Page<T> selectPage(Query<T> query);

    int delete(T var1);

    int insert(T var1);

    int update(T var1);
}
