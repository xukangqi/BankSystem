package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankLoanPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankLoanPaymentExample() {
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

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Long value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Long value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Long value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Long value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Long value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Long> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Long> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Long value1, Long value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Long value1, Long value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNull() {
            addCriterion("trans_id is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(Long value) {
            addCriterion("trans_id =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(Long value) {
            addCriterion("trans_id <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(Long value) {
            addCriterion("trans_id >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trans_id >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(Long value) {
            addCriterion("trans_id <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(Long value) {
            addCriterion("trans_id <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<Long> values) {
            addCriterion("trans_id in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<Long> values) {
            addCriterion("trans_id not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(Long value1, Long value2) {
            addCriterion("trans_id between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(Long value1, Long value2) {
            addCriterion("trans_id not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andInsNumIsNull() {
            addCriterion("ins_num is null");
            return (Criteria) this;
        }

        public Criteria andInsNumIsNotNull() {
            addCriterion("ins_num is not null");
            return (Criteria) this;
        }

        public Criteria andInsNumEqualTo(Short value) {
            addCriterion("ins_num =", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumNotEqualTo(Short value) {
            addCriterion("ins_num <>", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumGreaterThan(Short value) {
            addCriterion("ins_num >", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumGreaterThanOrEqualTo(Short value) {
            addCriterion("ins_num >=", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumLessThan(Short value) {
            addCriterion("ins_num <", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumLessThanOrEqualTo(Short value) {
            addCriterion("ins_num <=", value, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumIn(List<Short> values) {
            addCriterion("ins_num in", values, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumNotIn(List<Short> values) {
            addCriterion("ins_num not in", values, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumBetween(Short value1, Short value2) {
            addCriterion("ins_num between", value1, value2, "insNum");
            return (Criteria) this;
        }

        public Criteria andInsNumNotBetween(Short value1, Short value2) {
            addCriterion("ins_num not between", value1, value2, "insNum");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(Double value) {
            addCriterion("payment_amount =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(Double value) {
            addCriterion("payment_amount <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(Double value) {
            addCriterion("payment_amount >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("payment_amount >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(Double value) {
            addCriterion("payment_amount <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(Double value) {
            addCriterion("payment_amount <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<Double> values) {
            addCriterion("payment_amount in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<Double> values) {
            addCriterion("payment_amount not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(Double value1, Double value2) {
            addCriterion("payment_amount between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(Double value1, Double value2) {
            addCriterion("payment_amount not between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNull() {
            addCriterion("payment_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(String value) {
            addCriterion("payment_date =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(String value) {
            addCriterion("payment_date <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(String value) {
            addCriterion("payment_date >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(String value) {
            addCriterion("payment_date >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(String value) {
            addCriterion("payment_date <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(String value) {
            addCriterion("payment_date <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLike(String value) {
            addCriterion("payment_date like", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotLike(String value) {
            addCriterion("payment_date not like", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<String> values) {
            addCriterion("payment_date in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<String> values) {
            addCriterion("payment_date not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(String value1, String value2) {
            addCriterion("payment_date between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(String value1, String value2) {
            addCriterion("payment_date not between", value1, value2, "paymentDate");
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