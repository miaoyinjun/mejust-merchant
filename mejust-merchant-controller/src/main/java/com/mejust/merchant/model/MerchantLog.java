package com.mejust.merchant.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_m_merchant_log")
public class MerchantLog {
    /**
     * 操作时间
     */
    private Date opdate;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 原内容
     */
    private String origincontent;

    /**
     * 修改内容
     */
    private String updatecontent;

    /**
     * 获取操作时间
     *
     * @return opdate - 操作时间
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
     * 设置操作时间
     *
     * @param opdate 操作时间
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
     * 获取原内容
     *
     * @return origincontent - 原内容
     */
    public String getOrigincontent() {
        return origincontent;
    }

    /**
     * 设置原内容
     *
     * @param origincontent 原内容
     */
    public void setOrigincontent(String origincontent) {
        this.origincontent = origincontent;
    }

    /**
     * 获取修改内容
     *
     * @return updatecontent - 修改内容
     */
    public String getUpdatecontent() {
        return updatecontent;
    }

    /**
     * 设置修改内容
     *
     * @param updatecontent 修改内容
     */
    public void setUpdatecontent(String updatecontent) {
        this.updatecontent = updatecontent;
    }
}