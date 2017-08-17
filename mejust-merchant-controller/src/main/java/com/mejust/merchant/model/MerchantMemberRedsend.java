package com.mejust.merchant.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_m_merchant_member_redsend")
public class MerchantMemberRedsend {
    /**
     * 操作单号
     */
    @Id
    private String billno;

    /**
     * 商户红包商户编码
     */
    @Id
    private String merchantno;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 会员积分等级
     */
    private Integer memgrade;

    /**
     * 红包规则编码
     */
    private String redmodelno;

    /**
     * 使用起点金额
     */
    private BigDecimal statamount;

    /**
     * 使用接收金额
     */
    private BigDecimal useamount;

    /**
     * 红包效期
     */
    @Column(name = "red_ele_date")
    private Date redEleDate;

    /**
     * 赠送状态01未赠送02已赠送
     */
    private String sendstate;

    /**
     * 赠送日期
     */
    private Date senddate;

    /**
     * 获取操作单号
     *
     * @return billno - 操作单号
     */
    public String getBillno() {
        return billno;
    }

    /**
     * 设置操作单号
     *
     * @param billno 操作单号
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
     * 获取商户红包商户编码
     *
     * @return merchantno - 商户红包商户编码
     */
    public String getMerchantno() {
        return merchantno;
    }

    /**
     * 设置商户红包商户编码
     *
     * @param merchantno 商户红包商户编码
     */
    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno;
    }

    /**
     * 获取操作日期
     *
     * @return opdate - 操作日期
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
     * 设置操作日期
     *
     * @param opdate 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
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

    /**
     * 获取会员积分等级
     *
     * @return memgrade - 会员积分等级
     */
    public Integer getMemgrade() {
        return memgrade;
    }

    /**
     * 设置会员积分等级
     *
     * @param memgrade 会员积分等级
     */
    public void setMemgrade(Integer memgrade) {
        this.memgrade = memgrade;
    }

    /**
     * 获取红包规则编码
     *
     * @return redmodelno - 红包规则编码
     */
    public String getRedmodelno() {
        return redmodelno;
    }

    /**
     * 设置红包规则编码
     *
     * @param redmodelno 红包规则编码
     */
    public void setRedmodelno(String redmodelno) {
        this.redmodelno = redmodelno;
    }

    /**
     * 获取使用起点金额
     *
     * @return statamount - 使用起点金额
     */
    public BigDecimal getStatamount() {
        return statamount;
    }

    /**
     * 设置使用起点金额
     *
     * @param statamount 使用起点金额
     */
    public void setStatamount(BigDecimal statamount) {
        this.statamount = statamount;
    }

    /**
     * 获取使用接收金额
     *
     * @return useamount - 使用接收金额
     */
    public BigDecimal getUseamount() {
        return useamount;
    }

    /**
     * 设置使用接收金额
     *
     * @param useamount 使用接收金额
     */
    public void setUseamount(BigDecimal useamount) {
        this.useamount = useamount;
    }

    /**
     * 获取红包效期
     *
     * @return red_ele_date - 红包效期
     */
    public Date getRedEleDate() {
        return redEleDate;
    }

    /**
     * 设置红包效期
     *
     * @param redEleDate 红包效期
     */
    public void setRedEleDate(Date redEleDate) {
        this.redEleDate = redEleDate;
    }

    /**
     * 获取赠送状态01未赠送02已赠送
     *
     * @return sendstate - 赠送状态01未赠送02已赠送
     */
    public String getSendstate() {
        return sendstate;
    }

    /**
     * 设置赠送状态01未赠送02已赠送
     *
     * @param sendstate 赠送状态01未赠送02已赠送
     */
    public void setSendstate(String sendstate) {
        this.sendstate = sendstate;
    }

    /**
     * 获取赠送日期
     *
     * @return senddate - 赠送日期
     */
    public Date getSenddate() {
        return senddate;
    }

    /**
     * 设置赠送日期
     *
     * @param senddate 赠送日期
     */
    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }
}