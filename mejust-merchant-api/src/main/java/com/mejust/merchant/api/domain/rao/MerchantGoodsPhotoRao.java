package com.mejust.merchant.api.domain.rao;

/**
 *
 * Created by heshuai on 2017/8/15.
 */

import com.mejust.merchant.api.domain.MerchantGoodsPhotoVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品图片信息Rao
 * Created by heshuai on 2017/8/15.
 */
@FeignClient(name = "merchant-service")
@RequestMapping("/merchantGoodsPhoto")
public interface MerchantGoodsPhotoRao extends BaseRao<MerchantGoodsPhotoVo> {
}
