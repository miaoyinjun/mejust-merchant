package com.mejust.merchant.api.domain.rao;

/**
 * 商户广告位购买单Rao
 * Created by heshuai on 2017/8/15.
 */

import com.mejust.merchant.api.domain.MerchantAdvertPayVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "merchant-service")
@RequestMapping("/merchantAdvertPay")
public interface MerchantAdvertPayRao extends BaseRao<MerchantAdvertPayVo> {


}
