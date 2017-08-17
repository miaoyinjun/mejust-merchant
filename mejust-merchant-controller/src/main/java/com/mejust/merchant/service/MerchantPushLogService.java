package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantPushLogVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantPushLogMapper;
import com.mejust.merchant.model.MerchantPushLog;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-4:21 PM
 **/

@Service
public class MerchantPushLogService implements BaseService<MerchantPushLogVo> {

    @Autowired
    private MerchantPushLogMapper merchantPushLogMapper;


    @Override
    public List<MerchantPushLogVo> selectAll() {
        List<MerchantPushLog> merchants =  merchantPushLogMapper.selectAll();
        return DozerMapperUtil.mapList(merchants,MerchantPushLogVo.class);
    }

    @Override
    public List<MerchantPushLogVo> select(MerchantPushLogVo var1) {
        MerchantPushLog merchant = DozerMapperUtil.map(var1,MerchantPushLog.class);
        List<MerchantPushLog> merchants =  merchantPushLogMapper.select(merchant);
        return DozerMapperUtil.mapList(merchants,MerchantPushLogVo.class);
    }

    @Override
    public Page<MerchantPushLogVo> selectPage(Query<MerchantPushLogVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantPushLog merchant = DozerMapperUtil.map(query.getDate(),MerchantPushLog.class);
        List<MerchantPushLog> merchants =  merchantPushLogMapper.select(merchant);
        List<MerchantPushLogVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantPushLogVo.class);
        Page<MerchantPushLogVo> page = new Page<>();
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantVos);
        return  page;
    }


    @Override
    public int delete(MerchantPushLogVo var1) {
        MerchantPushLog merchant = DozerMapperUtil.map(var1,MerchantPushLog.class);
        return merchantPushLogMapper.delete(merchant);
    }

    @Override
    public int insert(MerchantPushLogVo var1) {
        MerchantPushLog merchant = DozerMapperUtil.map(var1,MerchantPushLog.class);
        return merchantPushLogMapper.insertSelective(merchant);
    }

    @Override
    public int update(MerchantPushLogVo var1) {
        MerchantPushLog merchant = DozerMapperUtil.map(var1,MerchantPushLog.class);
        return merchantPushLogMapper.updateByPrimaryKeySelective(merchant);
    }
}
