package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantPhotoVo;
import com.mejust.merchant.api.domain.MerchantPhotoVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantMapper;
import com.mejust.merchant.dao.MerchantPhotoMapper;
import com.mejust.merchant.model.Merchant;
import com.mejust.merchant.model.MerchantPhoto;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

@Service
public class MerchantPhotoService implements BaseService<MerchantPhotoVo> {

    @Autowired
    private MerchantPhotoMapper merchantMapper;


    @Override
    public List<MerchantPhotoVo> selectAll() {
       List<MerchantPhoto> merchants =  merchantMapper.selectAll();
       return DozerMapperUtil.mapList(merchants,MerchantPhotoVo.class);
    }

    @Override
    public List<MerchantPhotoVo> select(MerchantPhotoVo var1) {
        MerchantPhoto merchant = DozerMapperUtil.map(var1,MerchantPhoto.class);
        List<MerchantPhoto> merchants =  merchantMapper.select(merchant);
        return DozerMapperUtil.mapList(merchants,MerchantPhotoVo.class);
    }

    @Override
    public Page<MerchantPhotoVo> selectPage(Query<MerchantPhotoVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantPhoto merchant = DozerMapperUtil.map(query.getDate(),MerchantPhoto.class);
        List<MerchantPhoto> merchants =  merchantMapper.select(merchant);
        List<MerchantPhotoVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantPhotoVo.class);
        Page<MerchantPhotoVo> page = new Page<>();
        page.setList(merchantVos);
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        return  page;
    }


    @Override
    public int delete(MerchantPhotoVo var1) {
        MerchantPhoto merchant = DozerMapperUtil.map(var1,MerchantPhoto.class);
        return merchantMapper.delete(merchant);
    }

    @Override
    public int insert(MerchantPhotoVo var1) {
        MerchantPhoto merchant = DozerMapperUtil.map(var1,MerchantPhoto.class);
        return merchantMapper.insertSelective(merchant);
    }

    @Override
    public int update(MerchantPhotoVo var1) {
        MerchantPhoto merchant = DozerMapperUtil.map(var1,MerchantPhoto.class);
        return merchantMapper.updateByPrimaryKey(merchant);
    }
}
