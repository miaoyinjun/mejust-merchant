package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantContractVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.rao.MerchantContractRao;
import com.mejust.merchant.service.MerchantContractService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商户合作条件信息服务
 * Created by heshuai on 2017/8/15.
 */
@Api(tags = "商户合作条件信息服务", description = "商户合作条件信息服务")
@RestController
public class MerchantContractController implements MerchantContractRao {


    @Autowired
    MerchantContractService merchantContractService;

    @Override
    @ApiOperation(value = "查询全部商户合作条件信息", notes = "查询全部商户合作条件信息")
    public List<MerchantContractVo> selectAll() {
        return merchantContractService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询商户合作条件信息", notes = "根据对象条件查询商户合作条件信息")
    public List<MerchantContractVo> select(@RequestBody MerchantContractVo var1) {
        return merchantContractService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询商户合作条件信息", notes = "根据条件分页查询商户合作条件信息")
    public Page<MerchantContractVo> selectPage(@RequestBody Query<MerchantContractVo> query) {
        return merchantContractService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除商户合作条件信息", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantContractVo var1) {
        return merchantContractService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加商户合作条件信息", notes = "添加商户合作条件信息")
    public int insert(@RequestBody MerchantContractVo var1) {
        return merchantContractService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改商户合作条件信息", notes = "修改商户合作条件信息")
    public int update(@RequestBody MerchantContractVo var1) {
        return merchantContractService.update(var1);
    }
}
