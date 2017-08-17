package com.mejust.merchant.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_m_m_money_give")
public class MerchantMimoneyGive {
    /**
     * 赠送单号
     */
    private String billno;

    /**
     * 送出商户编码
     */
    private String merchantno;

    /**
     * 接赠会员卡号
     */
    private String cardno;

    /**
     * 赠送日期
     */
    private Date givedate;

    /**
     * 赠送金额
     */
    private BigDecimal giveamount;

    /**
     * 获取赠送单号
     *
     * @return billno - 赠送单号
     */
    public String getBillno() {
        return billno;
    }

    /**
     * 设置赠送单号
     *
     * @param billno 赠送单号
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
     * 获取送出商户编码
     *
     * @return merchantno - 送出商户编码
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
     * 设置送出商户编码
     *
     * @param merchantno 送出商户编码
     */
    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }

    /**
     * 获取接赠会员卡号
     *
     * @return cardno - 接赠会员卡号
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设置接赠会员卡号
     *
     * @param cardno 接赠会员卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * 获取赠送日期
     *
     * @return givedate - 赠送日期
     */
    public Date getGivedate() {
        return givedate;
    }

    /**
     * 设置赠送日期
     *
     * @param givedate 赠送日期
     */
    public void setGivedate(Date givedate) {
        this.givedate = givedate;
    }

    /**
     * 获取赠送金额
     *
     * @return giveamount - 赠送金额
     */
    public BigDecimal getGiveamount() {
        return giveamount;
    }

    /**
     * 设置赠送金额
     *
     * @param giveamount 赠送金额
     */
    public void setGiveamount(BigDecimal giveamount) {
        this.giveamount = giveamount;
    }
}