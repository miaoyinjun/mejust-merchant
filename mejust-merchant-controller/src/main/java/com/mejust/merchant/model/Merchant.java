package com.mejust.merchant.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_m_merchant")
public class Merchant {
    /**
     * 商户编码
     */
    @Id
    private String merchantno;

    /**
     * 商户名称
     */
    private String merchantname;

    /**
     * 商户类型 
     */
    private String merchanttype;

    /**
     * 合同号
     */
    private String contractno;

    /**
     * 分销会员卡号
     */
    private String cardno;

    /**
     * 商户地址
     */
    private String address;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 店铺联系电话
     */
    private String contactplane;

    /**
     * 联系手机
     */
    private String contactphone;

    /**
     * email
     */
    private String contactemail;

    /**
     * 经营品类
     */
    private String categoryno;

    /**
     * 二级品类
     */
    @Column(name = "category_d")
    private String categoryD;

    /**
     * 归属商场
     */
    private String shopstoreno;

    /**
     * 是否支持配送
     */
    private String delivertype;

    /**
     * 是否支持货到付款
     */
    private String delivercash;

    /**
     * 积分规则代码
     */
    private String integralno;

    /**
     * 返利规则代码
     */
    private String rebateno;

    /**
     * 正常米币金额
     */
    @Column(name = "m_money_normal")
    private BigDecimal mMoneyNormal;

    /**
     * 锁定米币金额
     */
    @Column(name = "m_money_lock")
    private BigDecimal mMoneyLock;

    /**
     * 搜索关键字
     */
    private String serkey;

    /**
     * 管理装修风格代码
     */
    @Column(name = "manger_face")
    private String mangerFace;

    /**
     * 销售装修风格代码
     */
    @Column(name = "sale_face")
    private String saleFace;

    /**
     * 结算周期
     */
    @Column(name = "pay_cacle")
    private String payCacle;

    /**
     * 开店状态
     */
    private String shopstate;

    /**
     * 合作状态
     */
    private String coopstate;

    /**
     * 省份
     */
    private String provinceno;

    /**
     * 城市
     */
    private String cityno;

    /**
     * 区域
     */
    private String regionno;

    /**
     * logo图片名称
     */
    private String logophotoname;

    /**
     * logo图片地址
     */
    private String logophotoaddr;

    /**
     * 经营品牌
     */
    private String brandname;

    /**
     * 地理坐标位置
     */
    private Object xypoint;

    /**
     * x坐标
     */
    private String xcoord;

    /**
     * y坐标
     */
    private String ycoord;

    /**
     * 最低米币限度
     */
    private BigDecimal lowestamount;

    /**
     * 商户财务管理口令
     */
    private String mangerpasswd;

    /**
     * 商户收银模式
     */
    private String cashmode;

    /**
     * 税率
     */
    private BigDecimal taxamount;

    /**
     * 合同类型
     */
    private String contracttype;

    /**
     * 合同经营面积
     */
    private BigDecimal conarea;

    /**
     * 合同开始日期
     */
    private Date conbegdate;

    /**
     * 合同结束日期
     */
    private Date conenddate;

    /**
     * 商户所属地0086
     */
    private String beaddrelong;

    /**
     * 首页排序
     */
    private Short homeorder;

    /**
     * 经营楼层
     */
    private String manfloorno;

    /**
     * 商户信用评分
     */
    private BigDecimal mercredit;

    /**
     * 商户信用评分日期
     */
    private Date mercreditdate;

    /**
     * 业务员姓名
     */
    private String yeusername;

    /**
     * 收款人姓名
     */
    private String cwskname;

    /**
     * 收款人账号
     */
    private String cwskzhno;

    /**
     * 收款人银行
     */
    private String cwskyinh;

    /**
     * 收款银行行号
     */
    private String cwskyhhh;

    /**
     * 总行清算行行号
     */
    @Column(name = "cwskyhhh_zh")
    private String cwskyhhhZh;

    /**
     * 收款开户行名称
     */
    private String cwskkhhmc;

    /**
     * 地推代理公司名称
     */
    private String dlgsname;

    /**
     * 一码多付交易通道编码
     */
    @Column(name = "channel_no")
    private String channelNo;

    /**
     * pda归属通道
     */
    @Column(name = "channel_pdano")
    private String channelPdano;

    /**
     * 归属商圈编码
     */
    private String businareano;

    /**
     * 财务收款信息审核01未审核02已审核
     */
    @Column(name = "cwskinfo_bill")
    private String cwskinfoBill;

    /**
     * 联盟商户级别01一般商户02重点商户 重点商户pda不控制交易成功和打印成功
     */
    private String mershjib;

    /**
     * 是否是线上销售商户01非线上销售商户 02 线上销售商户
     */
    private String merlinesale;

    /**
     * 营业执照名称
     */
    private String merzhname;

    /**
     * 一清商户手续费是否补贴
     */
    private Integer ifsxfbt;

    /**
     * 备注
     */
    private String remark;

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
     * 获取商户名称
     *
     * @return merchantname - 商户名称
     */
    public String getMerchantname() {
        return merchantname;
    }

    /**
     * 设置商户名称
     *
     * @param merchantname 商户名称
     */
    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname;
    }

    /**
     * 获取商户类型 
     *
     * @return merchanttype - 商户类型 
     */
    public String getMerchanttype() {
        return merchanttype;
    }

    /**
     * 设置商户类型 
     *
     * @param merchanttype 商户类型 
     */
    public void setMerchanttype(String merchanttype) {
        this.merchanttype = merchanttype;
    }

    /**
     * 获取合同号
     *
     * @return contractno - 合同号
     */
    public String getContractno() {
        return contractno;
    }

    /**
     * 设置合同号
     *
     * @param contractno 合同号
     */
    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    /**
     * 获取分销会员卡号
     *
     * @return cardno - 分销会员卡号
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设置分销会员卡号
     *
     * @param cardno 分销会员卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * 获取商户地址
     *
     * @return address - 商户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置商户地址
     *
     * @param address 商户地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取店铺联系电话
     *
     * @return contactplane - 店铺联系电话
     */
    public String getContactplane() {
        return contactplane;
    }

    /**
     * 设置店铺联系电话
     *
     * @param contactplane 店铺联系电话
     */
    public void setContactplane(String contactplane) {
        this.contactplane = contactplane;
    }

    /**
     * 获取联系手机
     *
     * @return contactphone - 联系手机
     */
    public String getContactphone() {
        return contactphone;
    }

    /**
     * 设置联系手机
     *
     * @param contactphone 联系手机
     */
    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    /**
     * 获取email
     *
     * @return contactemail - email
     */
    public String getContactemail() {
        return contactemail;
    }

    /**
     * 设置email
     *
     * @param contactemail email
     */
    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }

    /**
     * 获取经营品类
     *
     * @return categoryno - 经营品类
     */
    public String getCategoryno() {
        return categoryno;
    }

    /**
     * 设置经营品类
     *
     * @param categoryno 经营品类
     */
    public void setCategoryno(String categoryno) {
        this.categoryno = categoryno;
    }

    /**
     * 获取二级品类
     *
     * @return category_d - 二级品类
     */
    public String getCategoryD() {
        return categoryD;
    }

    /**
     * 设置二级品类
     *
     * @param categoryD 二级品类
     */
    public void setCategoryD(String categoryD) {
        this.categoryD = categoryD;
    }

    /**
     * 获取归属商场
     *
     * @return shopstoreno - 归属商场
     */
    public String getShopstoreno() {
        return shopstoreno;
    }

    /**
     * 设置归属商场
     *
     * @param shopstoreno 归属商场
     */
    public void setShopstoreno(String shopstoreno) {
        this.shopstoreno = shopstoreno;
    }

    /**
     * 获取是否支持配送
     *
     * @return delivertype - 是否支持配送
     */
    public String getDelivertype() {
        return delivertype;
    }

    /**
     * 设置是否支持配送
     *
     * @param delivertype 是否支持配送
     */
    public void setDelivertype(String delivertype) {
        this.delivertype = delivertype;
    }

    /**
     * 获取是否支持货到付款
     *
     * @return delivercash - 是否支持货到付款
     */
    public String getDelivercash() {
        return delivercash;
    }

    /**
     * 设置是否支持货到付款
     *
     * @param delivercash 是否支持货到付款
     */
    public void setDelivercash(String delivercash) {
        this.delivercash = delivercash;
    }

    /**
     * 获取积分规则代码
     *
     * @return integralno - 积分规则代码
     */
    public String getIntegralno() {
        return integralno;
    }

    /**
     * 设置积分规则代码
     *
     * @param integralno 积分规则代码
     */
    public void setIntegralno(String integralno) {
        this.integralno = integralno;
    }

    /**
     * 获取返利规则代码
     *
     * @return rebateno - 返利规则代码
     */
    public String getRebateno() {
        return rebateno;
    }

    /**
     * 设置返利规则代码
     *
     * @param rebateno 返利规则代码
     */
    public void setRebateno(String rebateno) {
        this.rebateno = rebateno;
    }

    /**
     * 获取正常米币金额
     *
     * @return m_money_normal - 正常米币金额
     */
    public BigDecimal getmMoneyNormal() {
        return mMoneyNormal;
    }

    /**
     * 设置正常米币金额
     *
     * @param mMoneyNormal 正常米币金额
     */
    public void setmMoneyNormal(BigDecimal mMoneyNormal) {
        this.mMoneyNormal = mMoneyNormal;
    }

    /**
     * 获取锁定米币金额
     *
     * @return m_money_lock - 锁定米币金额
     */
    public BigDecimal getmMoneyLock() {
        return mMoneyLock;
    }

    /**
     * 设置锁定米币金额
     *
     * @param mMoneyLock 锁定米币金额
     */
    public void setmMoneyLock(BigDecimal mMoneyLock) {
        this.mMoneyLock = mMoneyLock;
    }

    /**
     * 获取搜索关键字
     *
     * @return serkey - 搜索关键字
     */
    public String getSerkey() {
        return serkey;
    }

    /**
     * 设置搜索关键字
     *
     * @param serkey 搜索关键字
     */
    public void setSerkey(String serkey) {
        this.serkey = serkey;
    }

    /**
     * 获取管理装修风格代码
     *
     * @return manger_face - 管理装修风格代码
     */
    public String getMangerFace() {
        return mangerFace;
    }

    /**
     * 设置管理装修风格代码
     *
     * @param mangerFace 管理装修风格代码
     */
    public void setMangerFace(String mangerFace) {
        this.mangerFace = mangerFace;
    }

    /**
     * 获取销售装修风格代码
     *
     * @return sale_face - 销售装修风格代码
     */
    public String getSaleFace() {
        return saleFace;
    }

    /**
     * 设置销售装修风格代码
     *
     * @param saleFace 销售装修风格代码
     */
    public void setSaleFace(String saleFace) {
        this.saleFace = saleFace;
    }

    /**
     * 获取结算周期
     *
     * @return pay_cacle - 结算周期
     */
    public String getPayCacle() {
        return payCacle;
    }

    /**
     * 设置结算周期
     *
     * @param payCacle 结算周期
     */
    public void setPayCacle(String payCacle) {
        this.payCacle = payCacle;
    }

    /**
     * 获取开店状态
     *
     * @return shopstate - 开店状态
     */
    public String getShopstate() {
        return shopstate;
    }

    /**
     * 设置开店状态
     *
     * @param shopstate 开店状态
     */
    public void setShopstate(String shopstate) {
        this.shopstate = shopstate;
    }

    /**
     * 获取合作状态
     *
     * @return coopstate - 合作状态
     */
    public String getCoopstate() {
        return coopstate;
    }

    /**
     * 设置合作状态
     *
     * @param coopstate 合作状态
     */
    public void setCoopstate(String coopstate) {
        this.coopstate = coopstate;
    }

    /**
     * 获取省份
     *
     * @return provinceno - 省份
     */
    public String getProvinceno() {
        return provinceno;
    }

    /**
     * 设置省份
     *
     * @param provinceno 省份
     */
    public void setProvinceno(String provinceno) {
        this.provinceno = provinceno;
    }

    /**
     * 获取城市
     *
     * @return cityno - 城市
     */
    public String getCityno() {
        return cityno;
    }

    /**
     * 设置城市
     *
     * @param cityno 城市
     */
    public void setCityno(String cityno) {
        this.cityno = cityno;
    }

    /**
     * 获取区域
     *
     * @return regionno - 区域
     */
    public String getRegionno() {
        return regionno;
    }

    /**
     * 设置区域
     *
     * @param regionno 区域
     */
    public void setRegionno(String regionno) {
        this.regionno = regionno;
    }

    /**
     * 获取logo图片名称
     *
     * @return logophotoname - logo图片名称
     */
    public String getLogophotoname() {
        return logophotoname;
    }

    /**
     * 设置logo图片名称
     *
     * @param logophotoname logo图片名称
     */
    public void setLogophotoname(String logophotoname) {
        this.logophotoname = logophotoname;
    }

    /**
     * 获取logo图片地址
     *
     * @return logophotoaddr - logo图片地址
     */
    public String getLogophotoaddr() {
        return logophotoaddr;
    }

    /**
     * 设置logo图片地址
     *
     * @param logophotoaddr logo图片地址
     */
    public void setLogophotoaddr(String logophotoaddr) {
        this.logophotoaddr = logophotoaddr;
    }

    /**
     * 获取经营品牌
     *
     * @return brandname - 经营品牌
     */
    public String getBrandname() {
        return brandname;
    }

    /**
     * 设置经营品牌
     *
     * @param brandname 经营品牌
     */
    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    /**
     * 获取地理坐标位置
     *
     * @return xypoint - 地理坐标位置
     */
    public Object getXypoint() {
        return xypoint;
    }

    /**
     * 设置地理坐标位置
     *
     * @param xypoint 地理坐标位置
     */
    public void setXypoint(Object xypoint) {
        this.xypoint = xypoint;
    }

    /**
     * 获取x坐标
     *
     * @return xcoord - x坐标
     */
    public String getXcoord() {
        return xcoord;
    }

    /**
     * 设置x坐标
     *
     * @param xcoord x坐标
     */
    public void setXcoord(String xcoord) {
        this.xcoord = xcoord;
    }

    /**
     * 获取y坐标
     *
     * @return ycoord - y坐标
     */
    public String getYcoord() {
        return ycoord;
    }

    /**
     * 设置y坐标
     *
     * @param ycoord y坐标
     */
    public void setYcoord(String ycoord) {
        this.ycoord = ycoord;
    }

    /**
     * 获取最低米币限度
     *
     * @return lowestamount - 最低米币限度
     */
    public BigDecimal getLowestamount() {
        return lowestamount;
    }

    /**
     * 设置最低米币限度
     *
     * @param lowestamount 最低米币限度
     */
    public void setLowestamount(BigDecimal lowestamount) {
        this.lowestamount = lowestamount;
    }

    /**
     * 获取商户财务管理口令
     *
     * @return mangerpasswd - 商户财务管理口令
     */
    public String getMangerpasswd() {
        return mangerpasswd;
    }

    /**
     * 设置商户财务管理口令
     *
     * @param mangerpasswd 商户财务管理口令
     */
    public void setMangerpasswd(String mangerpasswd) {
        this.mangerpasswd = mangerpasswd;
    }

    /**
     * 获取商户收银模式
     *
     * @return cashmode - 商户收银模式
     */
    public String getCashmode() {
        return cashmode;
    }

    /**
     * 设置商户收银模式
     *
     * @param cashmode 商户收银模式
     */
    public void setCashmode(String cashmode) {
        this.cashmode = cashmode;
    }

    /**
     * 获取税率
     *
     * @return taxamount - 税率
     */
    public BigDecimal getTaxamount() {
        return taxamount;
    }

    /**
     * 设置税率
     *
     * @param taxamount 税率
     */
    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    /**
     * 获取合同类型
     *
     * @return contracttype - 合同类型
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
     * 设置合同类型
     *
     * @param contracttype 合同类型
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    /**
     * 获取合同经营面积
     *
     * @return conarea - 合同经营面积
     */
    public BigDecimal getConarea() {
        return conarea;
    }

    /**
     * 设置合同经营面积
     *
     * @param conarea 合同经营面积
     */
    public void setConarea(BigDecimal conarea) {
        this.conarea = conarea;
    }

    /**
     * 获取合同开始日期
     *
     * @return conbegdate - 合同开始日期
     */
    public Date getConbegdate() {
        return conbegdate;
    }

    /**
     * 设置合同开始日期
     *
     * @param conbegdate 合同开始日期
     */
    public void setConbegdate(Date conbegdate) {
        this.conbegdate = conbegdate;
    }

    /**
     * 获取合同结束日期
     *
     * @return conenddate - 合同结束日期
     */
    public Date getConenddate() {
        return conenddate;
    }

    /**
     * 设置合同结束日期
     *
     * @param conenddate 合同结束日期
     */
    public void setConenddate(Date conenddate) {
        this.conenddate = conenddate;
    }

    /**
     * 获取商户所属地0086
     *
     * @return beaddrelong - 商户所属地0086
     */
    public String getBeaddrelong() {
        return beaddrelong;
    }

    /**
     * 设置商户所属地0086
     *
     * @param beaddrelong 商户所属地0086
     */
    public void setBeaddrelong(String beaddrelong) {
        this.beaddrelong = beaddrelong;
    }

    /**
     * 获取首页排序
     *
     * @return homeorder - 首页排序
     */
    public Short getHomeorder() {
        return homeorder;
    }

    /**
     * 设置首页排序
     *
     * @param homeorder 首页排序
     */
    public void setHomeorder(Short homeorder) {
        this.homeorder = homeorder;
    }

    /**
     * 获取经营楼层
     *
     * @return manfloorno - 经营楼层
     */
    public String getManfloorno() {
        return manfloorno;
    }

    /**
     * 设置经营楼层
     *
     * @param manfloorno 经营楼层
     */
    public void setManfloorno(String manfloorno) {
        this.manfloorno = manfloorno;
    }

    /**
     * 获取商户信用评分
     *
     * @return mercredit - 商户信用评分
     */
    public BigDecimal getMercredit() {
        return mercredit;
    }

    /**
     * 设置商户信用评分
     *
     * @param mercredit 商户信用评分
     */
    public void setMercredit(BigDecimal mercredit) {
        this.mercredit = mercredit;
    }

    /**
     * 获取商户信用评分日期
     *
     * @return mercreditdate - 商户信用评分日期
     */
    public Date getMercreditdate() {
        return mercreditdate;
    }

    /**
     * 设置商户信用评分日期
     *
     * @param mercreditdate 商户信用评分日期
     */
    public void setMercreditdate(Date mercreditdate) {
        this.mercreditdate = mercreditdate;
    }

    /**
     * 获取业务员姓名
     *
     * @return yeusername - 业务员姓名
     */
    public String getYeusername() {
        return yeusername;
    }

    /**
     * 设置业务员姓名
     *
     * @param yeusername 业务员姓名
     */
    public void setYeusername(String yeusername) {
        this.yeusername = yeusername;
    }

    /**
     * 获取收款人姓名
     *
     * @return cwskname - 收款人姓名
     */
    public String getCwskname() {
        return cwskname;
    }

    /**
     * 设置收款人姓名
     *
     * @param cwskname 收款人姓名
     */
    public void setCwskname(String cwskname) {
        this.cwskname = cwskname;
    }

    /**
     * 获取收款人账号
     *
     * @return cwskzhno - 收款人账号
     */
    public String getCwskzhno() {
        return cwskzhno;
    }

    /**
     * 设置收款人账号
     *
     * @param cwskzhno 收款人账号
     */
    public void setCwskzhno(String cwskzhno) {
        this.cwskzhno = cwskzhno;
    }

    /**
     * 获取收款人银行
     *
     * @return cwskyinh - 收款人银行
     */
    public String getCwskyinh() {
        return cwskyinh;
    }

    /**
     * 设置收款人银行
     *
     * @param cwskyinh 收款人银行
     */
    public void setCwskyinh(String cwskyinh) {
        this.cwskyinh = cwskyinh;
    }

    /**
     * 获取收款银行行号
     *
     * @return cwskyhhh - 收款银行行号
     */
    public String getCwskyhhh() {
        return cwskyhhh;
    }

    /**
     * 设置收款银行行号
     *
     * @param cwskyhhh 收款银行行号
     */
    public void setCwskyhhh(String cwskyhhh) {
        this.cwskyhhh = cwskyhhh;
    }

    /**
     * 获取总行清算行行号
     *
     * @return cwskyhhh_zh - 总行清算行行号
     */
    public String getCwskyhhhZh() {
        return cwskyhhhZh;
    }

    /**
     * 设置总行清算行行号
     *
     * @param cwskyhhhZh 总行清算行行号
     */
    public void setCwskyhhhZh(String cwskyhhhZh) {
        this.cwskyhhhZh = cwskyhhhZh;
    }

    /**
     * 获取收款开户行名称
     *
     * @return cwskkhhmc - 收款开户行名称
     */
    public String getCwskkhhmc() {
        return cwskkhhmc;
    }

    /**
     * 设置收款开户行名称
     *
     * @param cwskkhhmc 收款开户行名称
     */
    public void setCwskkhhmc(String cwskkhhmc) {
        this.cwskkhhmc = cwskkhhmc;
    }

    /**
     * 获取地推代理公司名称
     *
     * @return dlgsname - 地推代理公司名称
     */
    public String getDlgsname() {
        return dlgsname;
    }

    /**
     * 设置地推代理公司名称
     *
     * @param dlgsname 地推代理公司名称
     */
    public void setDlgsname(String dlgsname) {
        this.dlgsname = dlgsname;
    }

    /**
     * 获取一码多付交易通道编码
     *
     * @return channel_no - 一码多付交易通道编码
     */
    public String getChannelNo() {
        return channelNo;
    }

    /**
     * 设置一码多付交易通道编码
     *
     * @param channelNo 一码多付交易通道编码
     */
    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    /**
     * 获取pda归属通道
     *
     * @return channel_pdano - pda归属通道
     */
    public String getChannelPdano() {
        return channelPdano;
    }

    /**
     * 设置pda归属通道
     *
     * @param channelPdano pda归属通道
     */
    public void setChannelPdano(String channelPdano) {
        this.channelPdano = channelPdano;
    }

    /**
     * 获取归属商圈编码
     *
     * @return businareano - 归属商圈编码
     */
    public String getBusinareano() {
        return businareano;
    }

    /**
     * 设置归属商圈编码
     *
     * @param businareano 归属商圈编码
     */
    public void setBusinareano(String businareano) {
        this.businareano = businareano;
    }

    /**
     * 获取财务收款信息审核01未审核02已审核
     *
     * @return cwskinfo_bill - 财务收款信息审核01未审核02已审核
     */
    public String getCwskinfoBill() {
        return cwskinfoBill;
    }

    /**
     * 设置财务收款信息审核01未审核02已审核
     *
     * @param cwskinfoBill 财务收款信息审核01未审核02已审核
     */
    public void setCwskinfoBill(String cwskinfoBill) {
        this.cwskinfoBill = cwskinfoBill;
    }

    /**
     * 获取联盟商户级别01一般商户02重点商户 重点商户pda不控制交易成功和打印成功
     *
     * @return mershjib - 联盟商户级别01一般商户02重点商户 重点商户pda不控制交易成功和打印成功
     */
    public String getMershjib() {
        return mershjib;
    }

    /**
     * 设置联盟商户级别01一般商户02重点商户 重点商户pda不控制交易成功和打印成功
     *
     * @param mershjib 联盟商户级别01一般商户02重点商户 重点商户pda不控制交易成功和打印成功
     */
    public void setMershjib(String mershjib) {
        this.mershjib = mershjib;
    }

    /**
     * 获取是否是线上销售商户01非线上销售商户 02 线上销售商户
     *
     * @return merlinesale - 是否是线上销售商户01非线上销售商户 02 线上销售商户
     */
    public String getMerlinesale() {
        return merlinesale;
    }

    /**
     * 设置是否是线上销售商户01非线上销售商户 02 线上销售商户
     *
     * @param merlinesale 是否是线上销售商户01非线上销售商户 02 线上销售商户
     */
    public void setMerlinesale(String merlinesale) {
        this.merlinesale = merlinesale;
    }

    /**
     * 获取营业执照名称
     *
     * @return merzhname - 营业执照名称
     */
    public String getMerzhname() {
        return merzhname;
    }

    /**
     * 设置营业执照名称
     *
     * @param merzhname 营业执照名称
     */
    public void setMerzhname(String merzhname) {
        this.merzhname = merzhname;
    }

    /**
     * 获取一清商户手续费是否补贴
     *
     * @return ifsxfbt - 一清商户手续费是否补贴
     */
    public Integer getIfsxfbt() {
        return ifsxfbt;
    }

    /**
     * 设置一清商户手续费是否补贴
     *
     * @param ifsxfbt 一清商户手续费是否补贴
     */
    public void setIfsxfbt(Integer ifsxfbt) {
        this.ifsxfbt = ifsxfbt;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}