package com.gahui.ghmall.data.entity;

import java.util.Date;

public class GhAddress {
    private Integer addressId;

    private Integer userId;

    private Integer addressCountryId;

    private Integer addressProvinceId;

    private Integer addressCityId;

    private Integer addressDistrictId;

    private String addressDetail;

    private String addressContact;

    private String addressPhone;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressCountryId() {
        return addressCountryId;
    }

    public void setAddressCountryId(Integer addressCountryId) {
        this.addressCountryId = addressCountryId;
    }

    public Integer getAddressProvinceId() {
        return addressProvinceId;
    }

    public void setAddressProvinceId(Integer addressProvinceId) {
        this.addressProvinceId = addressProvinceId;
    }

    public Integer getAddressCityId() {
        return addressCityId;
    }

    public void setAddressCityId(Integer addressCityId) {
        this.addressCityId = addressCityId;
    }

    public Integer getAddressDistrictId() {
        return addressDistrictId;
    }

    public void setAddressDistrictId(Integer addressDistrictId) {
        this.addressDistrictId = addressDistrictId;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public String getAddressContact() {
        return addressContact;
    }

    public void setAddressContact(String addressContact) {
        this.addressContact = addressContact == null ? null : addressContact.trim();
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone == null ? null : addressPhone.trim();
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