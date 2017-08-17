package com.mejust.merchant.api.domain;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantLabelPrintVo {
    /**
     * 商户号
     */
    private String merchantno;

    /**
     * 打印标签序号
     */
    private Integer printxh;

    /**
     * 打印标签文字
     */
    private String printtxt;

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
     * 获取打印标签序号
     *
     * @return printxh - 打印标签序号
     */
    public Integer getPrintxh() {
        return printxh;
    }

    /**
     * 设置打印标签序号
     *
     * @param printxh 打印标签序号
     */
    public void setPrintxh(Integer printxh) {
        this.printxh = printxh;
    }

    /**
     * 获取打印标签文字
     *
     * @return printtxt - 打印标签文字
     */
    public String getPrinttxt() {
        return printtxt;
    }

    /**
     * 设置打印标签文字
     *
     * @param printtxt 打印标签文字
     */
    public void setPrinttxt(String printtxt) {
        this.printtxt = printtxt;
    }
}