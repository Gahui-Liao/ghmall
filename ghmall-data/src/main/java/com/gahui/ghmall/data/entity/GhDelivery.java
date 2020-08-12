package com.gahui.ghmall.data.entity;

import java.util.Date;

public class GhDelivery {
    private Integer deliveryId;

    private String deliveryCode;

    private Integer orderItemId;

    private Byte deliveryFlowNum;

    private String deliveryShipperName;

    private String deliveryShipperCode;

    private Integer userId;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode == null ? null : deliveryCode.trim();
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Byte getDeliveryFlowNum() {
        return deliveryFlowNum;
    }

    public void setDeliveryFlowNum(Byte deliveryFlowNum) {
        this.deliveryFlowNum = deliveryFlowNum;
    }

    public String getDeliveryShipperName() {
        return deliveryShipperName;
    }

    public void setDeliveryShipperName(String deliveryShipperName) {
        this.deliveryShipperName = deliveryShipperName == null ? null : deliveryShipperName.trim();
    }

    public String getDeliveryShipperCode() {
        return deliveryShipperCode;
    }

    public void setDeliveryShipperCode(String deliveryShipperCode) {
        this.deliveryShipperCode = deliveryShipperCode == null ? null : deliveryShipperCode.trim();
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