package com.gahui.ghmall.data.entity;

import java.util.Date;

public class GhAdvertisement {
    private Integer advertisementId;

    private String advertisementImgUrl;

    private Integer goodsId;

    private Date advertisementEffTime;

    private Date advertisementExpTime;

    private Byte advertisementSeq;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(Integer advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getAdvertisementImgUrl() {
        return advertisementImgUrl;
    }

    public void setAdvertisementImgUrl(String advertisementImgUrl) {
        this.advertisementImgUrl = advertisementImgUrl == null ? null : advertisementImgUrl.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getAdvertisementEffTime() {
        return advertisementEffTime;
    }

    public void setAdvertisementEffTime(Date advertisementEffTime) {
        this.advertisementEffTime = advertisementEffTime;
    }

    public Date getAdvertisementExpTime() {
        return advertisementExpTime;
    }

    public void setAdvertisementExpTime(Date advertisementExpTime) {
        this.advertisementExpTime = advertisementExpTime;
    }

    public Byte getAdvertisementSeq() {
        return advertisementSeq;
    }

    public void setAdvertisementSeq(Byte advertisementSeq) {
        this.advertisementSeq = advertisementSeq;
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