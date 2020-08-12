package com.gahui.ghmall.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GhGoodsSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhGoodsSpecExample() {
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

        public Criteria andGoodsSpecIdIsNull() {
            addCriterion("goods_spec_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdIsNotNull() {
            addCriterion("goods_spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdEqualTo(Integer value) {
            addCriterion("goods_spec_id =", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdNotEqualTo(Integer value) {
            addCriterion("goods_spec_id <>", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdGreaterThan(Integer value) {
            addCriterion("goods_spec_id >", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_spec_id >=", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdLessThan(Integer value) {
            addCriterion("goods_spec_id <", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_spec_id <=", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdIn(List<Integer> values) {
            addCriterion("goods_spec_id in", values, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdNotIn(List<Integer> values) {
            addCriterion("goods_spec_id not in", values, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_spec_id between", value1, value2, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_spec_id not between", value1, value2, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueIsNull() {
            addCriterion("goods_spec_value is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueIsNotNull() {
            addCriterion("goods_spec_value is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueEqualTo(String value) {
            addCriterion("goods_spec_value =", value, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueNotEqualTo(String value) {
            addCriterion("goods_spec_value <>", value, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueGreaterThan(String value) {
            addCriterion("goods_spec_value >", value, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spec_value >=", value, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueLessThan(String value) {
            addCriterion("goods_spec_value <", value, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueLessThanOrEqualTo(String value) {
            addCriterion("goods_spec_value <=", value, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueLike(String value) {
            addCriterion("goods_spec_value like", value, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueNotLike(String value) {
            addCriterion("goods_spec_value not like", value, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueIn(List<String> values) {
            addCriterion("goods_spec_value in", values, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueNotIn(List<String> values) {
            addCriterion("goods_spec_value not in", values, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueBetween(String value1, String value2) {
            addCriterion("goods_spec_value between", value1, value2, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValueNotBetween(String value1, String value2) {
            addCriterion("goods_spec_value not between", value1, value2, "goodsSpecValue");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceIsNull() {
            addCriterion("goods_spec_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceIsNotNull() {
            addCriterion("goods_spec_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceEqualTo(BigDecimal value) {
            addCriterion("goods_spec_price =", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_spec_price <>", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_spec_price >", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_spec_price >=", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceLessThan(BigDecimal value) {
            addCriterion("goods_spec_price <", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_spec_price <=", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceIn(List<BigDecimal> values) {
            addCriterion("goods_spec_price in", values, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_spec_price not in", values, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_spec_price between", value1, value2, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_spec_price not between", value1, value2, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumIsNull() {
            addCriterion("goods_spec_storage_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumIsNotNull() {
            addCriterion("goods_spec_storage_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumEqualTo(Integer value) {
            addCriterion("goods_spec_storage_num =", value, "goodsSpecStorageNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumNotEqualTo(Integer value) {
            addCriterion("goods_spec_storage_num <>", value, "goodsSpecStorageNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumGreaterThan(Integer value) {
            addCriterion("goods_spec_storage_num >", value, "goodsSpecStorageNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_spec_storage_num >=", value, "goodsSpecStorageNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumLessThan(Integer value) {
            addCriterion("goods_spec_storage_num <", value, "goodsSpecStorageNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_spec_storage_num <=", value, "goodsSpecStorageNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumIn(List<Integer> values) {
            addCriterion("goods_spec_storage_num in", values, "goodsSpecStorageNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumNotIn(List<Integer> values) {
            addCriterion("goods_spec_storage_num not in", values, "goodsSpecStorageNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_spec_storage_num between", value1, value2, "goodsSpecStorageNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecStorageNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_spec_storage_num not between", value1, value2, "goodsSpecStorageNum");
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