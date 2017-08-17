package com.mejust.merchant.api.domain;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantGoodsPriceLogVo {
    /**
     * 变更日期
     */
    private Date setdate;

    /**
     * 商户编码
     */
    private String merchantno;

    /**
     * 商品编码
     */
    private String barcode;

    /**
     * 原价
     */
    private BigDecimal oldprice;

    /**
     * 新价
     */
    private BigDecimal newprice;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 获取变更日期
     *
     * @return setdate - 变更日期
     */
    public Date getSetdate() {
        return setdate;
    }

    /**
     * 设置变更日期
     *
     * @param setdate 变更日期
     */
    public void setSetdate(Date setdate) {
        this.setdate = setdate;
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
     * 获取商品编码
     *
     * @return barcode - 商品编码
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * 设置商品编码
     *
     * @param barcode 商品编码
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * 获取原价
     *
     * @return oldprice - 原价
     */
    public BigDecimal getOldprice() {
        return oldprice;
    }

    /**
     * 设置原价
     *
     * @param oldprice 原价
     */
    public void setOldprice(BigDecimal oldprice) {
        this.oldprice = oldprice;
    }

    /**
     * 获取新价
     *
     * @return newprice - 新价
     */
    public BigDecimal getNewprice() {
        return newprice;
    }

    /**
     * 设置新价
     *
     * @param newprice 新价
     */
    public void setNewprice(BigDecimal newprice) {
        this.newprice = newprice;
    }

    /**
     * 获取操作人
     *
     * @return operator - 操作人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人
     *
     * @param operator 操作人
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }
}