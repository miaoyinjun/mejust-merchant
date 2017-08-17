package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantAdvertPayVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.rao.MerchantAdvertPayRao;
import com.mejust.merchant.service.MerchantAdvertPayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商户广告位购买单服务
 * Created by heshuai on 2017/8/15.
 */
@Api(tags = "商户广告位购买单服务", description = "商户广告位购买单服务")
@RestController
public class MerchantAdvertPayController implements MerchantAdvertPayRao {


    @Autowired
    MerchantAdvertPayService merchantAdvertPayService;

    @Override
    @ApiOperation(value = "查询全部商户广告位购买单", notes = "查询全部商户广告位购买单")
    public List<MerchantAdvertPayVo> selectAll() {
        return merchantAdvertPayService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询商户广告位购买单", notes = "根据对象条件查询商户广告位购买单")
    public List<MerchantAdvertPayVo> select(@RequestBody MerchantAdvertPayVo var1) {
        return merchantAdvertPayService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询商户广告位购买单", notes = "根据条件分页查询商户广告位购买单")
    public Page<MerchantAdvertPayVo> selectPage(@RequestBody Query<MerchantAdvertPayVo> query) {
        return merchantAdvertPayService.selectPage(query);
    }


    @Override
    @ApiOperation(value = "删除商户广告位购买单", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantAdvertPayVo var1) {
        return merchantAdvertPayService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加商户广告位购买单", notes = "添加商户广告位购买单")
    public int insert(@RequestBody MerchantAdvertPayVo var1) {
        return merchantAdvertPayService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改商户广告位购买单", notes = "修改商户广告位购买单")
    public int update(@RequestBody MerchantAdvertPayVo var1) {
        return merchantAdvertPayService.update(var1);
    }
}
