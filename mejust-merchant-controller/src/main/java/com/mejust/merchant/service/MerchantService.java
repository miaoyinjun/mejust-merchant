package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantMapper;
import com.mejust.merchant.model.Merchant;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

@Service
public class MerchantService implements BaseService<MerchantVo> {

    @Autowired
    private MerchantMapper merchantMapper;


    @Override
    public List<MerchantVo> selectAll() {
       List<Merchant> merchants =  merchantMapper.selectAll();
       return DozerMapperUtil.mapList(merchants,MerchantVo.class);
    }

    @Override
    public List<MerchantVo> select(MerchantVo var1) {
        Merchant merchant = DozerMapperUtil.map(var1,Merchant.class);
        List<Merchant> merchants =  merchantMapper.select(merchant);
        return DozerMapperUtil.mapList(merchants,MerchantVo.class);
    }

    @Override
    public Page<MerchantVo> selectPage(Query<MerchantVo> query) {
        com.github.pagehelper.Page pag =  PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        Merchant merchant = DozerMapperUtil.map(query.getDate(),Merchant.class);
        List<Merchant> merchants =  merchantMapper.select(merchant);
        List<MerchantVo> merchantVos = DozerMapperUtil.mapList(merchants,MerchantVo.class);
        Page<MerchantVo> page = new Page<>();
        page.setTotalCount(pag.getTotal());
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantVos);
        return  page;
    }


    @Override
    public int delete(MerchantVo var1) {
        Merchant merchant = DozerMapperUtil.map(var1,Merchant.class);
        return merchantMapper.delete(merchant);
    }

    @Override
    public int insert(MerchantVo var1) {
        Merchant merchant = DozerMapperUtil.map(var1,Merchant.class);
        return merchantMapper.insertSelective(merchant);
    }

    @Override
    public int update(MerchantVo var1) {
        Merchant merchant = DozerMapperUtil.map(var1,Merchant.class);
        return merchantMapper.updateByPrimaryKey(merchant);
    }
}
