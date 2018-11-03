package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankTransferLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankTransferLogExample() {
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

        public Criteria andTransferIdIsNull() {
            addCriterion("transfer_id is null");
            return (Criteria) this;
        }

        public Criteria andTransferIdIsNotNull() {
            addCriterion("transfer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransferIdEqualTo(String value) {
            addCriterion("transfer_id =", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotEqualTo(String value) {
            addCriterion("transfer_id <>", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThan(String value) {
            addCriterion("transfer_id >", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_id >=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThan(String value) {
            addCriterion("transfer_id <", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThanOrEqualTo(String value) {
            addCriterion("transfer_id <=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLike(String value) {
            addCriterion("transfer_id like", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotLike(String value) {
            addCriterion("transfer_id not like", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdIn(List<String> values) {
            addCriterion("transfer_id in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotIn(List<String> values) {
            addCriterion("transfer_id not in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdBetween(String value1, String value2) {
            addCriterion("transfer_id between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotBetween(String value1, String value2) {
            addCriterion("transfer_id not between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountIsNull() {
            addCriterion("transfer_out_account is null");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountIsNotNull() {
            addCriterion("transfer_out_account is not null");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountEqualTo(String value) {
            addCriterion("transfer_out_account =", value, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountNotEqualTo(String value) {
            addCriterion("transfer_out_account <>", value, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountGreaterThan(String value) {
            addCriterion("transfer_out_account >", value, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_out_account >=", value, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountLessThan(String value) {
            addCriterion("transfer_out_account <", value, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountLessThanOrEqualTo(String value) {
            addCriterion("transfer_out_account <=", value, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountLike(String value) {
            addCriterion("transfer_out_account like", value, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountNotLike(String value) {
            addCriterion("transfer_out_account not like", value, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountIn(List<String> values) {
            addCriterion("transfer_out_account in", values, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountNotIn(List<String> values) {
            addCriterion("transfer_out_account not in", values, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountBetween(String value1, String value2) {
            addCriterion("transfer_out_account between", value1, value2, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferOutAccountNotBetween(String value1, String value2) {
            addCriterion("transfer_out_account not between", value1, value2, "transferOutAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountIsNull() {
            addCriterion("transfer_in_account is null");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountIsNotNull() {
            addCriterion("transfer_in_account is not null");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountEqualTo(String value) {
            addCriterion("transfer_in_account =", value, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountNotEqualTo(String value) {
            addCriterion("transfer_in_account <>", value, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountGreaterThan(String value) {
            addCriterion("transfer_in_account >", value, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_in_account >=", value, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountLessThan(String value) {
            addCriterion("transfer_in_account <", value, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountLessThanOrEqualTo(String value) {
            addCriterion("transfer_in_account <=", value, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountLike(String value) {
            addCriterion("transfer_in_account like", value, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountNotLike(String value) {
            addCriterion("transfer_in_account not like", value, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountIn(List<String> values) {
            addCriterion("transfer_in_account in", values, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountNotIn(List<String> values) {
            addCriterion("transfer_in_account not in", values, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountBetween(String value1, String value2) {
            addCriterion("transfer_in_account between", value1, value2, "transferInAccount");
            return (Criteria) this;
        }

        public Criteria andTransferInAccountNotBetween(String value1, String value2) {
            addCriterion("transfer_in_account not between", value1, value2, "transferInAccount");
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

        public Criteria andTransferDateIsNull() {
            addCriterion("transfer_date is null");
            return (Criteria) this;
        }

        public Criteria andTransferDateIsNotNull() {
            addCriterion("transfer_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransferDateEqualTo(String value) {
            addCriterion("transfer_date =", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotEqualTo(String value) {
            addCriterion("transfer_date <>", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateGreaterThan(String value) {
            addCriterion("transfer_date >", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_date >=", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLessThan(String value) {
            addCriterion("transfer_date <", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLessThanOrEqualTo(String value) {
            addCriterion("transfer_date <=", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLike(String value) {
            addCriterion("transfer_date like", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotLike(String value) {
            addCriterion("transfer_date not like", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateIn(List<String> values) {
            addCriterion("transfer_date in", values, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotIn(List<String> values) {
            addCriterion("transfer_date not in", values, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateBetween(String value1, String value2) {
            addCriterion("transfer_date between", value1, value2, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotBetween(String value1, String value2) {
            addCriterion("transfer_date not between", value1, value2, "transferDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("receive_date is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("receive_date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(String value) {
            addCriterion("receive_date =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(String value) {
            addCriterion("receive_date <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(String value) {
            addCriterion("receive_date >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("receive_date >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(String value) {
            addCriterion("receive_date <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(String value) {
            addCriterion("receive_date <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLike(String value) {
            addCriterion("receive_date like", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotLike(String value) {
            addCriterion("receive_date not like", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<String> values) {
            addCriterion("receive_date in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<String> values) {
            addCriterion("receive_date not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(String value1, String value2) {
            addCriterion("receive_date between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(String value1, String value2) {
            addCriterion("receive_date not between", value1, value2, "receiveDate");
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