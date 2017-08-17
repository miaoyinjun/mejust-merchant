package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantRedPacketInfoVo;
import com.mejust.merchant.api.domain.MerchantRedPacketInfoVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantRedPacketInfoMapper;
import com.mejust.merchant.model.MerchantRedPacketInfo;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-9:02 PM
 **/

@Service
public class MerchantRedPacketInfoService  implements BaseService<MerchantRedPacketInfoVo> {
    @Autowired
    private MerchantRedPacketInfoMapper MerchantRedPacketInfoMapper;

    @Override
    public List<MerchantRedPacketInfoVo> selectAll() {
        List<MerchantRedPacketInfo> merchantRedPacketInfoes =  MerchantRedPacketInfoMapper.selectAll();
        return DozerMapperUtil.mapList(merchantRedPacketInfoes,MerchantRedPacketInfoVo.class);
    }

    @Override
    public List<MerchantRedPacketInfoVo> select(MerchantRedPacketInfoVo var1) {
        MerchantRedPacketInfo merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantRedPacketInfo.class);
        List<MerchantRedPacketInfo> merchants =  MerchantRedPacketInfoMapper.select(merchantRedPacketInfo);
        return DozerMapperUtil.mapList(merchants,MerchantRedPacketInfoVo.class);
    }

    @Override
    public Page<MerchantRedPacketInfoVo> selectPage(Query<MerchantRedPacketInfoVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantRedPacketInfo merchantRedPacketInfo = DozerMapperUtil.map(query.getDate(),MerchantRedPacketInfo.class);
        List<MerchantRedPacketInfo> merchants =  MerchantRedPacketInfoMapper.select(merchantRedPacketInfo);
        List<MerchantRedPacketInfoVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantRedPacketInfoVo.class);
        Page<MerchantRedPacketInfoVo> page = new Page<>();
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantVos);
        return  page;
    }

    @Override
    public int delete(MerchantRedPacketInfoVo var1) {
        MerchantRedPacketInfo merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantRedPacketInfo.class);
        return MerchantRedPacketInfoMapper.delete(merchantRedPacketInfo);
    }

    @Override
    public int insert(MerchantRedPacketInfoVo var1) {
        MerchantRedPacketInfo merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantRedPacketInfo.class);
        return MerchantRedPacketInfoMapper.insert(merchantRedPacketInfo);
    }

    @Override
    public int update(MerchantRedPacketInfoVo var1) {
        MerchantRedPacketInfo merchantRedPacketInfo = DozerMapperUtil.map(var1,MerchantRedPacketInfo.class);
        return MerchantRedPacketInfoMapper.insert(merchantRedPacketInfo);
    }
}
