package com.mejust.merchant.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_m_merchant_ajcodeno")
public class MerchantShopProcess {
    /**
     * 米珈商户会员编码
     */
    @Id
    private String mjaccount;

    /**
     * 米珈类型 01商户 02 会员
     */
    private String mjtype;

    /**
     * 鹏华钱包唯一值
     */
    private String ajcodeno;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 钱包开通状态 01未开通 02已开通
     */
    private String openstate;

    /**
     * 获取米珈商户会员编码
     *
     * @return mjaccount - 米珈商户会员编码
     */
    public String getMjaccount() {
        return mjaccount;
    }

    /**
     * 设置米珈商户会员编码
     *
     * @param mjaccount 米珈商户会员编码
     */
    public void setMjaccount(String mjaccount) {
        this.mjaccount = mjaccount;
    }

    /**
     * 获取米珈类型 01商户 02 会员
     *
     * @return mjtype - 米珈类型 01商户 02 会员
     */
    public String getMjtype() {
        return mjtype;
    }

    /**
     * 设置米珈类型 01商户 02 会员
     *
     * @param mjtype 米珈类型 01商户 02 会员
     */
    public void setMjtype(String mjtype) {
        this.mjtype = mjtype;
    }

    /**
     * 获取鹏华钱包唯一值
     *
     * @return ajcodeno - 鹏华钱包唯一值
     */
    public String getAjcodeno() {
        return ajcodeno;
    }

    /**
     * 设置鹏华钱包唯一值
     *
     * @param ajcodeno 鹏华钱包唯一值
     */
    public void setAjcodeno(String ajcodeno) {
        this.ajcodeno = ajcodeno;
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
     * 获取钱包开通状态 01未开通 02已开通
     *
     * @return openstate - 钱包开通状态 01未开通 02已开通
     */
    public String getOpenstate() {
        return openstate;
    }

    /**
     * 设置钱包开通状态 01未开通 02已开通
     *
     * @param openstate 钱包开通状态 01未开通 02已开通
     */
    public void setOpenstate(String openstate) {
        this.openstate = openstate;
    }
}