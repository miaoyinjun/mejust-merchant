package com.mejust.merchant.service;

import com.github.pagehelper.PageHelper;
import com.mejust.merchant.api.domain.MerchantContractVo;
import com.mejust.merchant.api.domain.Page;
import com.mejust.merchant.api.domain.Query;
import com.mejust.merchant.dao.MerchantContractMapper;
import com.mejust.merchant.model.MerchantContract;
import com.mejust.merchant.utils.DozerMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品图片信息表
 * Created by heshuai on 2017/8/15.
 */
@Service
public class MerchantContractService implements BaseService<MerchantContractVo> {


    @Autowired
    MerchantContractMapper merchantContractMapper;



    @Override
    public List<MerchantContractVo> selectAll() {
        List<MerchantContract> merchantContracts =  merchantContractMapper.selectAll();
        return DozerMapperUtil.mapList(merchantContracts, MerchantContractVo.class);
    }

    @Override
    public List<MerchantContractVo> select(MerchantContractVo var1) {
        MerchantContract merchantContract = DozerMapperUtil.map(var1,MerchantContract.class);
        List<MerchantContract> merchantContracts =  merchantContractMapper.select(merchantContract);
        return DozerMapperUtil.mapList(merchantContracts,MerchantContractVo.class);
    }

    @Override
    public Page<MerchantContractVo> selectPage(Query<MerchantContractVo> query) {
        PageHelper.startPage(query.getCurrentPage(), query.getPageSize());
        MerchantContract merchantContract = DozerMapperUtil.map(query.getDate(),MerchantContract.class);
        List<MerchantContract> merchantContracts =  merchantContractMapper.select(merchantContract);
        List<MerchantContractVo> merchantContractsVos = DozerMapperUtil.mapList(merchantContracts,MerchantContractVo.class);
        Page<MerchantContractVo> page = new Page<>();
        page.setCurrentPage(query.getCurrentPage());
        page.setPageSize(query.getPageSize());
        page.setList(merchantContractsVos);
        return  page;
    }

    @Override
    public int delete(MerchantContractVo var1) {
        MerchantContract merchantContract = DozerMapperUtil.map(var1,MerchantContract.class);
        return merchantContractMapper.delete(merchantContract);
    }

    @Override
    public int insert(MerchantContractVo var1) {
        MerchantContract merchantContract = DozerMapperUtil.map(var1,MerchantContract.class);
        return merchantContractMapper.insert(merchantContract);
    }

    @Override
    public int update(MerchantContractVo var1) {
        MerchantContract merchantContract = DozerMapperUtil.map(var1,MerchantContract.class);
        return merchantContractMapper.updateByPrimaryKey(merchantContract);
    }
}
