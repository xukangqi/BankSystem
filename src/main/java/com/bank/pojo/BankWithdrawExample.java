package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankWithdrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankWithdrawExample() {
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

        public Criteria andWithdrawIdIsNull() {
            addCriterion("withdraw_id is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIsNotNull() {
            addCriterion("withdraw_id is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdEqualTo(String value) {
            addCriterion("withdraw_id =", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotEqualTo(String value) {
            addCriterion("withdraw_id <>", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThan(String value) {
            addCriterion("withdraw_id >", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_id >=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThan(String value) {
            addCriterion("withdraw_id <", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThanOrEqualTo(String value) {
            addCriterion("withdraw_id <=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLike(String value) {
            addCriterion("withdraw_id like", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotLike(String value) {
            addCriterion("withdraw_id not like", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIn(List<String> values) {
            addCriterion("withdraw_id in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotIn(List<String> values) {
            addCriterion("withdraw_id not in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdBetween(String value1, String value2) {
            addCriterion("withdraw_id between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotBetween(String value1, String value2) {
            addCriterion("withdraw_id not between", value1, value2, "withdrawId");
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

        public Criteria andWithdrawMoneyIsNull() {
            addCriterion("withdraw_money is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIsNotNull() {
            addCriterion("withdraw_money is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyEqualTo(Double value) {
            addCriterion("withdraw_money =", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotEqualTo(Double value) {
            addCriterion("withdraw_money <>", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyGreaterThan(Double value) {
            addCriterion("withdraw_money >", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("withdraw_money >=", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyLessThan(Double value) {
            addCriterion("withdraw_money <", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyLessThanOrEqualTo(Double value) {
            addCriterion("withdraw_money <=", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIn(List<Double> values) {
            addCriterion("withdraw_money in", values, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotIn(List<Double> values) {
            addCriterion("withdraw_money not in", values, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyBetween(Double value1, Double value2) {
            addCriterion("withdraw_money between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotBetween(Double value1, Double value2) {
            addCriterion("withdraw_money not between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateIsNull() {
            addCriterion("withdraw_date is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateIsNotNull() {
            addCriterion("withdraw_date is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateEqualTo(String value) {
            addCriterion("withdraw_date =", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateNotEqualTo(String value) {
            addCriterion("withdraw_date <>", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateGreaterThan(String value) {
            addCriterion("withdraw_date >", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_date >=", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateLessThan(String value) {
            addCriterion("withdraw_date <", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateLessThanOrEqualTo(String value) {
            addCriterion("withdraw_date <=", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateLike(String value) {
            addCriterion("withdraw_date like", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateNotLike(String value) {
            addCriterion("withdraw_date not like", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateIn(List<String> values) {
            addCriterion("withdraw_date in", values, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateNotIn(List<String> values) {
            addCriterion("withdraw_date not in", values, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateBetween(String value1, String value2) {
            addCriterion("withdraw_date between", value1, value2, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateNotBetween(String value1, String value2) {
            addCriterion("withdraw_date not between", value1, value2, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(String value) {
            addCriterion("arrive_time =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(String value) {
            addCriterion("arrive_time <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(String value) {
            addCriterion("arrive_time >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_time >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(String value) {
            addCriterion("arrive_time <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(String value) {
            addCriterion("arrive_time <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLike(String value) {
            addCriterion("arrive_time like", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotLike(String value) {
            addCriterion("arrive_time not like", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<String> values) {
            addCriterion("arrive_time in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<String> values) {
            addCriterion("arrive_time not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(String value1, String value2) {
            addCriterion("arrive_time between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(String value1, String value2) {
            addCriterion("arrive_time not between", value1, value2, "arriveTime");
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