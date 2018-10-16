package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankDepositeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankDepositeExample() {
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

        public Criteria andDepositeIdIsNull() {
            addCriterion("deposite_id is null");
            return (Criteria) this;
        }

        public Criteria andDepositeIdIsNotNull() {
            addCriterion("deposite_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepositeIdEqualTo(Long value) {
            addCriterion("deposite_id =", value, "depositeId");
            return (Criteria) this;
        }

        public Criteria andDepositeIdNotEqualTo(Long value) {
            addCriterion("deposite_id <>", value, "depositeId");
            return (Criteria) this;
        }

        public Criteria andDepositeIdGreaterThan(Long value) {
            addCriterion("deposite_id >", value, "depositeId");
            return (Criteria) this;
        }

        public Criteria andDepositeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deposite_id >=", value, "depositeId");
            return (Criteria) this;
        }

        public Criteria andDepositeIdLessThan(Long value) {
            addCriterion("deposite_id <", value, "depositeId");
            return (Criteria) this;
        }

        public Criteria andDepositeIdLessThanOrEqualTo(Long value) {
            addCriterion("deposite_id <=", value, "depositeId");
            return (Criteria) this;
        }

        public Criteria andDepositeIdIn(List<Long> values) {
            addCriterion("deposite_id in", values, "depositeId");
            return (Criteria) this;
        }

        public Criteria andDepositeIdNotIn(List<Long> values) {
            addCriterion("deposite_id not in", values, "depositeId");
            return (Criteria) this;
        }

        public Criteria andDepositeIdBetween(Long value1, Long value2) {
            addCriterion("deposite_id between", value1, value2, "depositeId");
            return (Criteria) this;
        }

        public Criteria andDepositeIdNotBetween(Long value1, Long value2) {
            addCriterion("deposite_id not between", value1, value2, "depositeId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("cust_id like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("cust_id not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeIsNull() {
            addCriterion("deposite_type is null");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeIsNotNull() {
            addCriterion("deposite_type is not null");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeEqualTo(String value) {
            addCriterion("deposite_type =", value, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeNotEqualTo(String value) {
            addCriterion("deposite_type <>", value, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeGreaterThan(String value) {
            addCriterion("deposite_type >", value, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("deposite_type >=", value, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeLessThan(String value) {
            addCriterion("deposite_type <", value, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeLessThanOrEqualTo(String value) {
            addCriterion("deposite_type <=", value, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeLike(String value) {
            addCriterion("deposite_type like", value, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeNotLike(String value) {
            addCriterion("deposite_type not like", value, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeIn(List<String> values) {
            addCriterion("deposite_type in", values, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeNotIn(List<String> values) {
            addCriterion("deposite_type not in", values, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeBetween(String value1, String value2) {
            addCriterion("deposite_type between", value1, value2, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeTypeNotBetween(String value1, String value2) {
            addCriterion("deposite_type not between", value1, value2, "depositeType");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyIsNull() {
            addCriterion("deposite_money is null");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyIsNotNull() {
            addCriterion("deposite_money is not null");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyEqualTo(Double value) {
            addCriterion("deposite_money =", value, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyNotEqualTo(Double value) {
            addCriterion("deposite_money <>", value, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyGreaterThan(Double value) {
            addCriterion("deposite_money >", value, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("deposite_money >=", value, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyLessThan(Double value) {
            addCriterion("deposite_money <", value, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyLessThanOrEqualTo(Double value) {
            addCriterion("deposite_money <=", value, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyIn(List<Double> values) {
            addCriterion("deposite_money in", values, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyNotIn(List<Double> values) {
            addCriterion("deposite_money not in", values, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyBetween(Double value1, Double value2) {
            addCriterion("deposite_money between", value1, value2, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeMoneyNotBetween(Double value1, Double value2) {
            addCriterion("deposite_money not between", value1, value2, "depositeMoney");
            return (Criteria) this;
        }

        public Criteria andDepositeRateIsNull() {
            addCriterion("deposite_rate is null");
            return (Criteria) this;
        }

        public Criteria andDepositeRateIsNotNull() {
            addCriterion("deposite_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDepositeRateEqualTo(Double value) {
            addCriterion("deposite_rate =", value, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeRateNotEqualTo(Double value) {
            addCriterion("deposite_rate <>", value, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeRateGreaterThan(Double value) {
            addCriterion("deposite_rate >", value, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeRateGreaterThanOrEqualTo(Double value) {
            addCriterion("deposite_rate >=", value, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeRateLessThan(Double value) {
            addCriterion("deposite_rate <", value, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeRateLessThanOrEqualTo(Double value) {
            addCriterion("deposite_rate <=", value, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeRateIn(List<Double> values) {
            addCriterion("deposite_rate in", values, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeRateNotIn(List<Double> values) {
            addCriterion("deposite_rate not in", values, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeRateBetween(Double value1, Double value2) {
            addCriterion("deposite_rate between", value1, value2, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeRateNotBetween(Double value1, Double value2) {
            addCriterion("deposite_rate not between", value1, value2, "depositeRate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateIsNull() {
            addCriterion("deposite_date is null");
            return (Criteria) this;
        }

        public Criteria andDepositeDateIsNotNull() {
            addCriterion("deposite_date is not null");
            return (Criteria) this;
        }

        public Criteria andDepositeDateEqualTo(String value) {
            addCriterion("deposite_date =", value, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateNotEqualTo(String value) {
            addCriterion("deposite_date <>", value, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateGreaterThan(String value) {
            addCriterion("deposite_date >", value, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateGreaterThanOrEqualTo(String value) {
            addCriterion("deposite_date >=", value, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateLessThan(String value) {
            addCriterion("deposite_date <", value, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateLessThanOrEqualTo(String value) {
            addCriterion("deposite_date <=", value, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateLike(String value) {
            addCriterion("deposite_date like", value, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateNotLike(String value) {
            addCriterion("deposite_date not like", value, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateIn(List<String> values) {
            addCriterion("deposite_date in", values, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateNotIn(List<String> values) {
            addCriterion("deposite_date not in", values, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateBetween(String value1, String value2) {
            addCriterion("deposite_date between", value1, value2, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDateNotBetween(String value1, String value2) {
            addCriterion("deposite_date not between", value1, value2, "depositeDate");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationIsNull() {
            addCriterion("deposite_duration is null");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationIsNotNull() {
            addCriterion("deposite_duration is not null");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationEqualTo(String value) {
            addCriterion("deposite_duration =", value, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationNotEqualTo(String value) {
            addCriterion("deposite_duration <>", value, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationGreaterThan(String value) {
            addCriterion("deposite_duration >", value, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationGreaterThanOrEqualTo(String value) {
            addCriterion("deposite_duration >=", value, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationLessThan(String value) {
            addCriterion("deposite_duration <", value, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationLessThanOrEqualTo(String value) {
            addCriterion("deposite_duration <=", value, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationLike(String value) {
            addCriterion("deposite_duration like", value, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationNotLike(String value) {
            addCriterion("deposite_duration not like", value, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationIn(List<String> values) {
            addCriterion("deposite_duration in", values, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationNotIn(List<String> values) {
            addCriterion("deposite_duration not in", values, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationBetween(String value1, String value2) {
            addCriterion("deposite_duration between", value1, value2, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andDepositeDurationNotBetween(String value1, String value2) {
            addCriterion("deposite_duration not between", value1, value2, "depositeDuration");
            return (Criteria) this;
        }

        public Criteria andTransferWayIsNull() {
            addCriterion("transfer_way is null");
            return (Criteria) this;
        }

        public Criteria andTransferWayIsNotNull() {
            addCriterion("transfer_way is not null");
            return (Criteria) this;
        }

        public Criteria andTransferWayEqualTo(String value) {
            addCriterion("transfer_way =", value, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayNotEqualTo(String value) {
            addCriterion("transfer_way <>", value, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayGreaterThan(String value) {
            addCriterion("transfer_way >", value, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_way >=", value, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayLessThan(String value) {
            addCriterion("transfer_way <", value, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayLessThanOrEqualTo(String value) {
            addCriterion("transfer_way <=", value, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayLike(String value) {
            addCriterion("transfer_way like", value, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayNotLike(String value) {
            addCriterion("transfer_way not like", value, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayIn(List<String> values) {
            addCriterion("transfer_way in", values, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayNotIn(List<String> values) {
            addCriterion("transfer_way not in", values, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayBetween(String value1, String value2) {
            addCriterion("transfer_way between", value1, value2, "transferWay");
            return (Criteria) this;
        }

        public Criteria andTransferWayNotBetween(String value1, String value2) {
            addCriterion("transfer_way not between", value1, value2, "transferWay");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIsNull() {
            addCriterion("reviewer_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIsNotNull() {
            addCriterion("reviewer_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdEqualTo(String value) {
            addCriterion("reviewer_id =", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotEqualTo(String value) {
            addCriterion("reviewer_id <>", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThan(String value) {
            addCriterion("reviewer_id >", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer_id >=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThan(String value) {
            addCriterion("reviewer_id <", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThanOrEqualTo(String value) {
            addCriterion("reviewer_id <=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLike(String value) {
            addCriterion("reviewer_id like", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotLike(String value) {
            addCriterion("reviewer_id not like", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIn(List<String> values) {
            addCriterion("reviewer_id in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotIn(List<String> values) {
            addCriterion("reviewer_id not in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdBetween(String value1, String value2) {
            addCriterion("reviewer_id between", value1, value2, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotBetween(String value1, String value2) {
            addCriterion("reviewer_id not between", value1, value2, "reviewerId");
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