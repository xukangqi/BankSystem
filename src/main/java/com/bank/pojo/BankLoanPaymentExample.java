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

        public Criteria andPaymentIdEqualTo(String value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(String value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(String value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(String value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(String value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLike(String value) {
            addCriterion("payment_id like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotLike(String value) {
            addCriterion("payment_id not like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<String> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<String> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(String value1, String value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(String value1, String value2) {
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

        public Criteria andTransIdEqualTo(String value) {
            addCriterion("trans_id =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(String value) {
            addCriterion("trans_id <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(String value) {
            addCriterion("trans_id >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("trans_id >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(String value) {
            addCriterion("trans_id <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(String value) {
            addCriterion("trans_id <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLike(String value) {
            addCriterion("trans_id like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotLike(String value) {
            addCriterion("trans_id not like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<String> values) {
            addCriterion("trans_id in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<String> values) {
            addCriterion("trans_id not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(String value1, String value2) {
            addCriterion("trans_id between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(String value1, String value2) {
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

        public Criteria andIsFinishedIsNull() {
            addCriterion("is_finished is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIsNotNull() {
            addCriterion("is_finished is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedEqualTo(String value) {
            addCriterion("is_finished =", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotEqualTo(String value) {
            addCriterion("is_finished <>", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedGreaterThan(String value) {
            addCriterion("is_finished >", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedGreaterThanOrEqualTo(String value) {
            addCriterion("is_finished >=", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLessThan(String value) {
            addCriterion("is_finished <", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLessThanOrEqualTo(String value) {
            addCriterion("is_finished <=", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLike(String value) {
            addCriterion("is_finished like", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotLike(String value) {
            addCriterion("is_finished not like", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIn(List<String> values) {
            addCriterion("is_finished in", values, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotIn(List<String> values) {
            addCriterion("is_finished not in", values, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedBetween(String value1, String value2) {
            addCriterion("is_finished between", value1, value2, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotBetween(String value1, String value2) {
            addCriterion("is_finished not between", value1, value2, "isFinished");
            return (Criteria) this;
        }

        public Criteria andFineRateIsNull() {
            addCriterion("fine_rate is null");
            return (Criteria) this;
        }

        public Criteria andFineRateIsNotNull() {
            addCriterion("fine_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFineRateEqualTo(Double value) {
            addCriterion("fine_rate =", value, "fineRate");
            return (Criteria) this;
        }

        public Criteria andFineRateNotEqualTo(Double value) {
            addCriterion("fine_rate <>", value, "fineRate");
            return (Criteria) this;
        }

        public Criteria andFineRateGreaterThan(Double value) {
            addCriterion("fine_rate >", value, "fineRate");
            return (Criteria) this;
        }

        public Criteria andFineRateGreaterThanOrEqualTo(Double value) {
            addCriterion("fine_rate >=", value, "fineRate");
            return (Criteria) this;
        }

        public Criteria andFineRateLessThan(Double value) {
            addCriterion("fine_rate <", value, "fineRate");
            return (Criteria) this;
        }

        public Criteria andFineRateLessThanOrEqualTo(Double value) {
            addCriterion("fine_rate <=", value, "fineRate");
            return (Criteria) this;
        }

        public Criteria andFineRateIn(List<Double> values) {
            addCriterion("fine_rate in", values, "fineRate");
            return (Criteria) this;
        }

        public Criteria andFineRateNotIn(List<Double> values) {
            addCriterion("fine_rate not in", values, "fineRate");
            return (Criteria) this;
        }

        public Criteria andFineRateBetween(Double value1, Double value2) {
            addCriterion("fine_rate between", value1, value2, "fineRate");
            return (Criteria) this;
        }

        public Criteria andFineRateNotBetween(Double value1, Double value2) {
            addCriterion("fine_rate not between", value1, value2, "fineRate");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountIsNull() {
            addCriterion("all_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountIsNotNull() {
            addCriterion("all_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountEqualTo(Double value) {
            addCriterion("all_payment_amount =", value, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountNotEqualTo(Double value) {
            addCriterion("all_payment_amount <>", value, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountGreaterThan(Double value) {
            addCriterion("all_payment_amount >", value, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("all_payment_amount >=", value, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountLessThan(Double value) {
            addCriterion("all_payment_amount <", value, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountLessThanOrEqualTo(Double value) {
            addCriterion("all_payment_amount <=", value, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountIn(List<Double> values) {
            addCriterion("all_payment_amount in", values, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountNotIn(List<Double> values) {
            addCriterion("all_payment_amount not in", values, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountBetween(Double value1, Double value2) {
            addCriterion("all_payment_amount between", value1, value2, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllPaymentAmountNotBetween(Double value1, Double value2) {
            addCriterion("all_payment_amount not between", value1, value2, "allPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andReimbursementIsNull() {
            addCriterion("reimbursement is null");
            return (Criteria) this;
        }

        public Criteria andReimbursementIsNotNull() {
            addCriterion("reimbursement is not null");
            return (Criteria) this;
        }

        public Criteria andReimbursementEqualTo(Double value) {
            addCriterion("reimbursement =", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementNotEqualTo(Double value) {
            addCriterion("reimbursement <>", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementGreaterThan(Double value) {
            addCriterion("reimbursement >", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementGreaterThanOrEqualTo(Double value) {
            addCriterion("reimbursement >=", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementLessThan(Double value) {
            addCriterion("reimbursement <", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementLessThanOrEqualTo(Double value) {
            addCriterion("reimbursement <=", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementIn(List<Double> values) {
            addCriterion("reimbursement in", values, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementNotIn(List<Double> values) {
            addCriterion("reimbursement not in", values, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementBetween(Double value1, Double value2) {
            addCriterion("reimbursement between", value1, value2, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementNotBetween(Double value1, Double value2) {
            addCriterion("reimbursement not between", value1, value2, "reimbursement");
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