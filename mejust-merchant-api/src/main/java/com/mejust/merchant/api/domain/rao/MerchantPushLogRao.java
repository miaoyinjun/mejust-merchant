package com.mejust.merchant.api.domain.rao;

import com.mejust.merchant.api.domain.MerchantPushLogVo;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangmingsen
 * @create 2017-08-15-4:43 PM
 **/

@RequestMapping("/merchantPushLog")
public interface MerchantPushLogRao extends BaseRao<MerchantPushLogVo> {
}
