package com.mejust.merchant.api.domain;

import java.util.Date;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantVisitorVo {
    /**
     * 商户编码
     */
    private String merchantno;

    /**
     * 访问日期
     */
    private Date visitordate;

    /**
     * 访客会员卡号
     */
    private String cardno;

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
     * 获取访问日期
     *
     * @return visitordate - 访问日期
     */
    public Date getVisitordate() {
        return visitordate;
    }

    /**
     * 设置访问日期
     *
     * @param visitordate 访问日期
     */
    public void setVisitordate(Date visitordate) {
        this.visitordate = visitordate;
    }

    /**
     * 获取访客会员卡号
     *
     * @return cardno - 访客会员卡号
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设置访客会员卡号
     *
     * @param cardno 访客会员卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }
}