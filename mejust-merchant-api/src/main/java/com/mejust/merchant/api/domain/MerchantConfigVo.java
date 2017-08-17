package com.mejust.merchant.api.domain;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantConfigVo {
    /**
     * 商户编码
     */
    private String merchantno;

    /**
     * 配置类型
     */
    private String ctrltype;

    /**
     * 配置值
     */
    private String ctrlno;

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
     * 获取配置类型
     *
     * @return ctrltype - 配置类型
     */
    public String getCtrltype() {
        return ctrltype;
    }

    /**
     * 设置配置类型
     *
     * @param ctrltype 配置类型
     */
    public void setCtrltype(String ctrltype) {
        this.ctrltype = ctrltype;
    }

    /**
     * 获取配置值
     *
     * @return ctrlno - 配置值
     */
    public String getCtrlno() {
        return ctrlno;
    }

    /**
     * 设置配置值
     *
     * @param ctrlno 配置值
     */
    public void setCtrlno(String ctrlno) {
        this.ctrlno = ctrlno;
    }
}