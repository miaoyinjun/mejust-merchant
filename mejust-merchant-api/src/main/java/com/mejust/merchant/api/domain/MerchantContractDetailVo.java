package com.mejust.merchant.api.domain;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantContractDetailVo {
    /**
     * 商户编码
     */
    @ApiModelProperty(value = "商户编码")
    private String merchantno;

    /**
     * 折扣区间开始
     */
    @ApiModelProperty(value = "折扣区间开始")
    private BigDecimal promdisbeg;

    /**
     * 折扣区间结束
     */
    @ApiModelProperty(value = "折扣区间结束")
    private BigDecimal promdisend;

    /**
     * 扣点
     */
    @ApiModelProperty(value = "扣点")
    private BigDecimal funcmoney;

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
     * 获取折扣区间开始
     *
     * @return promdisbeg - 折扣区间开始
     */
    public BigDecimal getPromdisbeg() {
        return promdisbeg;
    }

    /**
     * 设置折扣区间开始
     *
     * @param promdisbeg 折扣区间开始
     */
    public void setPromdisbeg(BigDecimal promdisbeg) {
        this.promdisbeg = promdisbeg;
    }

    /**
     * 获取折扣区间结束
     *
     * @return promdisend - 折扣区间结束
     */
    public BigDecimal getPromdisend() {
        return promdisend;
    }

    /**
     * 设置折扣区间结束
     *
     * @param promdisend 折扣区间结束
     */
    public void setPromdisend(BigDecimal promdisend) {
        this.promdisend = promdisend;
    }

    /**
     * 获取扣点
     *
     * @return funcmoney - 扣点
     */
    public BigDecimal getFuncmoney() {
        return funcmoney;
    }

    /**
     * 设置扣点
     *
     * @param funcmoney 扣点
     */
    public void setFuncmoney(BigDecimal funcmoney) {
        this.funcmoney = funcmoney;
    }
}