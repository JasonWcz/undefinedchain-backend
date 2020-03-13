package com.undefinedchain.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Financebill {
    /**
     * 金票id
     */
    @Id
    private Integer fid;

    /**
     * fcode
     */
    private String ename;

    /**
     * 原票id
     */
    private Integer oid;

    /**
     * 子票id
     */
    private Integer sid;

    /**
     * 开票用户id
     */
    private Integer uid;

    /**
     * 当前持有人id
     */
    @Column(name = "now_id")
    private Integer nowId;

    /**
     * 认证材料.pdf id
     */
    private Integer cid;

    /**
     * 开票企业id
     */
    private Integer eid;

    /**
     * 持票企业id
     */
    private Integer hid;

    /**
     * 保理商id
     */
    private Integer ftid;

    /**
     * 开票时间
     */
    @Column(name = "ticketing_date")
    private Date ticketingDate;

    /**
     * 到期时间
     */
    @Column(name = "expire_date")
    private Date expireDate;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 额度
     */
    @Column(name = "financial_quota")
    private BigDecimal financialQuota;

    /**
     * 金票流程阶段
     */
    @Column(name = "bill_process")
    private Integer billProcess;

    /**
     * 金票状态
     */
    @Column(name = "bill_state")
    private Integer billState;

    /**
     * 获取金票id
     *
     * @return fid - 金票id
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * 设置金票id
     *
     * @param fid 金票id
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * 获取fcode
     *
     * @return ename - fcode
     */
    public String getEname() {
        return ename;
    }

    /**
     * 设置fcode
     *
     * @param ename fcode
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * 获取原票id
     *
     * @return oid - 原票id
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 设置原票id
     *
     * @param oid 原票id
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * 获取子票id
     *
     * @return sid - 子票id
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置子票id
     *
     * @param sid 子票id
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取开票用户id
     *
     * @return uid - 开票用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置开票用户id
     *
     * @param uid 开票用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取当前持有人id
     *
     * @return now_id - 当前持有人id
     */
    public Integer getNowId() {
        return nowId;
    }

    /**
     * 设置当前持有人id
     *
     * @param nowId 当前持有人id
     */
    public void setNowId(Integer nowId) {
        this.nowId = nowId;
    }

    /**
     * 获取认证材料.pdf id
     *
     * @return cid - 认证材料.pdf id
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置认证材料.pdf id
     *
     * @param cid 认证材料.pdf id
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取开票企业id
     *
     * @return eid - 开票企业id
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 设置开票企业id
     *
     * @param eid 开票企业id
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 获取持票企业id
     *
     * @return hid - 持票企业id
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * 设置持票企业id
     *
     * @param hid 持票企业id
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * 获取保理商id
     *
     * @return ftid - 保理商id
     */
    public Integer getFtid() {
        return ftid;
    }

    /**
     * 设置保理商id
     *
     * @param ftid 保理商id
     */
    public void setFtid(Integer ftid) {
        this.ftid = ftid;
    }

    /**
     * 获取开票时间
     *
     * @return ticketing_date - 开票时间
     */
    public Date getTicketingDate() {
        return ticketingDate;
    }

    /**
     * 设置开票时间
     *
     * @param ticketingDate 开票时间
     */
    public void setTicketingDate(Date ticketingDate) {
        this.ticketingDate = ticketingDate;
    }

    /**
     * 获取到期时间
     *
     * @return expire_date - 到期时间
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * 设置到期时间
     *
     * @param expireDate 到期时间
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取额度
     *
     * @return financial_quota - 额度
     */
    public BigDecimal getFinancialQuota() {
        return financialQuota;
    }

    /**
     * 设置额度
     *
     * @param financialQuota 额度
     */
    public void setFinancialQuota(BigDecimal financialQuota) {
        this.financialQuota = financialQuota;
    }

    /**
     * 获取金票流程阶段
     *
     * @return bill_process - 金票流程阶段
     */
    public Integer getBillProcess() {
        return billProcess;
    }

    /**
     * 设置金票流程阶段
     *
     * @param billProcess 金票流程阶段
     */
    public void setBillProcess(Integer billProcess) {
        this.billProcess = billProcess;
    }

    /**
     * 获取金票状态
     *
     * @return bill_state - 金票状态
     */
    public Integer getBillState() {
        return billState;
    }

    /**
     * 设置金票状态
     *
     * @param billState 金票状态
     */
    public void setBillState(Integer billState) {
        this.billState = billState;
    }
}