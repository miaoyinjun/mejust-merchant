package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantPushLogVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.rao.MerchantPushLogRao;
import com.mejust.merchant.service.MerchantPushLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 商家想某个会员推送消息日志
 *
 * @author wangmingsen
 * @create 2017-08-15-4:42 PM
 **/

@RestController
@Api(tags = "商家想某个会员推送消息日志", description = "商家想某个会员推送消息日志")
public class MerchantPushLogController implements MerchantPushLogRao {

    @Autowired
    private MerchantPushLogService merchantPushLogService;

    @Override
    @ApiOperation(value = "查询全部", notes = "查询全部")
    public List<MerchantPushLogVo> selectAll() {
        return merchantPushLogService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询", notes = "根据对象条件查询")
    public List<MerchantPushLogVo> select(@RequestBody MerchantPushLogVo var1) {
        return merchantPushLogService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询", notes = "根据条件分页查询")
    public Page<MerchantPushLogVo> selectPage(@RequestBody Query<MerchantPushLogVo> query) {
        return merchantPushLogService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantPushLogVo var1) {
        return merchantPushLogService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加", notes = "添加")
    public int insert(@RequestBody MerchantPushLogVo var1) {
        return merchantPushLogService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改", notes = "修改")
    public int update(@RequestBody MerchantPushLogVo var1) {
        return merchantPushLogService.update(var1);
    }
}
