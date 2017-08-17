package com.mejust.merchant.api.rao;

import com.mejust.merchant.api.domain.MerchantSaleVo;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商户RAO
 *
 * @author wangmingsen
 * @create 2017-08-15-1:39 PM
 **/


@RequestMapping("/merchantSale")
public interface MerchantSaleRao extends BaseRao<MerchantSaleVo> {


}
