package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantSkzfConfigurationVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantSkzfConfigurationMapper;
import com.mejust.merchant.model.MerchantSkzfConfiguration;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-8:58 PM
 **/

@Service
public class MerchantSkzfConfigurationService implements BaseService<MerchantSkzfConfigurationVo> {
    @Autowired
    private MerchantSkzfConfigurationMapper merchantShopProcessMapper;

    @Override
    public List<MerchantSkzfConfigurationVo> selectAll() {
        List<MerchantSkzfConfiguration> merchantShopProcesses =  merchantShopProcessMapper.selectAll();
        return DozerMapperUtil.mapList(merchantShopProcesses,MerchantSkzfConfigurationVo.class);
    }

    @Override
    public List<MerchantSkzfConfigurationVo> select(MerchantSkzfConfigurationVo var1) {
        MerchantSkzfConfiguration merchantShopProcess = DozerMapperUtil.map(var1,MerchantSkzfConfiguration.class);
        List<MerchantSkzfConfiguration> merchants =  merchantShopProcessMapper.select(merchantShopProcess);
        return DozerMapperUtil.mapList(merchants,MerchantSkzfConfigurationVo.class);
    }

    @Override
    public Page<MerchantSkzfConfigurationVo> selectPage(Query<MerchantSkzfConfigurationVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantSkzfConfiguration merchantShopProcess = DozerMapperUtil.map(query.getDate(),MerchantSkzfConfiguration.class);
        List<MerchantSkzfConfiguration> merchants =  merchantShopProcessMapper.select(merchantShopProcess);
        List<MerchantSkzfConfigurationVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantSkzfConfigurationVo.class);
        Page<MerchantSkzfConfigurationVo> page = new Page<>();
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantVos);
        return  page;
    }

    @Override
    public int delete(MerchantSkzfConfigurationVo var1) {
        MerchantSkzfConfiguration merchantShopProcess = DozerMapperUtil.map(var1,MerchantSkzfConfiguration.class);
        return merchantShopProcessMapper.delete(merchantShopProcess);
    }

    @Override
    public int insert(MerchantSkzfConfigurationVo var1) {
        MerchantSkzfConfiguration merchantShopProcess = DozerMapperUtil.map(var1,MerchantSkzfConfiguration.class);
        return merchantShopProcessMapper.insert(merchantShopProcess);
    }

    @Override
    public int update(MerchantSkzfConfigurationVo var1) {
        MerchantSkzfConfiguration merchantShopProcess = DozerMapperUtil.map(var1,MerchantSkzfConfiguration.class);
        return merchantShopProcessMapper.insert(merchantShopProcess);
    }
}
