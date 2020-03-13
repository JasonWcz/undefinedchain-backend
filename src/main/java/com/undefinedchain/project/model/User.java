package com.undefinedchain.project.model;

import javax.persistence.*;

public class User {
    /**
     * 用户ID
     */
    @Id
    private Integer uid;

    /**
     * 用户名/登录名
     */
    private String uname;

    /**
     * 密码
     */
    private String upass;

    /**
     * 用户角色
     */
    private Integer utype;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 企业id
     */
    private Integer eid;

    /**
     * 账户认证状态
     */
    @Column(name = "account_state")
    private Integer accountState;

    /**
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取用户名/登录名
     *
     * @return uname - 用户名/登录名
     */
    public String getUname() {
        return uname;
    }

    /**
     * 设置用户名/登录名
     *
     * @param uname 用户名/登录名
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * 获取密码
     *
     * @return upass - 密码
     */
    public String getUpass() {
        return upass;
    }

    /**
     * 设置密码
     *
     * @param upass 密码
     */
    public void setUpass(String upass) {
        this.upass = upass;
    }

    /**
     * 获取用户角色
     *
     * @return utype - 用户角色
     */
    public Integer getUtype() {
        return utype;
    }

    /**
     * 设置用户角色
     *
     * @param utype 用户角色
     */
    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

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
     * 获取账户认证状态
     *
     * @return account_state - 账户认证状态
     */
    public Integer getAccountState() {
        return accountState;
    }

    /**
     * 设置账户认证状态
     *
     * @param accountState 账户认证状态
     */
    public void setAccountState(Integer accountState) {
        this.accountState = accountState;
    }
}