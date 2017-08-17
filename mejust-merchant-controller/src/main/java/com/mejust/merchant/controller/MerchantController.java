package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.rao.MerchantRao;
import com.mejust.merchant.service.MerchantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商户服务
 *
 * @author wangmingsen
 * @create 2017-08-15-1:47 PM
 **/

@Api(tags = "商户服务", description = "商户服务")
@RestController
public class MerchantController implements MerchantRao {

    @Autowired
    MerchantService merchantService;


    @Override
    @ApiOperation(value = "查询全部商户", notes = "查询全部商户")
    public List<MerchantVo> selectAll() {
       return merchantService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询商户", notes = "根据对象条件查询商户")
    public List<MerchantVo> select(@RequestBody MerchantVo var1) {
        return merchantService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询商户", notes = "根据条件分页查询商户")
    public Page<MerchantVo> selectPage(@RequestBody Query<MerchantVo> query) {
        return merchantService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除商户", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantVo var1) {
        return merchantService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加商户", notes = "添加商户")
    public int insert(@RequestBody MerchantVo var1) {
        return merchantService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改商户", notes = "修改商户")
    public int update(@RequestBody MerchantVo var1) {
        return merchantService.update(var1);
    }
}
