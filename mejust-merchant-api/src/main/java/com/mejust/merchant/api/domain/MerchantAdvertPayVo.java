package com.mejust.merchant.api.domain;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantAdvertPayVo {
    /**
     * 商户广告位购买单号
     */
    @ApiModelProperty(value = "商户广告位购买单号")
    private String billno;

    /**
     * 购买日期
     */
    @ApiModelProperty(value = "购买日期")
    private Date paydate;

    /**
     * 商户编码
     */
    @ApiModelProperty(value = "商户编码")
    private String merchantno;

    /**
     * 广告位编码
     */
    @ApiModelProperty(value = "广告位编码")
    private String advertno;

    /**
     * 广告位类型 线上 线下
     */
    @ApiModelProperty(value = "广告位类型 线上 线下")
    private String adverttype;

    /**
     * 广告位尺寸信息
     */
    @ApiModelProperty(value = "广告位尺寸信息")
    private String sizeinfo;

    /**
     * 广告位位置说明
     */
    @ApiModelProperty(value = "广告位位置说明")
    private String position;

    /**
     * 页面制作及印刷价格
     */
    @ApiModelProperty(value = "页面制作及印刷价格")
    private BigDecimal makeamount;

    /**
     * 广告位租用(每天价格)
     */
    @ApiModelProperty(value = "广告位租用(每天价格)")
    private BigDecimal advertamount;

    /**
     * 是否选择制作印刷
     */
    @ApiModelProperty(value = "是否选择制作印刷")
    private String makeifpay;

    /**
     * 租用天数
     */
    @ApiModelProperty(value = "租用天数")
    private Integer rentdays;

    /**
     * 应付金额
     */
    @ApiModelProperty(value = "应付金额")
    private BigDecimal payamount;

    /**
     * 付款状态
     */
    @ApiModelProperty(value = "付款状态")
    private String paystate;

    /**
     * 执行状态
     */
    @ApiModelProperty(value = "执行状态")
    private String execstate;

    /**
     * 联系人
     */
    @ApiModelProperty(value = "联系人")
    private String contacts;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话")
    private String contactphone;

    /**
     * 执行开始日期
     */
    @ApiModelProperty(value = "执行开始日期")
    private Date execdate;

    /**
     * 获取商户广告位购买单号
     *
     * @return billno - 商户广告位购买单号
     */
    public String getBillno() {
        return billno;
    }

    /**
     * 设置商户广告位购买单号
     *
     * @param billno 商户广告位购买单号
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
     * 获取购买日期
     *
     * @return paydate - 购买日期
     */
    public Date getPaydate() {
        return paydate;
    }

    /**
     * 设置购买日期
     *
     * @param paydate 购买日期
     */
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
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
     * 获取广告位编码
     *
     * @return advertno - 广告位编码
     */
    public String getAdvertno() {
        return advertno;
    }

    /**
     * 设置广告位编码
     *
     * @param advertno 广告位编码
     */
    public void setAdvertno(String advertno) {
        this.advertno = advertno;
    }

    /**
     * 获取广告位类型 线上 线下
     *
     * @return adverttype - 广告位类型 线上 线下
     */
    public String getAdverttype() {
        return adverttype;
    }

    /**
     * 设置广告位类型 线上 线下
     *
     * @param adverttype 广告位类型 线上 线下
     */
    public void setAdverttype(String adverttype) {
        this.adverttype = adverttype;
    }

    /**
     * 获取广告位尺寸信息
     *
     * @return sizeinfo - 广告位尺寸信息
     */
    public String getSizeinfo() {
        return sizeinfo;
    }

    /**
     * 设置广告位尺寸信息
     *
     * @param sizeinfo 广告位尺寸信息
     */
    public void setSizeinfo(String sizeinfo) {
        this.sizeinfo = sizeinfo;
    }

    /**
     * 获取广告位位置说明
     *
     * @return position - 广告位位置说明
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置广告位位置说明
     *
     * @param position 广告位位置说明
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取页面制作及印刷价格
     *
     * @return makeamount - 页面制作及印刷价格
     */
    public BigDecimal getMakeamount() {
        return makeamount;
    }

    /**
     * 设置页面制作及印刷价格
     *
     * @param makeamount 页面制作及印刷价格
     */
    public void setMakeamount(BigDecimal makeamount) {
        this.makeamount = makeamount;
    }

    /**
     * 获取广告位租用(每天价格)
     *
     * @return advertamount - 广告位租用(每天价格)
     */
    public BigDecimal getAdvertamount() {
        return advertamount;
    }

    /**
     * 设置广告位租用(每天价格)
     *
     * @param advertamount 广告位租用(每天价格)
     */
    public void setAdvertamount(BigDecimal advertamount) {
        this.advertamount = advertamount;
    }

    /**
     * 获取是否选择制作印刷
     *
     * @return makeifpay - 是否选择制作印刷
     */
    public String getMakeifpay() {
        return makeifpay;
    }

    /**
     * 设置是否选择制作印刷
     *
     * @param makeifpay 是否选择制作印刷
     */
    public void setMakeifpay(String makeifpay) {
        this.makeifpay = makeifpay;
    }

    /**
     * 获取租用天数
     *
     * @return rentdays - 租用天数
     */
    public Integer getRentdays() {
        return rentdays;
    }

    /**
     * 设置租用天数
     *
     * @param rentdays 租用天数
     */
    public void setRentdays(Integer rentdays) {
        this.rentdays = rentdays;
    }

    /**
     * 获取应付金额
     *
     * @return payamount - 应付金额
     */
    public BigDecimal getPayamount() {
        return payamount;
    }

    /**
     * 设置应付金额
     *
     * @param payamount 应付金额
     */
    public void setPayamount(BigDecimal payamount) {
        this.payamount = payamount;
    }

    /**
     * 获取付款状态
     *
     * @return paystate - 付款状态
     */
    public String getPaystate() {
        return paystate;
    }

    /**
     * 设置付款状态
     *
     * @param paystate 付款状态
     */
    public void setPaystate(String paystate) {
        this.paystate = paystate;
    }

    /**
     * 获取执行状态
     *
     * @return execstate - 执行状态
     */
    public String getExecstate() {
        return execstate;
    }

    /**
     * 设置执行状态
     *
     * @param execstate 执行状态
     */
    public void setExecstate(String execstate) {
        this.execstate = execstate;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取联系电话
     *
     * @return contactphone - 联系电话
     */
    public String getContactphone() {
        return contactphone;
    }

    /**
     * 设置联系电话
     *
     * @param contactphone 联系电话
     */
    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    /**
     * 获取执行开始日期
     *
     * @return execdate - 执行开始日期
     */
    public Date getExecdate() {
        return execdate;
    }

    /**
     * 设置执行开始日期
     *
     * @param execdate 执行开始日期
     */
    public void setExecdate(Date execdate) {
        this.execdate = execdate;
    }
}