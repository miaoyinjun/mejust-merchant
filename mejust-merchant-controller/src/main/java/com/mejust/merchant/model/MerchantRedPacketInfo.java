package com.mejust.merchant.model;

import javax.persistence.*;

@Table(name = "t_m_merchant_redinfo")
public class MerchantRedPacketInfo {
    /**
     * 商户编码
     */
    @Id
    private String merchantno;

    /**
     * 红包规格编码
     */
    @Id
    private String redmodelno;

    /**
     * 红包数量
     */
    private Integer rednum;

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

    /**
     * 获取红包规格编码
     *
     * @return redmodelno - 红包规格编码
     */
    public String getRedmodelno() {
        return redmodelno;
    }

    /**
     * 设置红包规格编码
     *
     * @param redmodelno 红包规格编码
     */
    public void setRedmodelno(String redmodelno) {
        this.redmodelno = redmodelno;
    }

    /**
     * 获取红包数量
     *
     * @return rednum - 红包数量
     */
    public Integer getRednum() {
        return rednum;
    }

    /**
     * 设置红包数量
     *
     * @param rednum 红包数量
     */
    public void setRednum(Integer rednum) {
        this.rednum = rednum;
    }
}