package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankLoanExample() {
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

        public Criteria andTransDateIsNull() {
            addCriterion("trans_date is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("trans_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(String value) {
            addCriterion("trans_date =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(String value) {
            addCriterion("trans_date <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(String value) {
            addCriterion("trans_date >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(String value) {
            addCriterion("trans_date >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(String value) {
            addCriterion("trans_date <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(String value) {
            addCriterion("trans_date <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLike(String value) {
            addCriterion("trans_date like", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotLike(String value) {
            addCriterion("trans_date not like", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<String> values) {
            addCriterion("trans_date in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<String> values) {
            addCriterion("trans_date not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(String value1, String value2) {
            addCriterion("trans_date between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(String value1, String value2) {
            addCriterion("trans_date not between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(Double value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(Double value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(Double value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(Double value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(Double value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<Double> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<Double> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(Double value1, Double value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(Double value1, Double value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andInsCountIsNull() {
            addCriterion("ins_count is null");
            return (Criteria) this;
        }

        public Criteria andInsCountIsNotNull() {
            addCriterion("ins_count is not null");
            return (Criteria) this;
        }

        public Criteria andInsCountEqualTo(Short value) {
            addCriterion("ins_count =", value, "insCount");
            return (Criteria) this;
        }

        public Criteria andInsCountNotEqualTo(Short value) {
            addCriterion("ins_count <>", value, "insCount");
            return (Criteria) this;
        }

        public Criteria andInsCountGreaterThan(Short value) {
            addCriterion("ins_count >", value, "insCount");
            return (Criteria) this;
        }

        public Criteria andInsCountGreaterThanOrEqualTo(Short value) {
            addCriterion("ins_count >=", value, "insCount");
            return (Criteria) this;
        }

        public Criteria andInsCountLessThan(Short value) {
            addCriterion("ins_count <", value, "insCount");
            return (Criteria) this;
        }

        public Criteria andInsCountLessThanOrEqualTo(Short value) {
            addCriterion("ins_count <=", value, "insCount");
            return (Criteria) this;
        }

        public Criteria andInsCountIn(List<Short> values) {
            addCriterion("ins_count in", values, "insCount");
            return (Criteria) this;
        }

        public Criteria andInsCountNotIn(List<Short> values) {
            addCriterion("ins_count not in", values, "insCount");
            return (Criteria) this;
        }

        public Criteria andInsCountBetween(Short value1, Short value2) {
            addCriterion("ins_count between", value1, value2, "insCount");
            return (Criteria) this;
        }

        public Criteria andInsCountNotBetween(Short value1, Short value2) {
            addCriterion("ins_count not between", value1, value2, "insCount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestIsNull() {
            addCriterion("loan_interest is null");
            return (Criteria) this;
        }

        public Criteria andLoanInterestIsNotNull() {
            addCriterion("loan_interest is not null");
            return (Criteria) this;
        }

        public Criteria andLoanInterestEqualTo(Double value) {
            addCriterion("loan_interest =", value, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanInterestNotEqualTo(Double value) {
            addCriterion("loan_interest <>", value, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanInterestGreaterThan(Double value) {
            addCriterion("loan_interest >", value, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanInterestGreaterThanOrEqualTo(Double value) {
            addCriterion("loan_interest >=", value, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanInterestLessThan(Double value) {
            addCriterion("loan_interest <", value, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanInterestLessThanOrEqualTo(Double value) {
            addCriterion("loan_interest <=", value, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanInterestIn(List<Double> values) {
            addCriterion("loan_interest in", values, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanInterestNotIn(List<Double> values) {
            addCriterion("loan_interest not in", values, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanInterestBetween(Double value1, Double value2) {
            addCriterion("loan_interest between", value1, value2, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanInterestNotBetween(Double value1, Double value2) {
            addCriterion("loan_interest not between", value1, value2, "loanInterest");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumIsNull() {
            addCriterion("loan_amount_sum is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumIsNotNull() {
            addCriterion("loan_amount_sum is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumEqualTo(Double value) {
            addCriterion("loan_amount_sum =", value, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumNotEqualTo(Double value) {
            addCriterion("loan_amount_sum <>", value, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumGreaterThan(Double value) {
            addCriterion("loan_amount_sum >", value, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumGreaterThanOrEqualTo(Double value) {
            addCriterion("loan_amount_sum >=", value, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumLessThan(Double value) {
            addCriterion("loan_amount_sum <", value, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumLessThanOrEqualTo(Double value) {
            addCriterion("loan_amount_sum <=", value, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumIn(List<Double> values) {
            addCriterion("loan_amount_sum in", values, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumNotIn(List<Double> values) {
            addCriterion("loan_amount_sum not in", values, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumBetween(Double value1, Double value2) {
            addCriterion("loan_amount_sum between", value1, value2, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andLoanAmountSumNotBetween(Double value1, Double value2) {
            addCriterion("loan_amount_sum not between", value1, value2, "loanAmountSum");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNull() {
            addCriterion("expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(String value) {
            addCriterion("expiration_date =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(String value) {
            addCriterion("expiration_date <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(String value) {
            addCriterion("expiration_date >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(String value) {
            addCriterion("expiration_date >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(String value) {
            addCriterion("expiration_date <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(String value) {
            addCriterion("expiration_date <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLike(String value) {
            addCriterion("expiration_date like", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotLike(String value) {
            addCriterion("expiration_date not like", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<String> values) {
            addCriterion("expiration_date in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<String> values) {
            addCriterion("expiration_date not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(String value1, String value2) {
            addCriterion("expiration_date between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(String value1, String value2) {
            addCriterion("expiration_date not between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountIsNull() {
            addCriterion("recovered_amount is null");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountIsNotNull() {
            addCriterion("recovered_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountEqualTo(Double value) {
            addCriterion("recovered_amount =", value, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountNotEqualTo(Double value) {
            addCriterion("recovered_amount <>", value, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountGreaterThan(Double value) {
            addCriterion("recovered_amount >", value, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("recovered_amount >=", value, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountLessThan(Double value) {
            addCriterion("recovered_amount <", value, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountLessThanOrEqualTo(Double value) {
            addCriterion("recovered_amount <=", value, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountIn(List<Double> values) {
            addCriterion("recovered_amount in", values, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountNotIn(List<Double> values) {
            addCriterion("recovered_amount not in", values, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountBetween(Double value1, Double value2) {
            addCriterion("recovered_amount between", value1, value2, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andRecoveredAmountNotBetween(Double value1, Double value2) {
            addCriterion("recovered_amount not between", value1, value2, "recoveredAmount");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIsNull() {
            addCriterion("loan_status is null");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIsNotNull() {
            addCriterion("loan_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStatusEqualTo(String value) {
            addCriterion("loan_status =", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotEqualTo(String value) {
            addCriterion("loan_status <>", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusGreaterThan(String value) {
            addCriterion("loan_status >", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusGreaterThanOrEqualTo(String value) {
            addCriterion("loan_status >=", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLessThan(String value) {
            addCriterion("loan_status <", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLessThanOrEqualTo(String value) {
            addCriterion("loan_status <=", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLike(String value) {
            addCriterion("loan_status like", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotLike(String value) {
            addCriterion("loan_status not like", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIn(List<String> values) {
            addCriterion("loan_status in", values, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotIn(List<String> values) {
            addCriterion("loan_status not in", values, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusBetween(String value1, String value2) {
            addCriterion("loan_status between", value1, value2, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotBetween(String value1, String value2) {
            addCriterion("loan_status not between", value1, value2, "loanStatus");
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

        public Criteria andLoanTypeNameIsNull() {
            addCriterion("loan_type_name is null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameIsNotNull() {
            addCriterion("loan_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameEqualTo(String value) {
            addCriterion("loan_type_name =", value, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameNotEqualTo(String value) {
            addCriterion("loan_type_name <>", value, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameGreaterThan(String value) {
            addCriterion("loan_type_name >", value, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("loan_type_name >=", value, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameLessThan(String value) {
            addCriterion("loan_type_name <", value, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameLessThanOrEqualTo(String value) {
            addCriterion("loan_type_name <=", value, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameLike(String value) {
            addCriterion("loan_type_name like", value, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameNotLike(String value) {
            addCriterion("loan_type_name not like", value, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameIn(List<String> values) {
            addCriterion("loan_type_name in", values, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameNotIn(List<String> values) {
            addCriterion("loan_type_name not in", values, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameBetween(String value1, String value2) {
            addCriterion("loan_type_name between", value1, value2, "loanTypeName");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNameNotBetween(String value1, String value2) {
            addCriterion("loan_type_name not between", value1, value2, "loanTypeName");
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