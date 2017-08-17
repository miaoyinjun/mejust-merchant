package com.mejust.merchant.model;

import javax.persistence.*;

@Table(name = "t_m_merchant_sale")
public class MerchantSale {
    /**
     * 商户编码
     */
    @Id
    private String merchantno;

    /**
     * 获取商户编码
     *
     * @return merchantno - 商户编码
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
     * 设置商户编码
     *
     * @param merchantno 商户编码
     */
    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }
}