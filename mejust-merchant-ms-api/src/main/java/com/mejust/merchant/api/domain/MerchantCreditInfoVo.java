package com.mejust.merchant.api.domain;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantCreditInfoVo {
    /**
     * 商户号
     */
    private String merchantno;

    /**
     * 信用id
     */
    private Integer xyid;

    /**
     * 信用名称
     */
    private String xyname;

    /**
     * 信用值类型1输入2是/否3上传
     */
    private Integer valuetype;

    /**
     * 信用值
     */
    private String xyvalue;

    /**
     * 信用分值
     */
    private BigDecimal xyfenz;

    /**
     * 商户信用分值
     */
    private BigDecimal shdfenz;

    /**
     * 更新日期
     */
    private Date updatedate;

    /**
     * 上传资料名称
     */
    private String photonane;

    /**
     * 上传资料地址
     */
    private String photoaddress;

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

    /**
     * 获取信用值
     *
     * @return xyvalue - 信用值
     */
    public String getXyvalue() {
        return xyvalue;
    }

    /**
     * 设置信用值
     *
     * @param xyvalue 信用值
     */
    public void setXyvalue(String xyvalue) {
        this.xyvalue = xyvalue;
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
     * 获取商户信用分值
     *
     * @return shdfenz - 商户信用分值
     */
    public BigDecimal getShdfenz() {
        return shdfenz;
    }

    /**
     * 设置商户信用分值
     *
     * @param shdfenz 商户信用分值
     */
    public void setShdfenz(BigDecimal shdfenz) {
        this.shdfenz = shdfenz;
    }

    /**
     * 获取更新日期
     *
     * @return updatedate - 更新日期
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * 设置更新日期
     *
     * @param updatedate 更新日期
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * 获取上传资料名称
     *
     * @return photonane - 上传资料名称
     */
    public String getPhotonane() {
        return photonane;
    }

    /**
     * 设置上传资料名称
     *
     * @param photonane 上传资料名称
     */
    public void setPhotonane(String photonane) {
        this.photonane = photonane;
    }

    /**
     * 获取上传资料地址
     *
     * @return photoaddress - 上传资料地址
     */
    public String getPhotoaddress() {
        return photoaddress;
    }

    /**
     * 设置上传资料地址
     *
     * @param photoaddress 上传资料地址
     */
    public void setPhotoaddress(String photoaddress) {
        this.photoaddress = photoaddress;
    }
}