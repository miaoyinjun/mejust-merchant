package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantGoodsPhotoVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantGoodsPhotoMapper;
import com.mejust.merchant.model.MerchantGoodsPhoto;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 商品图片信息表
 * Created by heshuai on 2017/8/15.
 */
public class MerchantGoodsPhotoService implements BaseService<MerchantGoodsPhotoVo>  {

    @Autowired
    MerchantGoodsPhotoMapper merchantGoodsPhotoMapper;


    @Override
    public List<MerchantGoodsPhotoVo> selectAll() {
        List<MerchantGoodsPhoto> merchantGoodsPhotos =  merchantGoodsPhotoMapper.selectAll();
        return DozerMapperUtil.mapList(merchantGoodsPhotos, MerchantGoodsPhotoVo.class);
    }

    @Override
    public List<MerchantGoodsPhotoVo> select(MerchantGoodsPhotoVo var1) {
        MerchantGoodsPhoto merchantGoodsPhoto = DozerMapperUtil.map(var1,MerchantGoodsPhoto.class);
        List<MerchantGoodsPhoto> MerchantGoodsPhotos =  merchantGoodsPhotoMapper.select(merchantGoodsPhoto);
        return DozerMapperUtil.mapList(MerchantGoodsPhotos,MerchantGoodsPhotoVo.class);
    }

    @Override
    public Page<MerchantGoodsPhotoVo> selectPage(Query<MerchantGoodsPhotoVo> query) {
        PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantGoodsPhoto merchantGoodsPhoto = DozerMapperUtil.map(query.getDate(),MerchantGoodsPhoto.class);
        List<MerchantGoodsPhoto> merchantGoodsPhotos =  merchantGoodsPhotoMapper.select(merchantGoodsPhoto);
        List<MerchantGoodsPhotoVo> merchantGoodsPhotoVos = DozerMapperUtil.mapList(merchantGoodsPhotos,MerchantGoodsPhotoVo.class);
        Page<MerchantGoodsPhotoVo> page = new Page<>();
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantGoodsPhotoVos);
        return  page;
    }

    @Override
    public int delete(MerchantGoodsPhotoVo var1) {
        MerchantGoodsPhoto merchantGoodsPhoto = DozerMapperUtil.map(var1,MerchantGoodsPhoto.class);
        return merchantGoodsPhotoMapper.delete(merchantGoodsPhoto);
    }

    @Override
    public int insert(MerchantGoodsPhotoVo var1) {
        MerchantGoodsPhoto merchantGoodsPhoto = DozerMapperUtil.map(var1,MerchantGoodsPhoto.class);
        return merchantGoodsPhotoMapper.insert(merchantGoodsPhoto);
    }

    @Override
    public int update(MerchantGoodsPhotoVo var1) {
        MerchantGoodsPhoto merchantGoodsPhoto = DozerMapperUtil.map(var1,MerchantGoodsPhoto.class);
        return merchantGoodsPhotoMapper.updateByPrimaryKey(merchantGoodsPhoto);
    }
}
