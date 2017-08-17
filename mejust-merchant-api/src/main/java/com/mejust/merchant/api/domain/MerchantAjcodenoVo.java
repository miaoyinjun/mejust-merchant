package com.mejust.merchant.api.domain;

import java.math.BigDecimal;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantAjcodenoVo {
    /**
     * 二级品类
     */
    private String categoryD;

    /**
     * 免额最高限
     */
    private BigDecimal maxamount;

    /**
     * 扣率
     */
    private BigDecimal rate;

    /**
     * 获取二级品类
     *
     * @return category_d - 二级品类
     */
    public String getCategoryD() {
        return categoryD;
    }

    /**
     * 设置二级品类
     *
     * @param categoryD 二级品类
     */
    public void setCategoryD(String categoryD) {
        this.categoryD = categoryD;
    }

    /**
     * 获取免额最高限
     *
     * @return maxamount - 免额最高限
     */
    public BigDecimal getMaxamount() {
        return maxamount;
    }

    /**
     * 设置免额最高限
     *
     * @param maxamount 免额最高限
     */
    public void setMaxamount(BigDecimal maxamount) {
        this.maxamount = maxamount;
    }

    /**
     * 获取扣率
     *
     * @return rate - 扣率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置扣率
     *
     * @param rate 扣率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}