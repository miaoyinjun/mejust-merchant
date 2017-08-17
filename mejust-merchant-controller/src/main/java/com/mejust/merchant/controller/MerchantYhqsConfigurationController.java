package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantYhqsConfigurationVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.rao.MerchantYhqsConfigurationRao;
import com.mejust.merchant.service.MerchantYhqsConfigurationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-8:21 PM
 **/

@RestController
@Api(tags = "商户移动支付银行清算密钥配置", description = "商户移动支付银行清算密钥配置")
public class MerchantYhqsConfigurationController implements MerchantYhqsConfigurationRao {

    @Autowired
    MerchantYhqsConfigurationService merchantYhqsConfigurationService;


    @Override
    @ApiOperation(value = "查询全部", notes = "查询全部")
    public List<MerchantYhqsConfigurationVo> selectAll() {
        return merchantYhqsConfigurationService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询", notes = "根据对象条件查询")
    public List<MerchantYhqsConfigurationVo> select(@RequestBody MerchantYhqsConfigurationVo var1) {
        return merchantYhqsConfigurationService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询", notes = "根据条件分页查询")
    public Page<MerchantYhqsConfigurationVo> selectPage(@RequestBody Query<MerchantYhqsConfigurationVo> query) {
        return merchantYhqsConfigurationService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantYhqsConfigurationVo var1) {
        return merchantYhqsConfigurationService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加", notes = "添加")
    public int insert(@RequestBody MerchantYhqsConfigurationVo var1) {
        return merchantYhqsConfigurationService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改", notes = "修改")
    public int update(@RequestBody MerchantYhqsConfigurationVo var1) {
        return merchantYhqsConfigurationService.update(var1);
    }
}
