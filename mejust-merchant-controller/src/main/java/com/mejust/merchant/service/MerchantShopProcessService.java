package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantShopProcessVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantShopProcessMapper;
import com.mejust.merchant.model.MerchantShopProcess;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商户开店进程服务
 *
 * @author wangmingsen
 * @create 2017-08-15-4:01 PM
 **/

@Service
public class MerchantShopProcessService implements BaseService<MerchantShopProcessVo> {

    @Autowired
    private MerchantShopProcessMapper merchantShopProcessMapper;

    @Override
    public List<MerchantShopProcessVo> selectAll() {
        List<MerchantShopProcess> merchantShopProcesses =  merchantShopProcessMapper.selectAll();
        return DozerMapperUtil.mapList(merchantShopProcesses,MerchantShopProcessVo.class);
    }

    @Override
    public List<MerchantShopProcessVo> select(MerchantShopProcessVo var1) {
        MerchantShopProcess merchantShopProcess = DozerMapperUtil.map(var1,MerchantShopProcess.class);
        List<MerchantShopProcess> merchants =  merchantShopProcessMapper.select(merchantShopProcess);
        return DozerMapperUtil.mapList(merchants,MerchantShopProcessVo.class);
    }

    @Override
    public Page<MerchantShopProcessVo> selectPage(Query<MerchantShopProcessVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantShopProcess merchantShopProcess = DozerMapperUtil.map(query.getDate(),MerchantShopProcess.class);
        List<MerchantShopProcess> merchants =  merchantShopProcessMapper.select(merchantShopProcess);
        List<MerchantShopProcessVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantShopProcessVo.class);
        Page<MerchantShopProcessVo> page = new Page<>();
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantVos);
        return  page;
    }

    @Override
    public int delete(MerchantShopProcessVo var1) {
        MerchantShopProcess merchantShopProcess = DozerMapperUtil.map(var1,MerchantShopProcess.class);
        return merchantShopProcessMapper.delete(merchantShopProcess);
    }

    @Override
    public int insert(MerchantShopProcessVo var1) {
        MerchantShopProcess merchantShopProcess = DozerMapperUtil.map(var1,MerchantShopProcess.class);
        return merchantShopProcessMapper.insert(merchantShopProcess);
    }

    @Override
    public int update(MerchantShopProcessVo var1) {
        MerchantShopProcess merchantShopProcess = DozerMapperUtil.map(var1,MerchantShopProcess.class);
        return merchantShopProcessMapper.insert(merchantShopProcess);
    }
}
