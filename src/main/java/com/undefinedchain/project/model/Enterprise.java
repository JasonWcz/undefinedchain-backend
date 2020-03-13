package com.undefinedchain.project.model;

import javax.persistence.*;

public class Enterprise {
    /**
     * 企业id
     */
    @Id
    private Integer eid;

    /**
     * 企业名
     */
    private String ename;

    /**
     * 企业角色
     */
    private Integer etype;

    /**
     * 企业管理员
     */
    private String uname;

    /**
     * 企业管理员身份证号
     */
    private String uidnumber;

    /**
     * 企业法人
     */
    private String lname;

    /**
     * 企业法人身份证号
     */
    private String lidnumber;

    /**
     * 证件类型
     */
    @Column(name = "cocertificate_type")
    private Integer cocertificateType;

    /**
     * 证件码
     */
    @Column(name = "certificate_code")
    private String certificateCode;

    /**
     * 银行卡账户名
     */
    @Column(name = "bankaccount_name")
    private String bankaccountName;

    /**
     * 银行账户
     */
    @Column(name = "bankaccount_id")
    private String bankaccountId;

    /**
     * 开户银行
     */
    private String bankname;

    /**
     * 所属支行
     */
    private String subbank;

    /**
     * 获取企业id
     *
     * @return eid - 企业id
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 设置企业id
     *
     * @param eid 企业id
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 获取企业名
     *
     * @return ename - 企业名
     */
    public String getEname() {
        return ename;
    }

    /**
     * 设置企业名
     *
     * @param ename 企业名
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * 获取企业角色
     *
     * @return etype - 企业角色
     */
    public Integer getEtype() {
        return etype;
    }

    /**
     * 设置企业角色
     *
     * @param etype 企业角色
     */
    public void setEtype(Integer etype) {
        this.etype = etype;
    }

    /**
     * 获取企业管理员
     *
     * @return uname - 企业管理员
     */
    public String getUname() {
        return uname;
    }

    /**
     * 设置企业管理员
     *
     * @param uname 企业管理员
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * 获取企业管理员身份证号
     *
     * @return uidnumber - 企业管理员身份证号
     */
    public String getUidnumber() {
        return uidnumber;
    }

    /**
     * 设置企业管理员身份证号
     *
     * @param uidnumber 企业管理员身份证号
     */
    public void setUidnumber(String uidnumber) {
        this.uidnumber = uidnumber;
    }

    /**
     * 获取企业法人
     *
     * @return lname - 企业法人
     */
    public String getLname() {
        return lname;
    }

    /**
     * 设置企业法人
     *
     * @param lname 企业法人
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * 获取企业法人身份证号
     *
     * @return lidnumber - 企业法人身份证号
     */
    public String getLidnumber() {
        return lidnumber;
    }

    /**
     * 设置企业法人身份证号
     *
     * @param lidnumber 企业法人身份证号
     */
    public void setLidnumber(String lidnumber) {
        this.lidnumber = lidnumber;
    }

    /**
     * 获取证件类型
     *
     * @return cocertificate_type - 证件类型
     */
    public Integer getCocertificateType() {
        return cocertificateType;
    }

    /**
     * 设置证件类型
     *
     * @param cocertificateType 证件类型
     */
    public void setCocertificateType(Integer cocertificateType) {
        this.cocertificateType = cocertificateType;
    }

    /**
     * 获取证件码
     *
     * @return certificate_code - 证件码
     */
    public String getCertificateCode() {
        return certificateCode;
    }

    /**
     * 设置证件码
     *
     * @param certificateCode 证件码
     */
    public void setCertificateCode(String certificateCode) {
        this.certificateCode = certificateCode;
    }

    /**
     * 获取银行卡账户名
     *
     * @return bankaccount_name - 银行卡账户名
     */
    public String getBankaccountName() {
        return bankaccountName;
    }

    /**
     * 设置银行卡账户名
     *
     * @param bankaccountName 银行卡账户名
     */
    public void setBankaccountName(String bankaccountName) {
        this.bankaccountName = bankaccountName;
    }

    /**
     * 获取银行账户
     *
     * @return bankaccount_id - 银行账户
     */
    public String getBankaccountId() {
        return bankaccountId;
    }

    /**
     * 设置银行账户
     *
     * @param bankaccountId 银行账户
     */
    public void setBankaccountId(String bankaccountId) {
        this.bankaccountId = bankaccountId;
    }

    /**
     * 获取开户银行
     *
     * @return bankname - 开户银行
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 设置开户银行
     *
     * @param bankname 开户银行
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * 获取所属支行
     *
     * @return subbank - 所属支行
     */
    public String getSubbank() {
        return subbank;
    }

    /**
     * 设置所属支行
     *
     * @param subbank 所属支行
     */
    public void setSubbank(String subbank) {
        this.subbank = subbank;
    }
}
