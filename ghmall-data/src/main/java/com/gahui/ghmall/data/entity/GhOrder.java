package com.gahui.ghmall.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GhOrder {
    private Integer orderId;

    private String orderCode;

    private Byte orderFlowNum;

    private Byte orderPayNum;

    private BigDecimal orderOrginalPrice;

    private BigDecimal orderFinalPrice;

    private BigDecimal orderDiscountAmount;

    private Integer userId;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Byte getOrderFlowNum() {
        return orderFlowNum;
    }

    public void setOrderFlowNum(Byte orderFlowNum) {
        this.orderFlowNum = orderFlowNum;
    }

    public Byte getOrderPayNum() {
        return orderPayNum;
    }

    public void setOrderPayNum(Byte orderPayNum) {
        this.orderPayNum = orderPayNum;
    }

    public BigDecimal getOrderOrginalPrice() {
        return orderOrginalPrice;
    }

    public void setOrderOrginalPrice(BigDecimal orderOrginalPrice) {
        this.orderOrginalPrice = orderOrginalPrice;
    }

    public BigDecimal getOrderFinalPrice() {
        return orderFinalPrice;
    }

    public void setOrderFinalPrice(BigDecimal orderFinalPrice) {
        this.orderFinalPrice = orderFinalPrice;
    }

    public BigDecimal getOrderDiscountAmount() {
        return orderDiscountAmount;
    }

    public void setOrderDiscountAmount(BigDecimal orderDiscountAmount) {
        this.orderDiscountAmount = orderDiscountAmount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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