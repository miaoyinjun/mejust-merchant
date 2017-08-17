package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantRedPacketInfoVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.rao.MerchantRedPacketInfoRao;
import com.mejust.merchant.service.MerchantRedPacketInfoService;
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
@Api(tags = "商户红包信息表", description = "商户红包信息表")
public class MerchantRedPacketInfoController implements MerchantRedPacketInfoRao {

    @Autowired
    MerchantRedPacketInfoService merchantRedPacketInfoService;



    @Override
    @ApiOperation(value = "查询全部", notes = "查询全部")
    public List<MerchantRedPacketInfoVo> selectAll() {
        return merchantRedPacketInfoService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询", notes = "根据对象条件查询")
    public List<MerchantRedPacketInfoVo> select(@RequestBody MerchantRedPacketInfoVo var1) {
        return merchantRedPacketInfoService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询", notes = "根据条件分页查询")
    public Page<MerchantRedPacketInfoVo> selectPage(@RequestBody Query<MerchantRedPacketInfoVo> query) {
        return merchantRedPacketInfoService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantRedPacketInfoVo var1) {
        return merchantRedPacketInfoService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加", notes = "添加")
    public int insert(@RequestBody MerchantRedPacketInfoVo var1) {
        return merchantRedPacketInfoService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改", notes = "修改")
    public int update(@RequestBody MerchantRedPacketInfoVo var1) {
        return merchantRedPacketInfoService.update(var1);
    }
}
