package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantSkzfConfigurationVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.rao.MerchantSkzfConfigurationRao;
import com.mejust.merchant.service.MerchantSkzfConfigurationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-8:38 PM
 **/


@RestController
@Api(tags = "商户刷卡支付银行信息配置", description = "商户刷卡支付银行信息配置")
public class MerchantSkzfConfigurationController implements MerchantSkzfConfigurationRao {
    @Autowired
    MerchantSkzfConfigurationService merchantSkzfConfigurationService;


    @Override
    @ApiOperation(value = "查询全部", notes = "查询全部")
    public List<MerchantSkzfConfigurationVo> selectAll() {
        return merchantSkzfConfigurationService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询", notes = "根据对象条件查询")
    public List<MerchantSkzfConfigurationVo> select(@RequestBody MerchantSkzfConfigurationVo var1) {
        return merchantSkzfConfigurationService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询", notes = "根据条件分页查询")
    public Page<MerchantSkzfConfigurationVo> selectPage(@RequestBody Query<MerchantSkzfConfigurationVo> query) {
        return merchantSkzfConfigurationService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantSkzfConfigurationVo var1) {
        return merchantSkzfConfigurationService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加", notes = "添加")
    public int insert(@RequestBody MerchantSkzfConfigurationVo var1) {
        return merchantSkzfConfigurationService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改", notes = "修改")
    public int update(@RequestBody MerchantSkzfConfigurationVo var1) {
        return merchantSkzfConfigurationService.update(var1);
    }
}