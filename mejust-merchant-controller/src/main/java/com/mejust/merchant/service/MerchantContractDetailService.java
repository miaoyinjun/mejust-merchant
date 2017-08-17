package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantContractDetailVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantContractDetailMapper;
import com.mejust.merchant.model.MerchantContractDetail;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 商户合作折扣多扣点信息表
 * Created by heshuai on 2017/8/15.
 */
public class MerchantContractDetailService implements BaseService<MerchantContractDetailVo>  {

    @Autowired
    MerchantContractDetailMapper merchantContractDetailMapper;


    @Override
    public List<MerchantContractDetailVo> selectAll() {
        List<MerchantContractDetail> merchantContractDetails =  merchantContractDetailMapper.selectAll();
        return DozerMapperUtil.mapList(merchantContractDetails, MerchantContractDetailVo.class);
    }

    @Override
    public List<MerchantContractDetailVo> select(MerchantContractDetailVo var1) {
        MerchantContractDetail merchantContractDetail = DozerMapperUtil.map(var1,MerchantContractDetail.class);
        List<MerchantContractDetail> merchantContractDetails =  merchantContractDetailMapper.select(merchantContractDetail);
        return DozerMapperUtil.mapList(merchantContractDetails,MerchantContractDetailVo.class);
    }

    @Override
    public Page<MerchantContractDetailVo> selectPage(Query<MerchantContractDetailVo> query) {
        PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantContractDetail merchantContractDetail = DozerMapperUtil.map(query.getDate(),MerchantContractDetail.class);
        List<MerchantContractDetail> merchantContractDetails =  merchantContractDetailMapper.select(merchantContractDetail);
        List<MerchantContractDetailVo> merchantContractDetailVos = DozerMapperUtil.mapList(merchantContractDetails,MerchantContractDetailVo.class);
        Page<MerchantContractDetailVo> page = new Page<>();
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantContractDetailVos);
        return  page;
    }

    @Override
    public int delete(MerchantContractDetailVo var1) {
        MerchantContractDetail merchantContractDetail = DozerMapperUtil.map(var1,MerchantContractDetail.class);
        return merchantContractDetailMapper.delete(merchantContractDetail);
    }

    @Override
    public int insert(MerchantContractDetailVo var1) {
        MerchantContractDetail merchantContractDetail = DozerMapperUtil.map(var1,MerchantContractDetail.class);
        return merchantContractDetailMapper.insert(merchantContractDetail);
    }

    @Override
    public int update(MerchantContractDetailVo var1) {
        MerchantContractDetail merchantContractDetail = DozerMapperUtil.map(var1,MerchantContractDetail.class);
        return merchantContractDetailMapper.updateByPrimaryKey(merchantContractDetail);
    }
}
