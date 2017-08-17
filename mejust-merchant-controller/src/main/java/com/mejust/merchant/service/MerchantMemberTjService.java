package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantMemberTjVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantMemberTjMapper;
import com.mejust.merchant.model.MerchantMemberTj;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-9:09 PM
 **/

@Service
public class MerchantMemberTjService implements BaseService<MerchantMemberTjVo> {

    @Autowired
    private MerchantMemberTjMapper merchantMemberTjMapper;

    @Override
    public List<MerchantMemberTjVo> selectAll() {
        List<MerchantMemberTj> merchantRedPacketInfoes =  merchantMemberTjMapper.selectAll();
        return DozerMapperUtil.mapList(merchantRedPacketInfoes,MerchantMemberTjVo.class);
    }

    @Override
    public List<MerchantMemberTjVo> select(MerchantMemberTjVo var1) {
        MerchantMemberTj merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantMemberTj.class);
        List<MerchantMemberTj> merchants =  merchantMemberTjMapper.select(merchantRedPacketInfo);
        return DozerMapperUtil.mapList(merchants,MerchantMemberTjVo.class);
    }

    @Override
    public Page<MerchantMemberTjVo> selectPage(Query<MerchantMemberTjVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantMemberTj merchantRedPacketInfo = DozerMapperUtil.map(query.getDate(),MerchantMemberTj.class);
        List<MerchantMemberTj> merchants =  merchantMemberTjMapper.select(merchantRedPacketInfo);
        List<MerchantMemberTjVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantMemberTjVo.class);
        Page<MerchantMemberTjVo> page = new Page<>();
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantVos);
        return  page;
    }

    @Override
    public int delete(MerchantMemberTjVo var1) {
        MerchantMemberTj merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantMemberTj.class);
        return merchantMemberTjMapper.delete(merchantRedPacketInfo);
    }

    @Override
    public int insert(MerchantMemberTjVo var1) {
        MerchantMemberTj merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantMemberTj.class);
        return merchantMemberTjMapper.insert(merchantRedPacketInfo);
    }

    @Override
    public int update(MerchantMemberTjVo var1) {
        MerchantMemberTj merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantMemberTj.class);
        return merchantMemberTjMapper.insert(merchantRedPacketInfo);
    }
}
