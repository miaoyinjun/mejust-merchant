package com.mejust.merchant.api.domain;

import java.math.BigDecimal;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantMemberTjVo {
    /**
     * 会员卡号
     */
    private String cardno;

    /**
     * 商户编码或商场编码
     */
    private String merchantno;

    /**
     * 累计交易金额
     */
    private BigDecimal saleamount;

    /**
     * 累计交易次数
     */
    private Integer salecount;

    /**
     * 获取会员卡号
     *
     * @return cardno - 会员卡号
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设置会员卡号
     *
     * @param cardno 会员卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * 获取商户编码或商场编码
     *
     * @return merchantno - 商户编码或商场编码
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
     * 设置商户编码或商场编码
     *
     * @param merchantno 商户编码或商场编码
     */
    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }

    /**
     * 获取累计交易金额
     *
     * @return saleamount - 累计交易金额
     */
    public BigDecimal getSaleamount() {
        return saleamount;
    }

    /**
     * 设置累计交易金额
     *
     * @param saleamount 累计交易金额
     */
    public void setSaleamount(BigDecimal saleamount) {
        this.saleamount = saleamount;
    }

    /**
     * 获取累计交易次数
     *
     * @return salecount - 累计交易次数
     */
    public Integer getSalecount() {
        return salecount;
    }

    /**
     * 设置累计交易次数
     *
     * @param salecount 累计交易次数
     */
    public void setSalecount(Integer salecount) {
        this.salecount = salecount;
    }
}