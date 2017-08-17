package com.mejust.merchant.api.domain.rao;

import com.mejust.merchant.api.domain.MerchantContractDetailVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商户合作折扣多扣点信息Rao
 * Created by heshuai on 2017/8/15.
 */
@FeignClient(name = "merchant-service")
@RequestMapping("/merchantContractDetail")
public interface MerchantContractDetailRao extends BaseRao<MerchantContractDetailVo> {
}
