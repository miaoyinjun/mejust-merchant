package com.mejust.merchant.model;

import javax.persistence.*;

@Table(name = "t_m_merchant_photo")
public class MerchantPhoto {
    /**
     * 商户编码
     */
    @Id
    private String merchantno;

    /**
     * 营业执照
     */
    private String photo1;

    private String photoline1;

    /**
     * 税务登记证
     */
    private String photo2;

    private String photoline2;

    /**
     * 组织机构代码证
     */
    private String photo3;

    private String photoline3;

    /**
     * 身份证复印件
     */
    private String photo4;

    private String photoline4;

    /**
     * 小二上传门头照片
     */
    private String photo5;

    /**
     * 小二上传门头照片
     */
    private String photoline5;

    /**
     * 小二上传签约照片
     */
    private String photo6;

    /**
     * 小二上传签约照片
     */
    private String photoline6;

    /**
     * 小二上传银行卡照片
     */
    private String photo7;

    /**
     * 小二上传银行卡照片
     */
    private String photoline7;

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
     * 获取营业执照
     *
     * @return photo1 - 营业执照
     */
    public String getPhoto1() {
        return photo1;
    }

    /**
     * 设置营业执照
     *
     * @param photo1 营业执照
     */
    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    /**
     * @return photoline1
     */
    public String getPhotoline1() {
        return photoline1;
    }

    /**
     * @param photoline1
     */
    public void setPhotoline1(String photoline1) {
        this.photoline1 = photoline1;
    }

    /**
     * 获取税务登记证
     *
     * @return photo2 - 税务登记证
     */
    public String getPhoto2() {
        return photo2;
    }

    /**
     * 设置税务登记证
     *
     * @param photo2 税务登记证
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
     * 获取组织机构代码证
     *
     * @return photo3 - 组织机构代码证
     */
    public String getPhoto3() {
        return photo3;
    }

    /**
     * 设置组织机构代码证
     *
     * @param photo3 组织机构代码证
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
     * 获取身份证复印件
     *
     * @return photo4 - 身份证复印件
     */
    public String getPhoto4() {
        return photo4;
    }

    /**
     * 设置身份证复印件
     *
     * @param photo4 身份证复印件
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
     * 获取小二上传门头照片
     *
     * @return photo5 - 小二上传门头照片
     */
    public String getPhoto5() {
        return photo5;
    }

    /**
     * 设置小二上传门头照片
     *
     * @param photo5 小二上传门头照片
     */
    public void setPhoto5(String photo5) {
        this.photo5 = photo5;
    }

    /**
     * 获取小二上传门头照片
     *
     * @return photoline5 - 小二上传门头照片
     */
    public String getPhotoline5() {
        return photoline5;
    }

    /**
     * 设置小二上传门头照片
     *
     * @param photoline5 小二上传门头照片
     */
    public void setPhotoline5(String photoline5) {
        this.photoline5 = photoline5;
    }

    /**
     * 获取小二上传签约照片
     *
     * @return photo6 - 小二上传签约照片
     */
    public String getPhoto6() {
        return photo6;
    }

    /**
     * 设置小二上传签约照片
     *
     * @param photo6 小二上传签约照片
     */
    public void setPhoto6(String photo6) {
        this.photo6 = photo6;
    }

    /**
     * 获取小二上传签约照片
     *
     * @return photoline6 - 小二上传签约照片
     */
    public String getPhotoline6() {
        return photoline6;
    }

    /**
     * 设置小二上传签约照片
     *
     * @param photoline6 小二上传签约照片
     */
    public void setPhotoline6(String photoline6) {
        this.photoline6 = photoline6;
    }

    /**
     * 获取小二上传银行卡照片
     *
     * @return photo7 - 小二上传银行卡照片
     */
    public String getPhoto7() {
        return photo7;
    }

    /**
     * 设置小二上传银行卡照片
     *
     * @param photo7 小二上传银行卡照片
     */
    public void setPhoto7(String photo7) {
        this.photo7 = photo7;
    }

    /**
     * 获取小二上传银行卡照片
     *
     * @return photoline7 - 小二上传银行卡照片
     */
    public String getPhotoline7() {
        return photoline7;
    }

    /**
     * 设置小二上传银行卡照片
     *
     * @param photoline7 小二上传银行卡照片
     */
    public void setPhotoline7(String photoline7) {
        this.photoline7 = photoline7;
    }
}