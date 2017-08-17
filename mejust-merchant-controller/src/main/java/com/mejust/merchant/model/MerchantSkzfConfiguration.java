package com.mejust.merchant.model;

import javax.persistence.*;

@Table(name = "t_m_merchant_skzf_key")
public class MerchantSkzfConfiguration {
    @Id
    private String merchantno;

    /**
     * 银行卡支付通道
     */
    @Id
    @Column(name = "yink_zftd")
    private String yinkZftd;

    @Id
    private String paycardno;

    /**
     * 商户机构代码
     */
    private String orgcode;

    private String deviceno;

    /**
     * @return merchantno
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
     * @param merchantno
     */
    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }

    /**
     * 获取银行卡支付通道
     *
     * @return yink_zftd - 银行卡支付通道
     */
    public String getYinkZftd() {
        return yinkZftd;
    }

    /**
     * 设置银行卡支付通道
     *
     * @param yinkZftd 银行卡支付通道
     */
    public void setYinkZftd(String yinkZftd) {
        this.yinkZftd = yinkZftd;
    }

    /**
     * @return paycardno
     */
    public String getPaycardno() {
        return paycardno;
    }

    /**
     * @param paycardno
     */
    public void setPaycardno(String paycardno) {
        this.paycardno = paycardno;
    }

    /**
     * 获取商户机构代码
     *
     * @return orgcode - 商户机构代码
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * 设置商户机构代码
     *
     * @param orgcode 商户机构代码
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    /**
     * @return deviceno
     */
    public String getDeviceno() {
        return deviceno;
    }

    /**
     * @param deviceno
     */
    public void setDeviceno(String deviceno) {
        this.deviceno = deviceno;
    }
}