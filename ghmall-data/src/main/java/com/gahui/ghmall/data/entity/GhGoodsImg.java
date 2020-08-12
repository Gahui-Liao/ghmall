package com.gahui.ghmall.data.entity;

import java.util.Date;

public class GhGoodsImg {
    private Integer goodsImgId;

    private Integer goodsId;

    private String goodsImgUrl;

    private Byte goodsImgSeq;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getGoodsImgId() {
        return goodsImgId;
    }

    public void setGoodsImgId(Integer goodsImgId) {
        this.goodsImgId = goodsImgId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl == null ? null : goodsImgUrl.trim();
    }

    public Byte getGoodsImgSeq() {
        return goodsImgSeq;
    }

    public void setGoodsImgSeq(Byte goodsImgSeq) {
        this.goodsImgSeq = goodsImgSeq;
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