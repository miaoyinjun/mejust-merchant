package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantVisitorVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantVisitorMapper;
import com.mejust.merchant.model.MerchantVisitor;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-9:20 PM
 **/

@Service
public class MerchantVisitorService implements BaseService<MerchantVisitorVo> {
    @Autowired
    private MerchantVisitorMapper merchantVisitorMapper;

    @Override
    public List<MerchantVisitorVo> selectAll() {
        List<MerchantVisitor> merchantRedPacketInfoes =  merchantVisitorMapper.selectAll();
        return DozerMapperUtil.mapList(merchantRedPacketInfoes,MerchantVisitorVo.class);
    }

    @Override
    public List<MerchantVisitorVo> select(MerchantVisitorVo var1) {
        MerchantVisitor merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantVisitor.class);
        List<MerchantVisitor> merchants =  merchantVisitorMapper.select(merchantRedPacketInfo);
        return DozerMapperUtil.mapList(merchants,MerchantVisitorVo.class);
    }

    @Override
    public Page<MerchantVisitorVo> selectPage(Query<MerchantVisitorVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantVisitor merchantRedPacketInfo = DozerMapperUtil.map(query.getDate(),MerchantVisitor.class);
        List<MerchantVisitor> merchants =  merchantVisitorMapper.select(merchantRedPacketInfo);
        List<MerchantVisitorVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantVisitorVo.class);
        Page<MerchantVisitorVo> page = new Page<>();
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantVos);
        return  page;
    }

    @Override
    public int delete(MerchantVisitorVo var1) {
        MerchantVisitor merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantVisitor.class);
        return merchantVisitorMapper.delete(merchantRedPacketInfo);
    }

    @Override
    public int insert(MerchantVisitorVo var1) {
        MerchantVisitor merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantVisitor.class);
        return merchantVisitorMapper.insert(merchantRedPacketInfo);
    }

    @Override
    public int update(MerchantVisitorVo var1) {
        MerchantVisitor merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantVisitor.class);
        return merchantVisitorMapper.insert(merchantRedPacketInfo);
    }
}
