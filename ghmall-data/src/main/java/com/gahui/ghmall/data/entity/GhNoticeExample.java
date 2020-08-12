package com.gahui.ghmall.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GhNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhNoticeExample() {
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(Integer value) {
            addCriterion("notice_id =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(Integer value) {
            addCriterion("notice_id <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(Integer value) {
            addCriterion("notice_id >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_id >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(Integer value) {
            addCriterion("notice_id <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("notice_id <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<Integer> values) {
            addCriterion("notice_id in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<Integer> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNull() {
            addCriterion("notice_title is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("notice_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("notice_title =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("notice_title <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("notice_title >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notice_title >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("notice_title <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("notice_title <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("notice_title like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("notice_title not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("notice_title in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("notice_title not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("notice_title between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("notice_title not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIsNull() {
            addCriterion("notice_detail is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIsNotNull() {
            addCriterion("notice_detail is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailEqualTo(String value) {
            addCriterion("notice_detail =", value, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailNotEqualTo(String value) {
            addCriterion("notice_detail <>", value, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailGreaterThan(String value) {
            addCriterion("notice_detail >", value, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("notice_detail >=", value, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailLessThan(String value) {
            addCriterion("notice_detail <", value, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailLessThanOrEqualTo(String value) {
            addCriterion("notice_detail <=", value, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailLike(String value) {
            addCriterion("notice_detail like", value, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailNotLike(String value) {
            addCriterion("notice_detail not like", value, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIn(List<String> values) {
            addCriterion("notice_detail in", values, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailNotIn(List<String> values) {
            addCriterion("notice_detail not in", values, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailBetween(String value1, String value2) {
            addCriterion("notice_detail between", value1, value2, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailNotBetween(String value1, String value2) {
            addCriterion("notice_detail not between", value1, value2, "noticeDetail");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeIsNull() {
            addCriterion("notice_eff_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeIsNotNull() {
            addCriterion("notice_eff_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeEqualTo(Date value) {
            addCriterion("notice_eff_time =", value, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeNotEqualTo(Date value) {
            addCriterion("notice_eff_time <>", value, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeGreaterThan(Date value) {
            addCriterion("notice_eff_time >", value, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_eff_time >=", value, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeLessThan(Date value) {
            addCriterion("notice_eff_time <", value, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeLessThanOrEqualTo(Date value) {
            addCriterion("notice_eff_time <=", value, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeIn(List<Date> values) {
            addCriterion("notice_eff_time in", values, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeNotIn(List<Date> values) {
            addCriterion("notice_eff_time not in", values, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeBetween(Date value1, Date value2) {
            addCriterion("notice_eff_time between", value1, value2, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeEffTimeNotBetween(Date value1, Date value2) {
            addCriterion("notice_eff_time not between", value1, value2, "noticeEffTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeIsNull() {
            addCriterion("notice_exp_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeIsNotNull() {
            addCriterion("notice_exp_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeEqualTo(Date value) {
            addCriterion("notice_exp_time =", value, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeNotEqualTo(Date value) {
            addCriterion("notice_exp_time <>", value, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeGreaterThan(Date value) {
            addCriterion("notice_exp_time >", value, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_exp_time >=", value, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeLessThan(Date value) {
            addCriterion("notice_exp_time <", value, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeLessThanOrEqualTo(Date value) {
            addCriterion("notice_exp_time <=", value, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeIn(List<Date> values) {
            addCriterion("notice_exp_time in", values, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeNotIn(List<Date> values) {
            addCriterion("notice_exp_time not in", values, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeBetween(Date value1, Date value2) {
            addCriterion("notice_exp_time between", value1, value2, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeExpTimeNotBetween(Date value1, Date value2) {
            addCriterion("notice_exp_time not between", value1, value2, "noticeExpTime");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqIsNull() {
            addCriterion("notice_seq is null");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqIsNotNull() {
            addCriterion("notice_seq is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqEqualTo(Byte value) {
            addCriterion("notice_seq =", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqNotEqualTo(Byte value) {
            addCriterion("notice_seq <>", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqGreaterThan(Byte value) {
            addCriterion("notice_seq >", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqGreaterThanOrEqualTo(Byte value) {
            addCriterion("notice_seq >=", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqLessThan(Byte value) {
            addCriterion("notice_seq <", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqLessThanOrEqualTo(Byte value) {
            addCriterion("notice_seq <=", value, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqIn(List<Byte> values) {
            addCriterion("notice_seq in", values, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqNotIn(List<Byte> values) {
            addCriterion("notice_seq not in", values, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqBetween(Byte value1, Byte value2) {
            addCriterion("notice_seq between", value1, value2, "noticeSeq");
            return (Criteria) this;
        }

        public Criteria andNoticeSeqNotBetween(Byte value1, Byte value2) {
            addCriterion("notice_seq not between", value1, value2, "noticeSeq");
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