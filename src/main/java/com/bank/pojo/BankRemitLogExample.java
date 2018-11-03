package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankRemitLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankRemitLogExample() {
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

        public Criteria andRemitIdIsNull() {
            addCriterion("remit_id is null");
            return (Criteria) this;
        }

        public Criteria andRemitIdIsNotNull() {
            addCriterion("remit_id is not null");
            return (Criteria) this;
        }

        public Criteria andRemitIdEqualTo(String value) {
            addCriterion("remit_id =", value, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdNotEqualTo(String value) {
            addCriterion("remit_id <>", value, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdGreaterThan(String value) {
            addCriterion("remit_id >", value, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdGreaterThanOrEqualTo(String value) {
            addCriterion("remit_id >=", value, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdLessThan(String value) {
            addCriterion("remit_id <", value, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdLessThanOrEqualTo(String value) {
            addCriterion("remit_id <=", value, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdLike(String value) {
            addCriterion("remit_id like", value, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdNotLike(String value) {
            addCriterion("remit_id not like", value, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdIn(List<String> values) {
            addCriterion("remit_id in", values, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdNotIn(List<String> values) {
            addCriterion("remit_id not in", values, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdBetween(String value1, String value2) {
            addCriterion("remit_id between", value1, value2, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitIdNotBetween(String value1, String value2) {
            addCriterion("remit_id not between", value1, value2, "remitId");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountIsNull() {
            addCriterion("remit_out_account is null");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountIsNotNull() {
            addCriterion("remit_out_account is not null");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountEqualTo(String value) {
            addCriterion("remit_out_account =", value, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountNotEqualTo(String value) {
            addCriterion("remit_out_account <>", value, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountGreaterThan(String value) {
            addCriterion("remit_out_account >", value, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountGreaterThanOrEqualTo(String value) {
            addCriterion("remit_out_account >=", value, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountLessThan(String value) {
            addCriterion("remit_out_account <", value, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountLessThanOrEqualTo(String value) {
            addCriterion("remit_out_account <=", value, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountLike(String value) {
            addCriterion("remit_out_account like", value, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountNotLike(String value) {
            addCriterion("remit_out_account not like", value, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountIn(List<String> values) {
            addCriterion("remit_out_account in", values, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountNotIn(List<String> values) {
            addCriterion("remit_out_account not in", values, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountBetween(String value1, String value2) {
            addCriterion("remit_out_account between", value1, value2, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitOutAccountNotBetween(String value1, String value2) {
            addCriterion("remit_out_account not between", value1, value2, "remitOutAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountIsNull() {
            addCriterion("remit_in_account is null");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountIsNotNull() {
            addCriterion("remit_in_account is not null");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountEqualTo(String value) {
            addCriterion("remit_in_account =", value, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountNotEqualTo(String value) {
            addCriterion("remit_in_account <>", value, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountGreaterThan(String value) {
            addCriterion("remit_in_account >", value, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountGreaterThanOrEqualTo(String value) {
            addCriterion("remit_in_account >=", value, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountLessThan(String value) {
            addCriterion("remit_in_account <", value, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountLessThanOrEqualTo(String value) {
            addCriterion("remit_in_account <=", value, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountLike(String value) {
            addCriterion("remit_in_account like", value, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountNotLike(String value) {
            addCriterion("remit_in_account not like", value, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountIn(List<String> values) {
            addCriterion("remit_in_account in", values, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountNotIn(List<String> values) {
            addCriterion("remit_in_account not in", values, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountBetween(String value1, String value2) {
            addCriterion("remit_in_account between", value1, value2, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andRemitInAccountNotBetween(String value1, String value2) {
            addCriterion("remit_in_account not between", value1, value2, "remitInAccount");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateIsNull() {
            addCriterion("remit_generate_date is null");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateIsNotNull() {
            addCriterion("remit_generate_date is not null");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateEqualTo(String value) {
            addCriterion("remit_generate_date =", value, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateNotEqualTo(String value) {
            addCriterion("remit_generate_date <>", value, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateGreaterThan(String value) {
            addCriterion("remit_generate_date >", value, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateGreaterThanOrEqualTo(String value) {
            addCriterion("remit_generate_date >=", value, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateLessThan(String value) {
            addCriterion("remit_generate_date <", value, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateLessThanOrEqualTo(String value) {
            addCriterion("remit_generate_date <=", value, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateLike(String value) {
            addCriterion("remit_generate_date like", value, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateNotLike(String value) {
            addCriterion("remit_generate_date not like", value, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateIn(List<String> values) {
            addCriterion("remit_generate_date in", values, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateNotIn(List<String> values) {
            addCriterion("remit_generate_date not in", values, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateBetween(String value1, String value2) {
            addCriterion("remit_generate_date between", value1, value2, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitGenerateDateNotBetween(String value1, String value2) {
            addCriterion("remit_generate_date not between", value1, value2, "remitGenerateDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateIsNull() {
            addCriterion("remit_arrive_date is null");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateIsNotNull() {
            addCriterion("remit_arrive_date is not null");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateEqualTo(String value) {
            addCriterion("remit_arrive_date =", value, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateNotEqualTo(String value) {
            addCriterion("remit_arrive_date <>", value, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateGreaterThan(String value) {
            addCriterion("remit_arrive_date >", value, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateGreaterThanOrEqualTo(String value) {
            addCriterion("remit_arrive_date >=", value, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateLessThan(String value) {
            addCriterion("remit_arrive_date <", value, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateLessThanOrEqualTo(String value) {
            addCriterion("remit_arrive_date <=", value, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateLike(String value) {
            addCriterion("remit_arrive_date like", value, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateNotLike(String value) {
            addCriterion("remit_arrive_date not like", value, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateIn(List<String> values) {
            addCriterion("remit_arrive_date in", values, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateNotIn(List<String> values) {
            addCriterion("remit_arrive_date not in", values, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateBetween(String value1, String value2) {
            addCriterion("remit_arrive_date between", value1, value2, "remitArriveDate");
            return (Criteria) this;
        }

        public Criteria andRemitArriveDateNotBetween(String value1, String value2) {
            addCriterion("remit_arrive_date not between", value1, value2, "remitArriveDate");
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