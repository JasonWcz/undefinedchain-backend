package com.undefinedchain.project.model;

import javax.persistence.*;

public class Certificationinfo {
    /**
     * 认证id
     */
    @Id
    private Integer cid;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 企业id
     */
    private Integer eid;

    /**
     * 认证材料前缀名称
     */
    @Column(name = "certification_info")
    private String certificationInfo;

    /**
     * 认证状态
     */
    @Column(name = "certificate_type")
    private Integer certificateType;

    /**
     * 获取认证id
     *
     * @return cid - 认证id
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置认证id
     *
     * @param cid 认证id
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
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
     * 获取认证材料前缀名称
     *
     * @return certification_info - 认证材料前缀名称
     */
    public String getCertificationInfo() {
        return certificationInfo;
    }

    /**
     * 设置认证材料前缀名称
     *
     * @param certificationInfo 认证材料前缀名称
     */
    public void setCertificationInfo(String certificationInfo) {
        this.certificationInfo = certificationInfo;
    }

    /**
     * 获取认证状态
     *
     * @return certificate_type - 认证状态
     */
    public Integer getCertificateType() {
        return certificateType;
    }

    /**
     * 设置认证状态
     *
     * @param certificateType 认证状态
     */
    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }
}