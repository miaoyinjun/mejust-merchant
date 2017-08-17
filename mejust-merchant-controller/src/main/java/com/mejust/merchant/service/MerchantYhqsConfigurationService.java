package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantYhqsConfigurationVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantYhqsConfigurationMapper;
import com.mejust.merchant.model.MerchantYhqsConfiguration;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-8:58 PM
 **/

@Service
public class MerchantYhqsConfigurationService implements BaseService<MerchantYhqsConfigurationVo> {
    @Autowired
    private MerchantYhqsConfigurationMapper merchantShopProcessMapper;

    @Override
    public List<MerchantYhqsConfigurationVo> selectAll() {
        List<MerchantYhqsConfiguration> merchantShopProcesses =  merchantShopProcessMapper.selectAll();
        return DozerMapperUtil.mapList(merchantShopProcesses,MerchantYhqsConfigurationVo.class);
    }

    @Override
    public List<MerchantYhqsConfigurationVo> select(MerchantYhqsConfigurationVo var1) {
        MerchantYhqsConfiguration merchantShopProcess = DozerMapperUtil.map(var1,MerchantYhqsConfiguration.class);
        List<MerchantYhqsConfiguration> merchants =  merchantShopProcessMapper.select(merchantShopProcess);
        return DozerMapperUtil.mapList(merchants,MerchantYhqsConfigurationVo.class);
    }

    @Override
    public Page<MerchantYhqsConfigurationVo> selectPage(Query<MerchantYhqsConfigurationVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantYhqsConfiguration merchantShopProcess = DozerMapperUtil.map(query.getDate(),MerchantYhqsConfiguration.class);
        List<MerchantYhqsConfiguration> merchants =  merchantShopProcessMapper.select(merchantShopProcess);
        List<MerchantYhqsConfigurationVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantYhqsConfigurationVo.class);
        Page<MerchantYhqsConfigurationVo> page = new Page<>();
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantVos);
        return  page;
    }

    @Override
    public int delete(MerchantYhqsConfigurationVo var1) {
        MerchantYhqsConfiguration merchantShopProcess = DozerMapperUtil.map(var1,MerchantYhqsConfiguration.class);
        return merchantShopProcessMapper.delete(merchantShopProcess);
    }

    @Override
    public int insert(MerchantYhqsConfigurationVo var1) {
        MerchantYhqsConfiguration merchantShopProcess = DozerMapperUtil.map(var1,MerchantYhqsConfiguration.class);
        return merchantShopProcessMapper.insert(merchantShopProcess);
    }

    @Override
    public int update(MerchantYhqsConfigurationVo var1) {
        MerchantYhqsConfiguration merchantShopProcess = DozerMapperUtil.map(var1,MerchantYhqsConfiguration.class);
        return merchantShopProcessMapper.insert(merchantShopProcess);
    }
}
