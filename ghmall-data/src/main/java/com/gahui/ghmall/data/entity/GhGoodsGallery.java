package com.gahui.ghmall.data.entity;

import java.util.Date;

public class GhGoodsGallery {
    private Integer goodsGalleryId;

    private Integer goodsId;

    private String goodsGalleryUrl;

    private Byte goodsGallerySeq;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getGoodsGalleryId() {
        return goodsGalleryId;
    }

    public void setGoodsGalleryId(Integer goodsGalleryId) {
        this.goodsGalleryId = goodsGalleryId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsGalleryUrl() {
        return goodsGalleryUrl;
    }

    public void setGoodsGalleryUrl(String goodsGalleryUrl) {
        this.goodsGalleryUrl = goodsGalleryUrl == null ? null : goodsGalleryUrl.trim();
    }

    public Byte getGoodsGallerySeq() {
        return goodsGallerySeq;
    }

    public void setGoodsGallerySeq(Byte goodsGallerySeq) {
        this.goodsGallerySeq = goodsGallerySeq;
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