package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankDepositRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankDepositRateExample() {
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

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(String value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(String value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(String value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(String value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLike(String value) {
            addCriterion("update_date like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotLike(String value) {
            addCriterion("update_date not like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<String> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<String> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(String value1, String value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(String value1, String value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateIsNull() {
            addCriterion("current_rate is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRateIsNotNull() {
            addCriterion("current_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRateEqualTo(Double value) {
            addCriterion("current_rate =", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateNotEqualTo(Double value) {
            addCriterion("current_rate <>", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateGreaterThan(Double value) {
            addCriterion("current_rate >", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateGreaterThanOrEqualTo(Double value) {
            addCriterion("current_rate >=", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateLessThan(Double value) {
            addCriterion("current_rate <", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateLessThanOrEqualTo(Double value) {
            addCriterion("current_rate <=", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateIn(List<Double> values) {
            addCriterion("current_rate in", values, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateNotIn(List<Double> values) {
            addCriterion("current_rate not in", values, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateBetween(Double value1, Double value2) {
            addCriterion("current_rate between", value1, value2, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateNotBetween(Double value1, Double value2) {
            addCriterion("current_rate not between", value1, value2, "currentRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateIsNull() {
            addCriterion("zczq_tm_rate is null");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateIsNotNull() {
            addCriterion("zczq_tm_rate is not null");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateEqualTo(Double value) {
            addCriterion("zczq_tm_rate =", value, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateNotEqualTo(Double value) {
            addCriterion("zczq_tm_rate <>", value, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateGreaterThan(Double value) {
            addCriterion("zczq_tm_rate >", value, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateGreaterThanOrEqualTo(Double value) {
            addCriterion("zczq_tm_rate >=", value, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateLessThan(Double value) {
            addCriterion("zczq_tm_rate <", value, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateLessThanOrEqualTo(Double value) {
            addCriterion("zczq_tm_rate <=", value, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateIn(List<Double> values) {
            addCriterion("zczq_tm_rate in", values, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateNotIn(List<Double> values) {
            addCriterion("zczq_tm_rate not in", values, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateBetween(Double value1, Double value2) {
            addCriterion("zczq_tm_rate between", value1, value2, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqTmRateNotBetween(Double value1, Double value2) {
            addCriterion("zczq_tm_rate not between", value1, value2, "zczqTmRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateIsNull() {
            addCriterion("zczq_hy_rate is null");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateIsNotNull() {
            addCriterion("zczq_hy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateEqualTo(Double value) {
            addCriterion("zczq_hy_rate =", value, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateNotEqualTo(Double value) {
            addCriterion("zczq_hy_rate <>", value, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateGreaterThan(Double value) {
            addCriterion("zczq_hy_rate >", value, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("zczq_hy_rate >=", value, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateLessThan(Double value) {
            addCriterion("zczq_hy_rate <", value, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateLessThanOrEqualTo(Double value) {
            addCriterion("zczq_hy_rate <=", value, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateIn(List<Double> values) {
            addCriterion("zczq_hy_rate in", values, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateNotIn(List<Double> values) {
            addCriterion("zczq_hy_rate not in", values, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateBetween(Double value1, Double value2) {
            addCriterion("zczq_hy_rate between", value1, value2, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqHyRateNotBetween(Double value1, Double value2) {
            addCriterion("zczq_hy_rate not between", value1, value2, "zczqHyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateIsNull() {
            addCriterion("zczq_oy_rate is null");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateIsNotNull() {
            addCriterion("zczq_oy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateEqualTo(Double value) {
            addCriterion("zczq_oy_rate =", value, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateNotEqualTo(Double value) {
            addCriterion("zczq_oy_rate <>", value, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateGreaterThan(Double value) {
            addCriterion("zczq_oy_rate >", value, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("zczq_oy_rate >=", value, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateLessThan(Double value) {
            addCriterion("zczq_oy_rate <", value, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateLessThanOrEqualTo(Double value) {
            addCriterion("zczq_oy_rate <=", value, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateIn(List<Double> values) {
            addCriterion("zczq_oy_rate in", values, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateNotIn(List<Double> values) {
            addCriterion("zczq_oy_rate not in", values, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateBetween(Double value1, Double value2) {
            addCriterion("zczq_oy_rate between", value1, value2, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqOyRateNotBetween(Double value1, Double value2) {
            addCriterion("zczq_oy_rate not between", value1, value2, "zczqOyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateIsNull() {
            addCriterion("zczq_twy_rate is null");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateIsNotNull() {
            addCriterion("zczq_twy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateEqualTo(Double value) {
            addCriterion("zczq_twy_rate =", value, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateNotEqualTo(Double value) {
            addCriterion("zczq_twy_rate <>", value, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateGreaterThan(Double value) {
            addCriterion("zczq_twy_rate >", value, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("zczq_twy_rate >=", value, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateLessThan(Double value) {
            addCriterion("zczq_twy_rate <", value, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateLessThanOrEqualTo(Double value) {
            addCriterion("zczq_twy_rate <=", value, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateIn(List<Double> values) {
            addCriterion("zczq_twy_rate in", values, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateNotIn(List<Double> values) {
            addCriterion("zczq_twy_rate not in", values, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateBetween(Double value1, Double value2) {
            addCriterion("zczq_twy_rate between", value1, value2, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTwyRateNotBetween(Double value1, Double value2) {
            addCriterion("zczq_twy_rate not between", value1, value2, "zczqTwyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateIsNull() {
            addCriterion("zczq_ty_rate is null");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateIsNotNull() {
            addCriterion("zczq_ty_rate is not null");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateEqualTo(Double value) {
            addCriterion("zczq_ty_rate =", value, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateNotEqualTo(Double value) {
            addCriterion("zczq_ty_rate <>", value, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateGreaterThan(Double value) {
            addCriterion("zczq_ty_rate >", value, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("zczq_ty_rate >=", value, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateLessThan(Double value) {
            addCriterion("zczq_ty_rate <", value, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateLessThanOrEqualTo(Double value) {
            addCriterion("zczq_ty_rate <=", value, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateIn(List<Double> values) {
            addCriterion("zczq_ty_rate in", values, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateNotIn(List<Double> values) {
            addCriterion("zczq_ty_rate not in", values, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateBetween(Double value1, Double value2) {
            addCriterion("zczq_ty_rate between", value1, value2, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqTyRateNotBetween(Double value1, Double value2) {
            addCriterion("zczq_ty_rate not between", value1, value2, "zczqTyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateIsNull() {
            addCriterion("zczq_fy_rate is null");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateIsNotNull() {
            addCriterion("zczq_fy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateEqualTo(Double value) {
            addCriterion("zczq_fy_rate =", value, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateNotEqualTo(Double value) {
            addCriterion("zczq_fy_rate <>", value, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateGreaterThan(Double value) {
            addCriterion("zczq_fy_rate >", value, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("zczq_fy_rate >=", value, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateLessThan(Double value) {
            addCriterion("zczq_fy_rate <", value, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateLessThanOrEqualTo(Double value) {
            addCriterion("zczq_fy_rate <=", value, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateIn(List<Double> values) {
            addCriterion("zczq_fy_rate in", values, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateNotIn(List<Double> values) {
            addCriterion("zczq_fy_rate not in", values, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateBetween(Double value1, Double value2) {
            addCriterion("zczq_fy_rate between", value1, value2, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZczqFyRateNotBetween(Double value1, Double value2) {
            addCriterion("zczq_fy_rate not between", value1, value2, "zczqFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateIsNull() {
            addCriterion("other_oy_rate is null");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateIsNotNull() {
            addCriterion("other_oy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateEqualTo(Double value) {
            addCriterion("other_oy_rate =", value, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateNotEqualTo(Double value) {
            addCriterion("other_oy_rate <>", value, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateGreaterThan(Double value) {
            addCriterion("other_oy_rate >", value, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("other_oy_rate >=", value, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateLessThan(Double value) {
            addCriterion("other_oy_rate <", value, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateLessThanOrEqualTo(Double value) {
            addCriterion("other_oy_rate <=", value, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateIn(List<Double> values) {
            addCriterion("other_oy_rate in", values, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateNotIn(List<Double> values) {
            addCriterion("other_oy_rate not in", values, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateBetween(Double value1, Double value2) {
            addCriterion("other_oy_rate between", value1, value2, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherOyRateNotBetween(Double value1, Double value2) {
            addCriterion("other_oy_rate not between", value1, value2, "otherOyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateIsNull() {
            addCriterion("other_ty_rate is null");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateIsNotNull() {
            addCriterion("other_ty_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateEqualTo(Double value) {
            addCriterion("other_ty_rate =", value, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateNotEqualTo(Double value) {
            addCriterion("other_ty_rate <>", value, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateGreaterThan(Double value) {
            addCriterion("other_ty_rate >", value, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("other_ty_rate >=", value, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateLessThan(Double value) {
            addCriterion("other_ty_rate <", value, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateLessThanOrEqualTo(Double value) {
            addCriterion("other_ty_rate <=", value, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateIn(List<Double> values) {
            addCriterion("other_ty_rate in", values, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateNotIn(List<Double> values) {
            addCriterion("other_ty_rate not in", values, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateBetween(Double value1, Double value2) {
            addCriterion("other_ty_rate between", value1, value2, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherTyRateNotBetween(Double value1, Double value2) {
            addCriterion("other_ty_rate not between", value1, value2, "otherTyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateIsNull() {
            addCriterion("other_fy_rate is null");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateIsNotNull() {
            addCriterion("other_fy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateEqualTo(Double value) {
            addCriterion("other_fy_rate =", value, "otherFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateNotEqualTo(Double value) {
            addCriterion("other_fy_rate <>", value, "otherFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateGreaterThan(Double value) {
            addCriterion("other_fy_rate >", value, "otherFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("other_fy_rate >=", value, "otherFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateLessThan(Double value) {
            addCriterion("other_fy_rate <", value, "otherFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateLessThanOrEqualTo(Double value) {
            addCriterion("other_fy_rate <=", value, "otherFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateIn(List<Double> values) {
            addCriterion("other_fy_rate in", values, "otherFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateNotIn(List<Double> values) {
            addCriterion("other_fy_rate not in", values, "otherFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateBetween(Double value1, Double value2) {
            addCriterion("other_fy_rate between", value1, value2, "otherFyRate");
            return (Criteria) this;
        }

        public Criteria andOtherFyRateNotBetween(Double value1, Double value2) {
            addCriterion("other_fy_rate not between", value1, value2, "otherFyRate");
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