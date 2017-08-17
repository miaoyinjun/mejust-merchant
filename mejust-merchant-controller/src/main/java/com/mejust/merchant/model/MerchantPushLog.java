package com.mejust.merchant.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_m_msg_sendlog")
public class MerchantPushLog {
    /**
     * 商户编码
     */
    @Id
    private String merchantno;

    /**
     * 发送时间
     */
    @Id
    private Date senddate;

    /**
     * 发送单号
     */
    private String sendbillno;

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
     * 获取发送时间
     *
     * @return senddate - 发送时间
     */
    public Date getSenddate() {
        return senddate;
    }

    /**
     * 设置发送时间
     *
     * @param senddate 发送时间
     */
    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    /**
     * 获取发送单号
     *
     * @return sendbillno - 发送单号
     */
    public String getSendbillno() {
        return sendbillno;
    }

    /**
     * 设置发送单号
     *
     * @param sendbillno 发送单号
     */
    public void setSendbillno(String sendbillno) {
        this.sendbillno = sendbillno;
    }
}