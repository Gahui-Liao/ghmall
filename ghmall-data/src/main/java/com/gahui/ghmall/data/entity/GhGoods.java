package com.gahui.ghmall.data.entity;

import java.util.Date;

public class GhGoods {
    private Integer goodsId;

    private String goodsCode;

    private Integer categoryId;

    private String goodsIconUrl;

    private String goodsBrief;

    private Integer goodsSellNum;

    private String goodsDetail;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getGoodsIconUrl() {
        return goodsIconUrl;
    }

    public void setGoodsIconUrl(String goodsIconUrl) {
        this.goodsIconUrl = goodsIconUrl == null ? null : goodsIconUrl.trim();
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief == null ? null : goodsBrief.trim();
    }

    public Integer getGoodsSellNum() {
        return goodsSellNum;
    }

    public void setGoodsSellNum(Integer goodsSellNum) {
        this.goodsSellNum = goodsSellNum;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
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