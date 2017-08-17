package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantContractDetailVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.domain.rao.MerchantContractDetailRao;
import com.mejust.merchant.service.MerchantContractDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商户合作折扣多扣点信息服务
 * Created by heshuai on 2017/8/15.
 */
@Api(tags = "商户合作折扣多扣点信息服务", description = "商户合作折扣多扣点信息服务")
@RestController
public class MerchantContractDetailController implements MerchantContractDetailRao {


    @Autowired
    MerchantContractDetailService merchantContractDetailService;



    @Override
    @ApiOperation(value = "查询全部商户合作折扣多扣点信息", notes = "查询全部商户合作折扣多扣点信息")
    public List<MerchantContractDetailVo> selectAll() {
        return merchantContractDetailService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询商户合作折扣多扣点信息", notes = "根据对象条件查询商户合作折扣多扣点信息")
    public List<MerchantContractDetailVo> select(@RequestBody MerchantContractDetailVo var1) {
        return merchantContractDetailService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询商户合作折扣多扣点信息", notes = "根据条件分页查询商户合作折扣多扣点信息")
    public Page<MerchantContractDetailVo> selectPage(@RequestBody Query<MerchantContractDetailVo> query) {
        return merchantContractDetailService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除商户合作折扣多扣点信息", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantContractDetailVo var1) {
        return merchantContractDetailService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加商户合作折扣多扣点信息", notes = "添加商户合作折扣多扣点信息")
    public int insert(@RequestBody MerchantContractDetailVo var1) {
        return merchantContractDetailService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改商户合作折扣多扣点信息", notes = "修改商户合作折扣多扣点信息")
    public int update(@RequestBody MerchantContractDetailVo var1) {
        return merchantContractDetailService.update(var1);
    }
}
