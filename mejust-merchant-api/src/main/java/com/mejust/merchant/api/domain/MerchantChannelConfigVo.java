package com.mejust.merchant.api.domain;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantChannelConfigVo {
    private String merchantno;

    /**
     * 银行卡支付通道
     */
    private String yinkZftd;

    /**
     * 移动支付支付通道
     */
    private String ydzfZftd;

    /**
     * 清算通道方默认米珈清算
     */
    private String qstd;

    /**
     * 备注
     */
    private String remark;

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
     * 获取移动支付支付通道
     *
     * @return ydzf_zftd - 移动支付支付通道
     */
    public String getYdzfZftd() {
        return ydzfZftd;
    }

    /**
     * 设置移动支付支付通道
     *
     * @param ydzfZftd 移动支付支付通道
     */
    public void setYdzfZftd(String ydzfZftd) {
        this.ydzfZftd = ydzfZftd;
    }

    /**
     * 获取清算通道方默认米珈清算
     *
     * @return qstd - 清算通道方默认米珈清算
     */
    public String getQstd() {
        return qstd;
    }

    /**
     * 设置清算通道方默认米珈清算
     *
     * @param qstd 清算通道方默认米珈清算
     */
    public void setQstd(String qstd) {
        this.qstd = qstd;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}