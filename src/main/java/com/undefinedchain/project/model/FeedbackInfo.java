package com.undefinedchain.project.model;

import javax.persistence.*;

@Table(name = "feedback_info")
public class FeedbackInfo {
    /**
     * 反馈id
     */
    @Id
    private Integer fbid;

    /**
     * 认证材料id
     */
    private String cid;

    /**
     * 驳回人id
     */
    private Integer uid;

    /**
     * 驳回原因
     */
    @Column(name = "feed_info")
    private String feedInfo;

    /**
     * 获取反馈id
     *
     * @return fbid - 反馈id
     */
    public Integer getFbid() {
        return fbid;
    }

    /**
     * 设置反馈id
     *
     * @param fbid 反馈id
     */
    public void setFbid(Integer fbid) {
        this.fbid = fbid;
    }

    /**
     * 获取认证材料id
     *
     * @return cid - 认证材料id
     */
    public String getCid() {
        return cid;
    }

    /**
     * 设置认证材料id
     *
     * @param cid 认证材料id
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * 获取驳回人id
     *
     * @return uid - 驳回人id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置驳回人id
     *
     * @param uid 驳回人id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取驳回原因
     *
     * @return feed_info - 驳回原因
     */
    public String getFeedInfo() {
        return feedInfo;
    }

    /**
     * 设置驳回原因
     *
     * @param feedInfo 驳回原因
     */
    public void setFeedInfo(String feedInfo) {
        this.feedInfo = feedInfo;
    }
}