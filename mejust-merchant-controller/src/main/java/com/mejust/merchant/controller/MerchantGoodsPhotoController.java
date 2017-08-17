package com.mejust.merchant.controller;

import com.mejust.merchant.api.domain.MerchantGoodsPhotoVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.api.domain.rao.MerchantGoodsPhotoRao;
import com.mejust.merchant.service.MerchantGoodsPhotoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品图片信息服务
 * Created by heshuai on 2017/8/15.
 */
@Api(tags = "商品图片信息服务", description = "商品图片信息服务")
@RestController
public class MerchantGoodsPhotoController implements MerchantGoodsPhotoRao {


    @Autowired
    MerchantGoodsPhotoService merchantGoodsPhotoService;



    @Override
    @ApiOperation(value = "查询全部商品图片信息", notes = "查询全部商品图片信息")
    public List<MerchantGoodsPhotoVo> selectAll() {
        return merchantGoodsPhotoService.selectAll();
    }

    @Override
    @ApiOperation(value = "根据对象条件查询商品图片信息", notes = "根据对象条件查询商品图片信息")
    public List<MerchantGoodsPhotoVo> select(@RequestBody MerchantGoodsPhotoVo var1) {
        return merchantGoodsPhotoService.select(var1);
    }

    @Override
    @ApiOperation(value = "根据条件分页查询商品图片信息", notes = "根据条件分页查询商品图片信息")
    public Page<MerchantGoodsPhotoVo> selectPage(@RequestBody Query<MerchantGoodsPhotoVo> query) {
        return merchantGoodsPhotoService.selectPage(query);
    }

    @Override
    @ApiOperation(value = "删除商品图片信息", notes = "根据对象条件删除")
    public int delete(@RequestBody MerchantGoodsPhotoVo var1) {
        return merchantGoodsPhotoService.delete(var1);
    }

    @Override
    @ApiOperation(value = "添加商品图片信息", notes = "添加商品图片信息")
    public int insert(@RequestBody MerchantGoodsPhotoVo var1) {
        return merchantGoodsPhotoService.insert(var1);
    }

    @Override
    @ApiOperation(value = "修改商品图片信息", notes = "修改商品图片信息")
    public int update(@RequestBody MerchantGoodsPhotoVo var1) {
        return merchantGoodsPhotoService.update(var1);
    }
}
