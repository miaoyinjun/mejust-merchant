package com.mejust.merchant.api.domain;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantMemberVo {
    /**
     * 会员卡号
     */
    private String cardno;

    /**
     * 商户编码或商场编码
     */
    private String merchantno;

    /**
     * 积分金额
     */
    private BigDecimal integralamount;

    /**
     * 电子米币金额
     */
    private BigDecimal mMoneyEle;

    /**
     * 电子米币效期
     */
    private Date mMoneyEleDate;

    /**
     * 积分类型
     */
    private String integraltype;

    /**
     * 会员积分等级
     */
    private Short memgrade;

    /**
     * 会员积分等级升级日期
     */
    private Date memgradedate;

    /**
     * 会员加入日期
     */
    private Date createdate;

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
     * 获取积分金额
     *
     * @return integralamount - 积分金额
     */
    public BigDecimal getIntegralamount() {
        return integralamount;
    }

    /**
     * 设置积分金额
     *
     * @param integralamount 积分金额
     */
    public void setIntegralamount(BigDecimal integralamount) {
        this.integralamount = integralamount;
    }

    /**
     * 获取电子米币金额
     *
     * @return m_money_ele - 电子米币金额
     */
    public BigDecimal getmMoneyEle() {
        return mMoneyEle;
    }

    /**
     * 设置电子米币金额
     *
     * @param mMoneyEle 电子米币金额
     */
    public void setmMoneyEle(BigDecimal mMoneyEle) {
        this.mMoneyEle = mMoneyEle;
    }

    /**
     * 获取电子米币效期
     *
     * @return m_money_ele_date - 电子米币效期
     */
    public Date getmMoneyEleDate() {
        return mMoneyEleDate;
    }

    /**
     * 设置电子米币效期
     *
     * @param mMoneyEleDate 电子米币效期
     */
    public void setmMoneyEleDate(Date mMoneyEleDate) {
        this.mMoneyEleDate = mMoneyEleDate;
    }

    /**
     * 获取积分类型
     *
     * @return integraltype - 积分类型
     */
    public String getIntegraltype() {
        return integraltype;
    }

    /**
     * 设置积分类型
     *
     * @param integraltype 积分类型
     */
    public void setIntegraltype(String integraltype) {
        this.integraltype = integraltype;
    }

    /**
     * 获取会员积分等级
     *
     * @return memgrade - 会员积分等级
     */
    public Short getMemgrade() {
        return memgrade;
    }

    /**
     * 设置会员积分等级
     *
     * @param memgrade 会员积分等级
     */
    public void setMemgrade(Short memgrade) {
        this.memgrade = memgrade;
    }

    /**
     * 获取会员积分等级升级日期
     *
     * @return memgradedate - 会员积分等级升级日期
     */
    public Date getMemgradedate() {
        return memgradedate;
    }

    /**
     * 设置会员积分等级升级日期
     *
     * @param memgradedate 会员积分等级升级日期
     */
    public void setMemgradedate(Date memgradedate) {
        this.memgradedate = memgradedate;
    }

    /**
     * 获取会员加入日期
     *
     * @return createdate - 会员加入日期
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置会员加入日期
     *
     * @param createdate 会员加入日期
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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