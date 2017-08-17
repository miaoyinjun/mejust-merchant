package com.mejust.merchant.api.domain.rao;

import com.mejust.merchant.api.domain.MerchantContractVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商户合作条件信息Rao
 * Created by heshuai on 2017/8/15.
 */
@FeignClient(name = "merchant-service")
@RequestMapping("/merchantContract")
public interface MerchantContractRao extends BaseRao<MerchantContractVo>  {
}
