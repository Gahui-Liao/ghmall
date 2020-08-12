package com.gahui.ghmall.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GhOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumIsNull() {
            addCriterion("order_flow_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumIsNotNull() {
            addCriterion("order_flow_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumEqualTo(Byte value) {
            addCriterion("order_flow_num =", value, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumNotEqualTo(Byte value) {
            addCriterion("order_flow_num <>", value, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumGreaterThan(Byte value) {
            addCriterion("order_flow_num >", value, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_flow_num >=", value, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumLessThan(Byte value) {
            addCriterion("order_flow_num <", value, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumLessThanOrEqualTo(Byte value) {
            addCriterion("order_flow_num <=", value, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumIn(List<Byte> values) {
            addCriterion("order_flow_num in", values, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumNotIn(List<Byte> values) {
            addCriterion("order_flow_num not in", values, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumBetween(Byte value1, Byte value2) {
            addCriterion("order_flow_num between", value1, value2, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNumNotBetween(Byte value1, Byte value2) {
            addCriterion("order_flow_num not between", value1, value2, "orderFlowNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumIsNull() {
            addCriterion("order_pay_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumIsNotNull() {
            addCriterion("order_pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumEqualTo(Byte value) {
            addCriterion("order_pay_num =", value, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumNotEqualTo(Byte value) {
            addCriterion("order_pay_num <>", value, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumGreaterThan(Byte value) {
            addCriterion("order_pay_num >", value, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_pay_num >=", value, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumLessThan(Byte value) {
            addCriterion("order_pay_num <", value, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumLessThanOrEqualTo(Byte value) {
            addCriterion("order_pay_num <=", value, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumIn(List<Byte> values) {
            addCriterion("order_pay_num in", values, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumNotIn(List<Byte> values) {
            addCriterion("order_pay_num not in", values, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumBetween(Byte value1, Byte value2) {
            addCriterion("order_pay_num between", value1, value2, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderPayNumNotBetween(Byte value1, Byte value2) {
            addCriterion("order_pay_num not between", value1, value2, "orderPayNum");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceIsNull() {
            addCriterion("order_orginal_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceIsNotNull() {
            addCriterion("order_orginal_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceEqualTo(BigDecimal value) {
            addCriterion("order_orginal_price =", value, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_orginal_price <>", value, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceGreaterThan(BigDecimal value) {
            addCriterion("order_orginal_price >", value, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_orginal_price >=", value, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceLessThan(BigDecimal value) {
            addCriterion("order_orginal_price <", value, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_orginal_price <=", value, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceIn(List<BigDecimal> values) {
            addCriterion("order_orginal_price in", values, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_orginal_price not in", values, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_orginal_price between", value1, value2, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOrginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_orginal_price not between", value1, value2, "orderOrginalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceIsNull() {
            addCriterion("order_final_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceIsNotNull() {
            addCriterion("order_final_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceEqualTo(BigDecimal value) {
            addCriterion("order_final_price =", value, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_final_price <>", value, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceGreaterThan(BigDecimal value) {
            addCriterion("order_final_price >", value, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_final_price >=", value, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceLessThan(BigDecimal value) {
            addCriterion("order_final_price <", value, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_final_price <=", value, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceIn(List<BigDecimal> values) {
            addCriterion("order_final_price in", values, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_final_price not in", values, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_final_price between", value1, value2, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderFinalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_final_price not between", value1, value2, "orderFinalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountIsNull() {
            addCriterion("order_discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountIsNotNull() {
            addCriterion("order_discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("order_discount_amount =", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_discount_amount <>", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("order_discount_amount >", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_discount_amount >=", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountLessThan(BigDecimal value) {
            addCriterion("order_discount_amount <", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_discount_amount <=", value, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("order_discount_amount in", values, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_discount_amount not in", values, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_discount_amount between", value1, value2, "orderDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_discount_amount not between", value1, value2, "orderDiscountAmount");
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