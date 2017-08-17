package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantAdvertPayVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantAdvertPayMapper;
import com.mejust.merchant.model.MerchantAdvertPay;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商户广告位购买单
 * Created by heshuai on 2017/8/15.
 */
@Service
public class MerchantAdvertPayService implements BaseService<MerchantAdvertPayVo> {



    @Autowired
    MerchantAdvertPayMapper merchantAdvertPayMapper;


    @Override
    public List<MerchantAdvertPayVo> selectAll() {
        List<MerchantAdvertPay> merchantAdvertPays =  merchantAdvertPayMapper.selectAll();
        return DozerMapperUtil.mapList(merchantAdvertPays, MerchantAdvertPayVo.class);
    }

    @Override
    public List<MerchantAdvertPayVo> select(MerchantAdvertPayVo var1) {
        MerchantAdvertPay merchantAdvertPay = DozerMapperUtil.map(var1,MerchantAdvertPay.class);
        List<MerchantAdvertPay> merchantAdvertPays =  merchantAdvertPayMapper.select(merchantAdvertPay);
        return DozerMapperUtil.mapList(merchantAdvertPays,MerchantAdvertPayVo.class);
    }

    @Override
    public Page<MerchantAdvertPayVo> selectPage(Query<MerchantAdvertPayVo> query) {
        PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantAdvertPay merchantAdvertPay = DozerMapperUtil.map(query.getDate(),MerchantAdvertPay.class);
        List<MerchantAdvertPay> merchantAdvertPays =  merchantAdvertPayMapper.select(merchantAdvertPay);
        List<MerchantAdvertPayVo> merchantAdvertPayVos = DozerMapperUtil.mapList(merchantAdvertPays,MerchantAdvertPayVo.class);
        Page<MerchantAdvertPayVo> page = new Page<>();
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantAdvertPayVos);
        return  page;
    }


    @Override
    public int delete(MerchantAdvertPayVo var1) {
        MerchantAdvertPay merchantAdvertPay = DozerMapperUtil.map(var1,MerchantAdvertPay.class);
        return merchantAdvertPayMapper.delete(merchantAdvertPay);
    }

    @Override
    public int insert(MerchantAdvertPayVo var1) {
        MerchantAdvertPay merchantAdvertPay = DozerMapperUtil.map(var1,MerchantAdvertPay.class);
        return merchantAdvertPayMapper.insert(merchantAdvertPay);
    }

    @Override
    public int update(MerchantAdvertPayVo var1) {
        MerchantAdvertPay merchantAdvertPay = DozerMapperUtil.map(var1,MerchantAdvertPay.class);
        return merchantAdvertPayMapper.updateByPrimaryKey(merchantAdvertPay);
    }
}
