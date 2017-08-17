package com.mejust.merchant.api.domain;

import java.math.BigDecimal;
/**
 * @author wangmingsen
 * @create 2017-08-15-2:26 PM
 **/

public class MerchantGoodsInfoVo {
    /**
     * 商品编码
     */
    private String barcode;

    /**
     * 商品条码
     */
    private String goodssku;

    /**
     * 商品名称
     */
    private String goodsname;

    /**
     * 商户编码
     */
    private String merchantno;

    /**
     * 销售单位
     */
    private String saleunit;

    /**
     * 价格类型
     */
    private String pricetype;

    /**
     * 销售价格
     */
    private BigDecimal saleprice;

    /**
     * 规格类型
     */
    private String modeltype;

    /**
     * 商品规格
     */
    private String model;

    /**
     * 商品品类
     */
    private String categoryD;

    /**
     * 促销状态
     */
    private String promstate;

    /**
     * 促销类型
     */
    private String promtype;

    /**
     * 促销价格
     */
    private BigDecimal promsaleprice;

    /**
     * 分销标示
     */
    private String dissale;

    /**
     * 分销返点
     */
    private BigDecimal dissaleRe;

    /**
     * 销售状态
     */
    private String salestate;

    private String promsupplierno;

    /**
     * 获取商品编码
     *
     * @return barcode - 商品编码
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * 设置商品编码
     *
     * @param barcode 商品编码
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * 获取商品条码
     *
     * @return goodssku - 商品条码
     */
    public String getGoodssku() {
        return goodssku;
    }

    /**
     * 设置商品条码
     *
     * @param goodssku 商品条码
     */
    public void setGoodssku(String goodssku) {
        this.goodssku = goodssku;
    }

    /**
     * 获取商品名称
     *
     * @return goodsname - 商品名称
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * 设置商品名称
     *
     * @param goodsname 商品名称
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
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
     * 获取销售单位
     *
     * @return saleunit - 销售单位
     */
    public String getSaleunit() {
        return saleunit;
    }

    /**
     * 设置销售单位
     *
     * @param saleunit 销售单位
     */
    public void setSaleunit(String saleunit) {
        this.saleunit = saleunit;
    }

    /**
     * 获取价格类型
     *
     * @return pricetype - 价格类型
     */
    public String getPricetype() {
        return pricetype;
    }

    /**
     * 设置价格类型
     *
     * @param pricetype 价格类型
     */
    public void setPricetype(String pricetype) {
        this.pricetype = pricetype;
    }

    /**
     * 获取销售价格
     *
     * @return saleprice - 销售价格
     */
    public BigDecimal getSaleprice() {
        return saleprice;
    }

    /**
     * 设置销售价格
     *
     * @param saleprice 销售价格
     */
    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    /**
     * 获取规格类型
     *
     * @return modeltype - 规格类型
     */
    public String getModeltype() {
        return modeltype;
    }

    /**
     * 设置规格类型
     *
     * @param modeltype 规格类型
     */
    public void setModeltype(String modeltype) {
        this.modeltype = modeltype;
    }

    /**
     * 获取商品规格
     *
     * @return model - 商品规格
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置商品规格
     *
     * @param model 商品规格
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取商品品类
     *
     * @return category_d - 商品品类
     */
    public String getCategoryD() {
        return categoryD;
    }

    /**
     * 设置商品品类
     *
     * @param categoryD 商品品类
     */
    public void setCategoryD(String categoryD) {
        this.categoryD = categoryD;
    }

    /**
     * 获取促销状态
     *
     * @return promstate - 促销状态
     */
    public String getPromstate() {
        return promstate;
    }

    /**
     * 设置促销状态
     *
     * @param promstate 促销状态
     */
    public void setPromstate(String promstate) {
        this.promstate = promstate;
    }

    /**
     * 获取促销类型
     *
     * @return promtype - 促销类型
     */
    public String getPromtype() {
        return promtype;
    }

    /**
     * 设置促销类型
     *
     * @param promtype 促销类型
     */
    public void setPromtype(String promtype) {
        this.promtype = promtype;
    }

    /**
     * 获取促销价格
     *
     * @return promsaleprice - 促销价格
     */
    public BigDecimal getPromsaleprice() {
        return promsaleprice;
    }

    /**
     * 设置促销价格
     *
     * @param promsaleprice 促销价格
     */
    public void setPromsaleprice(BigDecimal promsaleprice) {
        this.promsaleprice = promsaleprice;
    }

    /**
     * 获取分销标示
     *
     * @return dissale - 分销标示
     */
    public String getDissale() {
        return dissale;
    }

    /**
     * 设置分销标示
     *
     * @param dissale 分销标示
     */
    public void setDissale(String dissale) {
        this.dissale = dissale;
    }

    /**
     * 获取分销返点
     *
     * @return dissale_re - 分销返点
     */
    public BigDecimal getDissaleRe() {
        return dissaleRe;
    }

    /**
     * 设置分销返点
     *
     * @param dissaleRe 分销返点
     */
    public void setDissaleRe(BigDecimal dissaleRe) {
        this.dissaleRe = dissaleRe;
    }

    /**
     * 获取销售状态
     *
     * @return salestate - 销售状态
     */
    public String getSalestate() {
        return salestate;
    }

    /**
     * 设置销售状态
     *
     * @param salestate 销售状态
     */
    public void setSalestate(String salestate) {
        this.salestate = salestate;
    }

    /**
     * @return promsupplierno
     */
    public String getPromsupplierno() {
        return promsupplierno;
    }

    /**
     * @param promsupplierno
     */
    public void setPromsupplierno(String promsupplierno) {
        this.promsupplierno = promsupplierno;
    }
}