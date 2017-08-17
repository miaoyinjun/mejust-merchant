package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.*;
import com.mejust.merchant.api.rao.MerchantMemberTjRao;
import com.mejust.merchant.service.MerchantMemberTjService;
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
@Api(tags = "商户申请材料证件照", description = "商户申请材料证件照")
public class MerchantMemberTjController implements MerchantMemberTjRao {

    @Autowired
    MerchantMemberTjService merchantMemberTjService;



    @Override
    @ApiOperation(value = "查询全部", notes = "查询全部")
    public List<MerchantMemberTjVo> selectAll() {
        return merchantMemberTjService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询", notes = "根据对象条件查询")
    public List<MerchantMemberTjVo> select(@RequestBody MerchantMemberTjVo var1) {
        return merchantMemberTjService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询", notes = "根据条件分页查询")
    public Page<MerchantMemberTjVo> selectPage(@RequestBody Query<MerchantMemberTjVo> query) {
        return merchantMemberTjService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantMemberTjVo var1) {
        return merchantMemberTjService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加", notes = "添加")
    public int insert(@RequestBody MerchantMemberTjVo var1) {
        return merchantMemberTjService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改", notes = "修改")
    public int update(@RequestBody MerchantMemberTjVo var1) {
        return merchantMemberTjService.update(var1);
    }
}

