package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantSaleVo;
import com.mejust.merchant.api.domain.MerchantSaleVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantSaleMapper;
import com.mejust.merchant.model.MerchantSale;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-9:16 PM
 **/

@Service
public class MerchantSaleService implements BaseService<MerchantSaleVo> {
    @Autowired
    private MerchantSaleMapper merchantSaleMapper;

    @Override
    public List<MerchantSaleVo> selectAll() {
        List<MerchantSale> merchantRedPacketInfoes =  merchantSaleMapper.selectAll();
        return DozerMapperUtil.mapList(merchantRedPacketInfoes,MerchantSaleVo.class);
    }

    @Override
    public List<MerchantSaleVo> select(MerchantSaleVo var1) {
        MerchantSale merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantSale.class);
        List<MerchantSale> merchants =  merchantSaleMapper.select(merchantRedPacketInfo);
        return DozerMapperUtil.mapList(merchants,MerchantSaleVo.class);
    }

    @Override
    public Page<MerchantSaleVo> selectPage(Query<MerchantSaleVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantSale merchantRedPacketInfo = DozerMapperUtil.map(query.getDate(),MerchantSale.class);
        List<MerchantSale> merchants =  merchantSaleMapper.select(merchantRedPacketInfo);
        List<MerchantSaleVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantSaleVo.class);
        Page<MerchantSaleVo> page = new Page<>();
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantVos);
        return  page;
    }

    @Override
    public int delete(MerchantSaleVo var1) {
        MerchantSale merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantSale.class);
        return merchantSaleMapper.delete(merchantRedPacketInfo);
    }

    @Override
    public int insert(MerchantSaleVo var1) {
        MerchantSale merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantSale.class);
        return merchantSaleMapper.insert(merchantRedPacketInfo);
    }

    @Override
    public int update(MerchantSaleVo var1) {
        MerchantSale merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantSale.class);
        return merchantSaleMapper.insert(merchantRedPacketInfo);
    }
}
