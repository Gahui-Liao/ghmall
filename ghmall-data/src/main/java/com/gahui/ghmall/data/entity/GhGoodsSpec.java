package com.gahui.ghmall.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GhGoodsSpec {
    private Integer goodsSpecId;

    private Integer goodsId;

    private String goodsSpecValue;

    private BigDecimal goodsSpecPrice;

    private Integer goodsSpecStorageNum;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(Integer goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSpecValue() {
        return goodsSpecValue;
    }

    public void setGoodsSpecValue(String goodsSpecValue) {
        this.goodsSpecValue = goodsSpecValue == null ? null : goodsSpecValue.trim();
    }

    public BigDecimal getGoodsSpecPrice() {
        return goodsSpecPrice;
    }

    public void setGoodsSpecPrice(BigDecimal goodsSpecPrice) {
        this.goodsSpecPrice = goodsSpecPrice;
    }

    public Integer getGoodsSpecStorageNum() {
        return goodsSpecStorageNum;
    }

    public void setGoodsSpecStorageNum(Integer goodsSpecStorageNum) {
        this.goodsSpecStorageNum = goodsSpecStorageNum;
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