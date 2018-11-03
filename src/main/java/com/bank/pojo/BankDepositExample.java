package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankDepositExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankDepositExample() {
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

        public Criteria andDepositIdIsNull() {
            addCriterion("deposit_id is null");
            return (Criteria) this;
        }

        public Criteria andDepositIdIsNotNull() {
            addCriterion("deposit_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepositIdEqualTo(String value) {
            addCriterion("deposit_id =", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotEqualTo(String value) {
            addCriterion("deposit_id <>", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdGreaterThan(String value) {
            addCriterion("deposit_id >", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_id >=", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLessThan(String value) {
            addCriterion("deposit_id <", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLessThanOrEqualTo(String value) {
            addCriterion("deposit_id <=", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLike(String value) {
            addCriterion("deposit_id like", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotLike(String value) {
            addCriterion("deposit_id not like", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdIn(List<String> values) {
            addCriterion("deposit_id in", values, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotIn(List<String> values) {
            addCriterion("deposit_id not in", values, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdBetween(String value1, String value2) {
            addCriterion("deposit_id between", value1, value2, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotBetween(String value1, String value2) {
            addCriterion("deposit_id not between", value1, value2, "depositId");
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

        public Criteria andDepositTypeIsNull() {
            addCriterion("deposit_type is null");
            return (Criteria) this;
        }

        public Criteria andDepositTypeIsNotNull() {
            addCriterion("deposit_type is not null");
            return (Criteria) this;
        }

        public Criteria andDepositTypeEqualTo(String value) {
            addCriterion("deposit_type =", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeNotEqualTo(String value) {
            addCriterion("deposit_type <>", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeGreaterThan(String value) {
            addCriterion("deposit_type >", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_type >=", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeLessThan(String value) {
            addCriterion("deposit_type <", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeLessThanOrEqualTo(String value) {
            addCriterion("deposit_type <=", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeLike(String value) {
            addCriterion("deposit_type like", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeNotLike(String value) {
            addCriterion("deposit_type not like", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeIn(List<String> values) {
            addCriterion("deposit_type in", values, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeNotIn(List<String> values) {
            addCriterion("deposit_type not in", values, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeBetween(String value1, String value2) {
            addCriterion("deposit_type between", value1, value2, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeNotBetween(String value1, String value2) {
            addCriterion("deposit_type not between", value1, value2, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIsNull() {
            addCriterion("deposit_money is null");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIsNotNull() {
            addCriterion("deposit_money is not null");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyEqualTo(Double value) {
            addCriterion("deposit_money =", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotEqualTo(Double value) {
            addCriterion("deposit_money <>", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyGreaterThan(Double value) {
            addCriterion("deposit_money >", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit_money >=", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyLessThan(Double value) {
            addCriterion("deposit_money <", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyLessThanOrEqualTo(Double value) {
            addCriterion("deposit_money <=", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIn(List<Double> values) {
            addCriterion("deposit_money in", values, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotIn(List<Double> values) {
            addCriterion("deposit_money not in", values, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyBetween(Double value1, Double value2) {
            addCriterion("deposit_money between", value1, value2, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotBetween(Double value1, Double value2) {
            addCriterion("deposit_money not between", value1, value2, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositRateIsNull() {
            addCriterion("deposit_rate is null");
            return (Criteria) this;
        }

        public Criteria andDepositRateIsNotNull() {
            addCriterion("deposit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDepositRateEqualTo(Double value) {
            addCriterion("deposit_rate =", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateNotEqualTo(Double value) {
            addCriterion("deposit_rate <>", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateGreaterThan(Double value) {
            addCriterion("deposit_rate >", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit_rate >=", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateLessThan(Double value) {
            addCriterion("deposit_rate <", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateLessThanOrEqualTo(Double value) {
            addCriterion("deposit_rate <=", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateIn(List<Double> values) {
            addCriterion("deposit_rate in", values, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateNotIn(List<Double> values) {
            addCriterion("deposit_rate not in", values, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateBetween(Double value1, Double value2) {
            addCriterion("deposit_rate between", value1, value2, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateNotBetween(Double value1, Double value2) {
            addCriterion("deposit_rate not between", value1, value2, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositDateIsNull() {
            addCriterion("deposit_date is null");
            return (Criteria) this;
        }

        public Criteria andDepositDateIsNotNull() {
            addCriterion("deposit_date is not null");
            return (Criteria) this;
        }

        public Criteria andDepositDateEqualTo(String value) {
            addCriterion("deposit_date =", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotEqualTo(String value) {
            addCriterion("deposit_date <>", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateGreaterThan(String value) {
            addCriterion("deposit_date >", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_date >=", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateLessThan(String value) {
            addCriterion("deposit_date <", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateLessThanOrEqualTo(String value) {
            addCriterion("deposit_date <=", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateLike(String value) {
            addCriterion("deposit_date like", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotLike(String value) {
            addCriterion("deposit_date not like", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateIn(List<String> values) {
            addCriterion("deposit_date in", values, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotIn(List<String> values) {
            addCriterion("deposit_date not in", values, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateBetween(String value1, String value2) {
            addCriterion("deposit_date between", value1, value2, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotBetween(String value1, String value2) {
            addCriterion("deposit_date not between", value1, value2, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDurationIsNull() {
            addCriterion("deposit_duration is null");
            return (Criteria) this;
        }

        public Criteria andDepositDurationIsNotNull() {
            addCriterion("deposit_duration is not null");
            return (Criteria) this;
        }

        public Criteria andDepositDurationEqualTo(String value) {
            addCriterion("deposit_duration =", value, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationNotEqualTo(String value) {
            addCriterion("deposit_duration <>", value, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationGreaterThan(String value) {
            addCriterion("deposit_duration >", value, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_duration >=", value, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationLessThan(String value) {
            addCriterion("deposit_duration <", value, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationLessThanOrEqualTo(String value) {
            addCriterion("deposit_duration <=", value, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationLike(String value) {
            addCriterion("deposit_duration like", value, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationNotLike(String value) {
            addCriterion("deposit_duration not like", value, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationIn(List<String> values) {
            addCriterion("deposit_duration in", values, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationNotIn(List<String> values) {
            addCriterion("deposit_duration not in", values, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationBetween(String value1, String value2) {
            addCriterion("deposit_duration between", value1, value2, "depositDuration");
            return (Criteria) this;
        }

        public Criteria andDepositDurationNotBetween(String value1, String value2) {
            addCriterion("deposit_duration not between", value1, value2, "depositDuration");
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

        public Criteria andDepositFlagIsNull() {
            addCriterion("deposit_flag is null");
            return (Criteria) this;
        }

        public Criteria andDepositFlagIsNotNull() {
            addCriterion("deposit_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDepositFlagEqualTo(String value) {
            addCriterion("deposit_flag =", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagNotEqualTo(String value) {
            addCriterion("deposit_flag <>", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagGreaterThan(String value) {
            addCriterion("deposit_flag >", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_flag >=", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagLessThan(String value) {
            addCriterion("deposit_flag <", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagLessThanOrEqualTo(String value) {
            addCriterion("deposit_flag <=", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagLike(String value) {
            addCriterion("deposit_flag like", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagNotLike(String value) {
            addCriterion("deposit_flag not like", value, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagIn(List<String> values) {
            addCriterion("deposit_flag in", values, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagNotIn(List<String> values) {
            addCriterion("deposit_flag not in", values, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagBetween(String value1, String value2) {
            addCriterion("deposit_flag between", value1, value2, "depositFlag");
            return (Criteria) this;
        }

        public Criteria andDepositFlagNotBetween(String value1, String value2) {
            addCriterion("deposit_flag not between", value1, value2, "depositFlag");
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