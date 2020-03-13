package com.undefinedchain.project.model;

import javax.persistence.*;

@Table(name = "financebill_state_dim")
public class FinancebillStateDim {
    /**
     * 金票状态id
     */
    @Id
    private Integer fstateid;

    /**
     * 金票状态信息
     */
    @Column(name = "fstate_info")
    private String fstateInfo;

    /**
     * 获取金票状态id
     *
     * @return fstateid - 金票状态id
     */
    public Integer getFstateid() {
        return fstateid;
    }

    /**
     * 设置金票状态id
     *
     * @param fstateid 金票状态id
     */
    public void setFstateid(Integer fstateid) {
        this.fstateid = fstateid;
    }

    /**
     * 获取金票状态信息
     *
     * @return fstate_info - 金票状态信息
     */
    public String getFstateInfo() {
        return fstateInfo;
    }

    /**
     * 设置金票状态信息
     *
     * @param fstateInfo 金票状态信息
     */
    public void setFstateInfo(String fstateInfo) {
        this.fstateInfo = fstateInfo;
    }
}