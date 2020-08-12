package com.gahui.ghmall.data.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GhOrderItem {
    private Integer orderItemId;

    private Integer orderId;

    private String orderItemCode;

    private Integer goodsId;

    private Byte orderItemFlowNum;

    private Byte orderItemPayNum;

    private BigDecimal orderItemOrginalPrice;

    private BigDecimal orderItemFinalPrice;

    private BigDecimal orderItemDiscountAmount;

    private Integer userId;

    private Integer commentId;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemCode() {
        return orderItemCode;
    }

    public void setOrderItemCode(String orderItemCode) {
        this.orderItemCode = orderItemCode == null ? null : orderItemCode.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getOrderItemFlowNum() {
        return orderItemFlowNum;
    }

    public void setOrderItemFlowNum(Byte orderItemFlowNum) {
        this.orderItemFlowNum = orderItemFlowNum;
    }

    public Byte getOrderItemPayNum() {
        return orderItemPayNum;
    }

    public void setOrderItemPayNum(Byte orderItemPayNum) {
        this.orderItemPayNum = orderItemPayNum;
    }

    public BigDecimal getOrderItemOrginalPrice() {
        return orderItemOrginalPrice;
    }

    public void setOrderItemOrginalPrice(BigDecimal orderItemOrginalPrice) {
        this.orderItemOrginalPrice = orderItemOrginalPrice;
    }

    public BigDecimal getOrderItemFinalPrice() {
        return orderItemFinalPrice;
    }

    public void setOrderItemFinalPrice(BigDecimal orderItemFinalPrice) {
        this.orderItemFinalPrice = orderItemFinalPrice;
    }

    public BigDecimal getOrderItemDiscountAmount() {
        return orderItemDiscountAmount;
    }

    public void setOrderItemDiscountAmount(BigDecimal orderItemDiscountAmount) {
        this.orderItemDiscountAmount = orderItemDiscountAmount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
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