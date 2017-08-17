package com.mejust.merchant.api.domain;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantMimoneyPayVo {
    /**
     * 商户米币购买单号
     */
    private String billno;

    /**
     * 购买日期
     */
    private Date paydate;

    /**
     * 付款方式代码
     */
    private String payno;

    /**
     * 商户编码
     */
    private String merchantno;

    /**
     * 购买金额
     */
    private BigDecimal payamount;

    /**
     * 获取商户米币购买单号
     *
     * @return billno - 商户米币购买单号
     */
    public String getBillno() {
        return billno;
    }

    /**
     * 设置商户米币购买单号
     *
     * @param billno 商户米币购买单号
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
     * 获取购买日期
     *
     * @return paydate - 购买日期
     */
    public Date getPaydate() {
        return paydate;
    }

    /**
     * 设置购买日期
     *
     * @param paydate 购买日期
     */
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    /**
     * 获取付款方式代码
     *
     * @return payno - 付款方式代码
     */
    public String getPayno() {
        return payno;
    }

    /**
     * 设置付款方式代码
     *
     * @param payno 付款方式代码
     */
    public void setPayno(String payno) {
        this.payno = payno;
    }

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
     * 获取购买金额
     *
     * @return payamount - 购买金额
     */
    public BigDecimal getPayamount() {
        return payamount;
    }

    /**
     * 设置购买金额
     *
     * @param payamount 购买金额
     */
    public void setPayamount(BigDecimal payamount) {
        this.payamount = payamount;
    }
}