package com.mejust.merchant.api.domain;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantYhqsConfigurationVo {
    /**
     * 商户编码
     */
    private String merchantno;

    /**
     * 清算通道
     */
    private String qstd;

    /**
     * 移动支付通道
     */
    private String ydzftd;

    /**
     * 移动支付机构代码
     */
    private String orgcode;

    /**
     * 初始登录口令
     */
    private String initpasswd;

    /**
     * 机构密钥
     */
    private String orgkey;

    /**
     * appid通联一清使用
     */
    private String appid;

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
     * 获取清算通道
     *
     * @return qstd - 清算通道
     */
    public String getQstd() {
        return qstd;
    }

    /**
     * 设置清算通道
     *
     * @param qstd 清算通道
     */
    public void setQstd(String qstd) {
        this.qstd = qstd;
    }

    /**
     * 获取移动支付通道
     *
     * @return ydzftd - 移动支付通道
     */
    public String getYdzftd() {
        return ydzftd;
    }

    /**
     * 设置移动支付通道
     *
     * @param ydzftd 移动支付通道
     */
    public void setYdzftd(String ydzftd) {
        this.ydzftd = ydzftd;
    }

    /**
     * 获取移动支付机构代码
     *
     * @return orgcode - 移动支付机构代码
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * 设置移动支付机构代码
     *
     * @param orgcode 移动支付机构代码
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    /**
     * 获取初始登录口令
     *
     * @return initpasswd - 初始登录口令
     */
    public String getInitpasswd() {
        return initpasswd;
    }

    /**
     * 设置初始登录口令
     *
     * @param initpasswd 初始登录口令
     */
    public void setInitpasswd(String initpasswd) {
        this.initpasswd = initpasswd;
    }

    /**
     * 获取机构密钥
     *
     * @return orgkey - 机构密钥
     */
    public String getOrgkey() {
        return orgkey;
    }

    /**
     * 设置机构密钥
     *
     * @param orgkey 机构密钥
     */
    public void setOrgkey(String orgkey) {
        this.orgkey = orgkey;
    }

    /**
     * 获取appid通联一清使用
     *
     * @return appid - appid通联一清使用
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置appid通联一清使用
     *
     * @param appid appid通联一清使用
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }
}