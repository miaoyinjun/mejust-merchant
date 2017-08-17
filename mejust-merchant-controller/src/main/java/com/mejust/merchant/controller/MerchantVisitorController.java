package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantVisitorVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.rao.MerchantVisitorRao;
import com.mejust.merchant.service.MerchantVisitorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-8:36 PM
 **/

@RestController
@Api(tags = "商户访客记录", description = "商户访客记录")
public class MerchantVisitorController implements MerchantVisitorRao {
    
    @Autowired
    MerchantVisitorService merchantVisitorService;


    @Override
    @ApiOperation(value = "查询全部", notes = "查询全部")
    public List<MerchantVisitorVo> selectAll() {
        return merchantVisitorService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询", notes = "根据对象条件查询")
    public List<MerchantVisitorVo> select(@RequestBody MerchantVisitorVo var1) {
        return merchantVisitorService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询", notes = "根据条件分页查询")
    public Page<MerchantVisitorVo> selectPage(@RequestBody Query<MerchantVisitorVo> query) {
        return merchantVisitorService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantVisitorVo var1) {
        return merchantVisitorService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加", notes = "添加")
    public int insert(@RequestBody MerchantVisitorVo var1) {
        return merchantVisitorService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改", notes = "修改")
    public int update(@RequestBody MerchantVisitorVo var1) {
        return merchantVisitorService.update(var1);
    }
}
