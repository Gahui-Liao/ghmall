package com.gahui.ghmall.data.entity;

import java.util.Date;

public class GhNotice {
    private Integer noticeId;

    private String noticeTitle;

    private String noticeDetail;

    private Date noticeEffTime;

    private Date noticeExpTime;

    private Byte noticeSeq;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeDetail() {
        return noticeDetail;
    }

    public void setNoticeDetail(String noticeDetail) {
        this.noticeDetail = noticeDetail == null ? null : noticeDetail.trim();
    }

    public Date getNoticeEffTime() {
        return noticeEffTime;
    }

    public void setNoticeEffTime(Date noticeEffTime) {
        this.noticeEffTime = noticeEffTime;
    }

    public Date getNoticeExpTime() {
        return noticeExpTime;
    }

    public void setNoticeExpTime(Date noticeExpTime) {
        this.noticeExpTime = noticeExpTime;
    }

    public Byte getNoticeSeq() {
        return noticeSeq;
    }

    public void setNoticeSeq(Byte noticeSeq) {
        this.noticeSeq = noticeSeq;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}