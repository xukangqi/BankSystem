package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankDepositeRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankDepositeRateExample() {
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

        public Criteria andLczqOyRateIsNull() {
            addCriterion("lczq_oy_rate is null");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateIsNotNull() {
            addCriterion("lczq_oy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateEqualTo(Double value) {
            addCriterion("lczq_oy_rate =", value, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateNotEqualTo(Double value) {
            addCriterion("lczq_oy_rate <>", value, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateGreaterThan(Double value) {
            addCriterion("lczq_oy_rate >", value, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("lczq_oy_rate >=", value, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateLessThan(Double value) {
            addCriterion("lczq_oy_rate <", value, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateLessThanOrEqualTo(Double value) {
            addCriterion("lczq_oy_rate <=", value, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateIn(List<Double> values) {
            addCriterion("lczq_oy_rate in", values, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateNotIn(List<Double> values) {
            addCriterion("lczq_oy_rate not in", values, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateBetween(Double value1, Double value2) {
            addCriterion("lczq_oy_rate between", value1, value2, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqOyRateNotBetween(Double value1, Double value2) {
            addCriterion("lczq_oy_rate not between", value1, value2, "lczqOyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateIsNull() {
            addCriterion("lczq_ty_rate is null");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateIsNotNull() {
            addCriterion("lczq_ty_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateEqualTo(Double value) {
            addCriterion("lczq_ty_rate =", value, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateNotEqualTo(Double value) {
            addCriterion("lczq_ty_rate <>", value, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateGreaterThan(Double value) {
            addCriterion("lczq_ty_rate >", value, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("lczq_ty_rate >=", value, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateLessThan(Double value) {
            addCriterion("lczq_ty_rate <", value, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateLessThanOrEqualTo(Double value) {
            addCriterion("lczq_ty_rate <=", value, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateIn(List<Double> values) {
            addCriterion("lczq_ty_rate in", values, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateNotIn(List<Double> values) {
            addCriterion("lczq_ty_rate not in", values, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateBetween(Double value1, Double value2) {
            addCriterion("lczq_ty_rate between", value1, value2, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqTyRateNotBetween(Double value1, Double value2) {
            addCriterion("lczq_ty_rate not between", value1, value2, "lczqTyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateIsNull() {
            addCriterion("lczq_fy_rate is null");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateIsNotNull() {
            addCriterion("lczq_fy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateEqualTo(Double value) {
            addCriterion("lczq_fy_rate =", value, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateNotEqualTo(Double value) {
            addCriterion("lczq_fy_rate <>", value, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateGreaterThan(Double value) {
            addCriterion("lczq_fy_rate >", value, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("lczq_fy_rate >=", value, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateLessThan(Double value) {
            addCriterion("lczq_fy_rate <", value, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateLessThanOrEqualTo(Double value) {
            addCriterion("lczq_fy_rate <=", value, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateIn(List<Double> values) {
            addCriterion("lczq_fy_rate in", values, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateNotIn(List<Double> values) {
            addCriterion("lczq_fy_rate not in", values, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateBetween(Double value1, Double value2) {
            addCriterion("lczq_fy_rate between", value1, value2, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andLczqFyRateNotBetween(Double value1, Double value2) {
            addCriterion("lczq_fy_rate not between", value1, value2, "lczqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateIsNull() {
            addCriterion("zclq_oy_rate is null");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateIsNotNull() {
            addCriterion("zclq_oy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateEqualTo(Double value) {
            addCriterion("zclq_oy_rate =", value, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateNotEqualTo(Double value) {
            addCriterion("zclq_oy_rate <>", value, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateGreaterThan(Double value) {
            addCriterion("zclq_oy_rate >", value, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("zclq_oy_rate >=", value, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateLessThan(Double value) {
            addCriterion("zclq_oy_rate <", value, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateLessThanOrEqualTo(Double value) {
            addCriterion("zclq_oy_rate <=", value, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateIn(List<Double> values) {
            addCriterion("zclq_oy_rate in", values, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateNotIn(List<Double> values) {
            addCriterion("zclq_oy_rate not in", values, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateBetween(Double value1, Double value2) {
            addCriterion("zclq_oy_rate between", value1, value2, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqOyRateNotBetween(Double value1, Double value2) {
            addCriterion("zclq_oy_rate not between", value1, value2, "zclqOyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateIsNull() {
            addCriterion("zclq_ty_rate is null");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateIsNotNull() {
            addCriterion("zclq_ty_rate is not null");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateEqualTo(Double value) {
            addCriterion("zclq_ty_rate =", value, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateNotEqualTo(Double value) {
            addCriterion("zclq_ty_rate <>", value, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateGreaterThan(Double value) {
            addCriterion("zclq_ty_rate >", value, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("zclq_ty_rate >=", value, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateLessThan(Double value) {
            addCriterion("zclq_ty_rate <", value, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateLessThanOrEqualTo(Double value) {
            addCriterion("zclq_ty_rate <=", value, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateIn(List<Double> values) {
            addCriterion("zclq_ty_rate in", values, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateNotIn(List<Double> values) {
            addCriterion("zclq_ty_rate not in", values, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateBetween(Double value1, Double value2) {
            addCriterion("zclq_ty_rate between", value1, value2, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqTyRateNotBetween(Double value1, Double value2) {
            addCriterion("zclq_ty_rate not between", value1, value2, "zclqTyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateIsNull() {
            addCriterion("zclq_fy_rate is null");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateIsNotNull() {
            addCriterion("zclq_fy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateEqualTo(Double value) {
            addCriterion("zclq_fy_rate =", value, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateNotEqualTo(Double value) {
            addCriterion("zclq_fy_rate <>", value, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateGreaterThan(Double value) {
            addCriterion("zclq_fy_rate >", value, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("zclq_fy_rate >=", value, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateLessThan(Double value) {
            addCriterion("zclq_fy_rate <", value, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateLessThanOrEqualTo(Double value) {
            addCriterion("zclq_fy_rate <=", value, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateIn(List<Double> values) {
            addCriterion("zclq_fy_rate in", values, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateNotIn(List<Double> values) {
            addCriterion("zclq_fy_rate not in", values, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateBetween(Double value1, Double value2) {
            addCriterion("zclq_fy_rate between", value1, value2, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andZclqFyRateNotBetween(Double value1, Double value2) {
            addCriterion("zclq_fy_rate not between", value1, value2, "zclqFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateIsNull() {
            addCriterion("cbqx_oy_rate is null");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateIsNotNull() {
            addCriterion("cbqx_oy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateEqualTo(Double value) {
            addCriterion("cbqx_oy_rate =", value, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateNotEqualTo(Double value) {
            addCriterion("cbqx_oy_rate <>", value, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateGreaterThan(Double value) {
            addCriterion("cbqx_oy_rate >", value, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("cbqx_oy_rate >=", value, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateLessThan(Double value) {
            addCriterion("cbqx_oy_rate <", value, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateLessThanOrEqualTo(Double value) {
            addCriterion("cbqx_oy_rate <=", value, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateIn(List<Double> values) {
            addCriterion("cbqx_oy_rate in", values, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateNotIn(List<Double> values) {
            addCriterion("cbqx_oy_rate not in", values, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateBetween(Double value1, Double value2) {
            addCriterion("cbqx_oy_rate between", value1, value2, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxOyRateNotBetween(Double value1, Double value2) {
            addCriterion("cbqx_oy_rate not between", value1, value2, "cbqxOyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateIsNull() {
            addCriterion("cbqx_ty_rate is null");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateIsNotNull() {
            addCriterion("cbqx_ty_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateEqualTo(Double value) {
            addCriterion("cbqx_ty_rate =", value, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateNotEqualTo(Double value) {
            addCriterion("cbqx_ty_rate <>", value, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateGreaterThan(Double value) {
            addCriterion("cbqx_ty_rate >", value, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("cbqx_ty_rate >=", value, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateLessThan(Double value) {
            addCriterion("cbqx_ty_rate <", value, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateLessThanOrEqualTo(Double value) {
            addCriterion("cbqx_ty_rate <=", value, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateIn(List<Double> values) {
            addCriterion("cbqx_ty_rate in", values, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateNotIn(List<Double> values) {
            addCriterion("cbqx_ty_rate not in", values, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateBetween(Double value1, Double value2) {
            addCriterion("cbqx_ty_rate between", value1, value2, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxTyRateNotBetween(Double value1, Double value2) {
            addCriterion("cbqx_ty_rate not between", value1, value2, "cbqxTyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateIsNull() {
            addCriterion("cbqx_fy_rate is null");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateIsNotNull() {
            addCriterion("cbqx_fy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateEqualTo(Double value) {
            addCriterion("cbqx_fy_rate =", value, "cbqxFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateNotEqualTo(Double value) {
            addCriterion("cbqx_fy_rate <>", value, "cbqxFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateGreaterThan(Double value) {
            addCriterion("cbqx_fy_rate >", value, "cbqxFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("cbqx_fy_rate >=", value, "cbqxFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateLessThan(Double value) {
            addCriterion("cbqx_fy_rate <", value, "cbqxFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateLessThanOrEqualTo(Double value) {
            addCriterion("cbqx_fy_rate <=", value, "cbqxFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateIn(List<Double> values) {
            addCriterion("cbqx_fy_rate in", values, "cbqxFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateNotIn(List<Double> values) {
            addCriterion("cbqx_fy_rate not in", values, "cbqxFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateBetween(Double value1, Double value2) {
            addCriterion("cbqx_fy_rate between", value1, value2, "cbqxFyRate");
            return (Criteria) this;
        }

        public Criteria andCbqxFyRateNotBetween(Double value1, Double value2) {
            addCriterion("cbqx_fy_rate not between", value1, value2, "cbqxFyRate");
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