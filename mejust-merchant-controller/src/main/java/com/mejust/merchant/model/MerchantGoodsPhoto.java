package com.mejust.merchant.model;

import javax.persistence.*;

@Table(name = "t_m_goods_photo")
public class MerchantGoodsPhoto {
    /**
     * 商品编码
     */
    private String barcode;

    /**
     * 图片1名称
     */
    private String photo1;

    /**
     * 图片1地址
     */
    private String photoline1;

    private String photo2;

    private String photoline2;

    private String photo3;

    private String photoline3;

    private String photo4;

    private String photoline4;

    private String photo5;

    private String photoline5;

    private String photo6;

    private String photoline6;

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
     * 获取图片1名称
     *
     * @return photo1 - 图片1名称
     */
    public String getPhoto1() {
        return photo1;
    }

    /**
     * 设置图片1名称
     *
     * @param photo1 图片1名称
     */
    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    /**
     * 获取图片1地址
     *
     * @return photoline1 - 图片1地址
     */
    public String getPhotoline1() {
        return photoline1;
    }

    /**
     * 设置图片1地址
     *
     * @param photoline1 图片1地址
     */
    public void setPhotoline1(String photoline1) {
        this.photoline1 = photoline1;
    }

    /**
     * @return photo2
     */
    public String getPhoto2() {
        return photo2;
    }

    /**
     * @param photo2
     */
    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    /**
     * @return photoline2
     */
    public String getPhotoline2() {
        return photoline2;
    }

    /**
     * @param photoline2
     */
    public void setPhotoline2(String photoline2) {
        this.photoline2 = photoline2;
    }

    /**
     * @return photo3
     */
    public String getPhoto3() {
        return photo3;
    }

    /**
     * @param photo3
     */
    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    /**
     * @return photoline3
     */
    public String getPhotoline3() {
        return photoline3;
    }

    /**
     * @param photoline3
     */
    public void setPhotoline3(String photoline3) {
        this.photoline3 = photoline3;
    }

    /**
     * @return photo4
     */
    public String getPhoto4() {
        return photo4;
    }

    /**
     * @param photo4
     */
    public void setPhoto4(String photo4) {
        this.photo4 = photo4;
    }

    /**
     * @return photoline4
     */
    public String getPhotoline4() {
        return photoline4;
    }

    /**
     * @param photoline4
     */
    public void setPhotoline4(String photoline4) {
        this.photoline4 = photoline4;
    }

    /**
     * @return photo5
     */
    public String getPhoto5() {
        return photo5;
    }

    /**
     * @param photo5
     */
    public void setPhoto5(String photo5) {
        this.photo5 = photo5;
    }

    /**
     * @return photoline5
     */
    public String getPhotoline5() {
        return photoline5;
    }

    /**
     * @param photoline5
     */
    public void setPhotoline5(String photoline5) {
        this.photoline5 = photoline5;
    }

    /**
     * @return photo6
     */
    public String getPhoto6() {
        return photo6;
    }

    /**
     * @param photo6
     */
    public void setPhoto6(String photo6) {
        this.photo6 = photo6;
    }

    /**
     * @return photoline6
     */
    public String getPhotoline6() {
        return photoline6;
    }

    /**
     * @param photoline6
     */
    public void setPhotoline6(String photoline6) {
        this.photoline6 = photoline6;
    }
}