package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.*;
import com.mejust.merchant.api.rao.MerchantSaleRao;
import com.mejust.merchant.service.MerchantSaleService;
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
@Api(tags = "存在销售商户", description = "存在销售商户")
public class MerchantSaleController implements MerchantSaleRao {

    @Autowired
    MerchantSaleService merchantSaleService;



    @Override
    @ApiOperation(value = "查询全部", notes = "查询全部")
    public List<MerchantSaleVo> selectAll() {
        return merchantSaleService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询", notes = "根据对象条件查询")
    public List<MerchantSaleVo> select(@RequestBody MerchantSaleVo var1) {
        return merchantSaleService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询", notes = "根据条件分页查询")
    public Page<MerchantSaleVo> selectPage(@RequestBody Query<MerchantSaleVo> query) {
        return merchantSaleService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantSaleVo var1) {
        return merchantSaleService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加", notes = "添加")
    public int insert(@RequestBody MerchantSaleVo var1) {
        return merchantSaleService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改", notes = "修改")
    public int update(@RequestBody MerchantSaleVo var1) {
        return merchantSaleService.update(var1);
    }
}
