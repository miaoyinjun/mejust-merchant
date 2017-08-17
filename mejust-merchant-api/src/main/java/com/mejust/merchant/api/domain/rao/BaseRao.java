package com.mejust.merchant.api.domain.rao;

import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.domain.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * base通用增删改查
 *
 * @author wangmingsen
 * @create 2017-08-15-1:52 PM
 **/
@FeignClient(name = "merchant-service")
public interface BaseRao<T> {

    @RequestMapping(value = "selectAll", method = RequestMethod.GET)
    List<T> selectAll();
    @RequestMapping(value = "select", method = RequestMethod.POST)
    List<T> select(@RequestBody T var1);
    @RequestMapping(value = "selectPage", method = RequestMethod.POST)
    Page<T> selectPage(@RequestBody Query<T> query);
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    int delete(@RequestBody T var1);
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    int insert(@RequestBody T var1);
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    @ApiOperation(value = "修改", notes = "修改")
    int update(@RequestBody T var1);



}
