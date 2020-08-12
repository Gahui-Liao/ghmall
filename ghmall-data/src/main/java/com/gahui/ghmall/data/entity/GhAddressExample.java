package com.gahui.ghmall.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GhAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhAddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdIsNull() {
            addCriterion("address_country_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdIsNotNull() {
            addCriterion("address_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdEqualTo(Integer value) {
            addCriterion("address_country_id =", value, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdNotEqualTo(Integer value) {
            addCriterion("address_country_id <>", value, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdGreaterThan(Integer value) {
            addCriterion("address_country_id >", value, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_country_id >=", value, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdLessThan(Integer value) {
            addCriterion("address_country_id <", value, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_country_id <=", value, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdIn(List<Integer> values) {
            addCriterion("address_country_id in", values, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdNotIn(List<Integer> values) {
            addCriterion("address_country_id not in", values, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("address_country_id between", value1, value2, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_country_id not between", value1, value2, "addressCountryId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdIsNull() {
            addCriterion("address_province_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdIsNotNull() {
            addCriterion("address_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdEqualTo(Integer value) {
            addCriterion("address_province_id =", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdNotEqualTo(Integer value) {
            addCriterion("address_province_id <>", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdGreaterThan(Integer value) {
            addCriterion("address_province_id >", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_province_id >=", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdLessThan(Integer value) {
            addCriterion("address_province_id <", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_province_id <=", value, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdIn(List<Integer> values) {
            addCriterion("address_province_id in", values, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdNotIn(List<Integer> values) {
            addCriterion("address_province_id not in", values, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("address_province_id between", value1, value2, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_province_id not between", value1, value2, "addressProvinceId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdIsNull() {
            addCriterion("address_city_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdIsNotNull() {
            addCriterion("address_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdEqualTo(Integer value) {
            addCriterion("address_city_id =", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdNotEqualTo(Integer value) {
            addCriterion("address_city_id <>", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdGreaterThan(Integer value) {
            addCriterion("address_city_id >", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_city_id >=", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdLessThan(Integer value) {
            addCriterion("address_city_id <", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_city_id <=", value, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdIn(List<Integer> values) {
            addCriterion("address_city_id in", values, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdNotIn(List<Integer> values) {
            addCriterion("address_city_id not in", values, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdBetween(Integer value1, Integer value2) {
            addCriterion("address_city_id between", value1, value2, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_city_id not between", value1, value2, "addressCityId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdIsNull() {
            addCriterion("address_district_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdIsNotNull() {
            addCriterion("address_district_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdEqualTo(Integer value) {
            addCriterion("address_district_id =", value, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdNotEqualTo(Integer value) {
            addCriterion("address_district_id <>", value, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdGreaterThan(Integer value) {
            addCriterion("address_district_id >", value, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_district_id >=", value, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdLessThan(Integer value) {
            addCriterion("address_district_id <", value, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_district_id <=", value, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdIn(List<Integer> values) {
            addCriterion("address_district_id in", values, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdNotIn(List<Integer> values) {
            addCriterion("address_district_id not in", values, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("address_district_id between", value1, value2, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_district_id not between", value1, value2, "addressDistrictId");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNull() {
            addCriterion("address_detail is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNotNull() {
            addCriterion("address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailEqualTo(String value) {
            addCriterion("address_detail =", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("address_detail >", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail >=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThan(String value) {
            addCriterion("address_detail <", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLike(String value) {
            addCriterion("address_detail like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotLike(String value) {
            addCriterion("address_detail not like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIn(List<String> values) {
            addCriterion("address_detail in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotIn(List<String> values) {
            addCriterion("address_detail not in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressContactIsNull() {
            addCriterion("address_contact is null");
            return (Criteria) this;
        }

        public Criteria andAddressContactIsNotNull() {
            addCriterion("address_contact is not null");
            return (Criteria) this;
        }

        public Criteria andAddressContactEqualTo(String value) {
            addCriterion("address_contact =", value, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactNotEqualTo(String value) {
            addCriterion("address_contact <>", value, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactGreaterThan(String value) {
            addCriterion("address_contact >", value, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactGreaterThanOrEqualTo(String value) {
            addCriterion("address_contact >=", value, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactLessThan(String value) {
            addCriterion("address_contact <", value, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactLessThanOrEqualTo(String value) {
            addCriterion("address_contact <=", value, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactLike(String value) {
            addCriterion("address_contact like", value, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactNotLike(String value) {
            addCriterion("address_contact not like", value, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactIn(List<String> values) {
            addCriterion("address_contact in", values, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactNotIn(List<String> values) {
            addCriterion("address_contact not in", values, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactBetween(String value1, String value2) {
            addCriterion("address_contact between", value1, value2, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressContactNotBetween(String value1, String value2) {
            addCriterion("address_contact not between", value1, value2, "addressContact");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneIsNull() {
            addCriterion("address_phone is null");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneIsNotNull() {
            addCriterion("address_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneEqualTo(String value) {
            addCriterion("address_phone =", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneNotEqualTo(String value) {
            addCriterion("address_phone <>", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneGreaterThan(String value) {
            addCriterion("address_phone >", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("address_phone >=", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneLessThan(String value) {
            addCriterion("address_phone <", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneLessThanOrEqualTo(String value) {
            addCriterion("address_phone <=", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneLike(String value) {
            addCriterion("address_phone like", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneNotLike(String value) {
            addCriterion("address_phone not like", value, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneIn(List<String> values) {
            addCriterion("address_phone in", values, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneNotIn(List<String> values) {
            addCriterion("address_phone not in", values, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneBetween(String value1, String value2) {
            addCriterion("address_phone between", value1, value2, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andAddressPhoneNotBetween(String value1, String value2) {
            addCriterion("address_phone not between", value1, value2, "addressPhone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}