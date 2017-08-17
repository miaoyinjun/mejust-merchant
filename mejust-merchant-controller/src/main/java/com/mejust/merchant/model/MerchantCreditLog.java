package com.mejust.merchant.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_m_merchant_credit_log")
public class MerchantCreditLog {
    /**
     * 商户号
     */
    @Id
    private String merchantno;

    /**
     * 商户信用评分开始日期
     */
    @Id
    private Date begdate;

    /**
     * 商户信用评分结束日期
     */
    @Id
    private Date enddate;

    /**
     * 本期销售金额
     */
    private BigDecimal saleamount;

    /**
     * 周数
     */
    private Integer weeknum;

    /**
     * 商户信用销售计算分
     */
    @Column(name = "mercredit_com")
    private BigDecimal mercreditCom;

    /**
     * 商户信用评分
     */
    private BigDecimal mercredit;

    /**
     * 商户合计信用评分
     */
    @Column(name = "mercredit_sum")
    private BigDecimal mercreditSum;

    /**
     * 获取商户号
     *
     * @return merchantno - 商户号
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
     * 设置商户号
     *
     * @param merchantno 商户号
     */
    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }

    /**
     * 获取商户信用评分开始日期
     *
     * @return begdate - 商户信用评分开始日期
     */
    public Date getBegdate() {
        return begdate;
    }

    /**
     * 设置商户信用评分开始日期
     *
     * @param begdate 商户信用评分开始日期
     */
    public void setBegdate(Date begdate) {
        this.begdate = begdate;
    }

    /**
     * 获取商户信用评分结束日期
     *
     * @return enddate - 商户信用评分结束日期
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * 设置商户信用评分结束日期
     *
     * @param enddate 商户信用评分结束日期
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * 获取本期销售金额
     *
     * @return saleamount - 本期销售金额
     */
    public BigDecimal getSaleamount() {
        return saleamount;
    }

    /**
     * 设置本期销售金额
     *
     * @param saleamount 本期销售金额
     */
    public void setSaleamount(BigDecimal saleamount) {
        this.saleamount = saleamount;
    }

    /**
     * 获取周数
     *
     * @return weeknum - 周数
     */
    public Integer getWeeknum() {
        return weeknum;
    }

    /**
     * 设置周数
     *
     * @param weeknum 周数
     */
    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    /**
     * 获取商户信用销售计算分
     *
     * @return mercredit_com - 商户信用销售计算分
     */
    public BigDecimal getMercreditCom() {
        return mercreditCom;
    }

    /**
     * 设置商户信用销售计算分
     *
     * @param mercreditCom 商户信用销售计算分
     */
    public void setMercreditCom(BigDecimal mercreditCom) {
        this.mercreditCom = mercreditCom;
    }

    /**
     * 获取商户信用评分
     *
     * @return mercredit - 商户信用评分
     */
    public BigDecimal getMercredit() {
        return mercredit;
    }

    /**
     * 设置商户信用评分
     *
     * @param mercredit 商户信用评分
     */
    public void setMercredit(BigDecimal mercredit) {
        this.mercredit = mercredit;
    }

    /**
     * 获取商户合计信用评分
     *
     * @return mercredit_sum - 商户合计信用评分
     */
    public BigDecimal getMercreditSum() {
        return mercreditSum;
    }

    /**
     * 设置商户合计信用评分
     *
     * @param mercreditSum 商户合计信用评分
     */
    public void setMercreditSum(BigDecimal mercreditSum) {
        this.mercreditSum = mercreditSum;
    }
}