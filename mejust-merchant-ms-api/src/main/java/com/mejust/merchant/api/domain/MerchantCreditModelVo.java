package com.mejust.merchant.api.domain;

import java.math.BigDecimal;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantCreditModelVo {
    /**
     * 信用id
     */
    private Integer xyid;

    /**
     * 信用名称
     */
    private String xyname;

    /**
     * 信用分值
     */
    private BigDecimal xyfenz;

    /**
     * 信用值类型1输入2是/否3上传
     */
    private Integer valuetype;

    /**
     * 获取信用id
     *
     * @return xyid - 信用id
     */
    public Integer getXyid() {
        return xyid;
    }

    /**
     * 设置信用id
     *
     * @param xyid 信用id
     */
    public void setXyid(Integer xyid) {
        this.xyid = xyid;
    }

    /**
     * 获取信用名称
     *
     * @return xyname - 信用名称
     */
    public String getXyname() {
        return xyname;
    }

    /**
     * 设置信用名称
     *
     * @param xyname 信用名称
     */
    public void setXyname(String xyname) {
        this.xyname = xyname;
    }

    /**
     * 获取信用分值
     *
     * @return xyfenz - 信用分值
     */
    public BigDecimal getXyfenz() {
        return xyfenz;
    }

    /**
     * 设置信用分值
     *
     * @param xyfenz 信用分值
     */
    public void setXyfenz(BigDecimal xyfenz) {
        this.xyfenz = xyfenz;
    }

    /**
     * 获取信用值类型1输入2是/否3上传
     *
     * @return valuetype - 信用值类型1输入2是/否3上传
     */
    public Integer getValuetype() {
        return valuetype;
    }

    /**
     * 设置信用值类型1输入2是/否3上传
     *
     * @param valuetype 信用值类型1输入2是/否3上传
     */
    public void setValuetype(Integer valuetype) {
        this.valuetype = valuetype;
    }
}