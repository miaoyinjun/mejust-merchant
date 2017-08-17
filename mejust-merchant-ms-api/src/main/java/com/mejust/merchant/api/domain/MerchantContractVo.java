package com.mejust.merchant.api.domain;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/
public class MerchantContractVo {
    /**
     * 商户编码
     */
    @ApiModelProperty(value = "商户编码")
    private String merchantno;

    /**
     * 费用序号
     */
    @ApiModelProperty(value = "费用序号")
    private Integer funcxh;

    /**
     * 费用项目
     */
    @ApiModelProperty(value = "费用项目")
    private String funcno;

    /**
     * 费用扣款开始日期
     */
    @ApiModelProperty(value = "费用扣款开始日期")
    private Date begdate;

    /**
     * 费用扣款结束日期
     */
    @ApiModelProperty(value = "费用扣款结束日期")
    private Date enddate;

    /**
     * 费用扣点金额
     */
    @ApiModelProperty(value = "费用扣点金额")
    private BigDecimal funcmoney;

    /**
     * 保底额
     */
    @ApiModelProperty(value = "保底额")
    private BigDecimal minamount;

    /**
     * 扣款类型
     */
    @ApiModelProperty(value = "扣款类型")
    private String fundtype;

    /**
     * 扣款方式
     */
    @ApiModelProperty(value = "扣款方式")
    private String fundmode;

    /**
     * 扣款状态
     */
    @ApiModelProperty(value = "扣款状态")
    private String fundstate;

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
     * 获取费用序号
     *
     * @return funcxh - 费用序号
     */
    public Integer getFuncxh() {
        return funcxh;
    }

    /**
     * 设置费用序号
     *
     * @param funcxh 费用序号
     */
    public void setFuncxh(Integer funcxh) {
        this.funcxh = funcxh;
    }

    /**
     * 获取费用项目
     *
     * @return funcno - 费用项目
     */
    public String getFuncno() {
        return funcno;
    }

    /**
     * 设置费用项目
     *
     * @param funcno 费用项目
     */
    public void setFuncno(String funcno) {
        this.funcno = funcno;
    }

    /**
     * 获取费用扣款开始日期
     *
     * @return begdate - 费用扣款开始日期
     */
    public Date getBegdate() {
        return begdate;
    }

    /**
     * 设置费用扣款开始日期
     *
     * @param begdate 费用扣款开始日期
     */
    public void setBegdate(Date begdate) {
        this.begdate = begdate;
    }

    /**
     * 获取费用扣款结束日期
     *
     * @return enddate - 费用扣款结束日期
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * 设置费用扣款结束日期
     *
     * @param enddate 费用扣款结束日期
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * 获取费用扣点金额
     *
     * @return funcmoney - 费用扣点金额
     */
    public BigDecimal getFuncmoney() {
        return funcmoney;
    }

    /**
     * 设置费用扣点金额
     *
     * @param funcmoney 费用扣点金额
     */
    public void setFuncmoney(BigDecimal funcmoney) {
        this.funcmoney = funcmoney;
    }

    /**
     * 获取保底额
     *
     * @return minamount - 保底额
     */
    public BigDecimal getMinamount() {
        return minamount;
    }

    /**
     * 设置保底额
     *
     * @param minamount 保底额
     */
    public void setMinamount(BigDecimal minamount) {
        this.minamount = minamount;
    }

    /**
     * 获取扣款类型
     *
     * @return fundtype - 扣款类型
     */
    public String getFundtype() {
        return fundtype;
    }

    /**
     * 设置扣款类型
     *
     * @param fundtype 扣款类型
     */
    public void setFundtype(String fundtype) {
        this.fundtype = fundtype;
    }

    /**
     * 获取扣款方式
     *
     * @return fundmode - 扣款方式
     */
    public String getFundmode() {
        return fundmode;
    }

    /**
     * 设置扣款方式
     *
     * @param fundmode 扣款方式
     */
    public void setFundmode(String fundmode) {
        this.fundmode = fundmode;
    }

    /**
     * 获取扣款状态
     *
     * @return fundstate - 扣款状态
     */
    public String getFundstate() {
        return fundstate;
    }

    /**
     * 设置扣款状态
     *
     * @param fundstate 扣款状态
     */
    public void setFundstate(String fundstate) {
        this.fundstate = fundstate;
    }
}