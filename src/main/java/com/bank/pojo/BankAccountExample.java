package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankAccountExample() {
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

        public Criteria andDepositBankIsNull() {
            addCriterion("deposit_bank is null");
            return (Criteria) this;
        }

        public Criteria andDepositBankIsNotNull() {
            addCriterion("deposit_bank is not null");
            return (Criteria) this;
        }

        public Criteria andDepositBankEqualTo(String value) {
            addCriterion("deposit_bank =", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankNotEqualTo(String value) {
            addCriterion("deposit_bank <>", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankGreaterThan(String value) {
            addCriterion("deposit_bank >", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_bank >=", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankLessThan(String value) {
            addCriterion("deposit_bank <", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankLessThanOrEqualTo(String value) {
            addCriterion("deposit_bank <=", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankLike(String value) {
            addCriterion("deposit_bank like", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankNotLike(String value) {
            addCriterion("deposit_bank not like", value, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankIn(List<String> values) {
            addCriterion("deposit_bank in", values, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankNotIn(List<String> values) {
            addCriterion("deposit_bank not in", values, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankBetween(String value1, String value2) {
            addCriterion("deposit_bank between", value1, value2, "depositBank");
            return (Criteria) this;
        }

        public Criteria andDepositBankNotBetween(String value1, String value2) {
            addCriterion("deposit_bank not between", value1, value2, "depositBank");
            return (Criteria) this;
        }

        public Criteria andBalancesIsNull() {
            addCriterion("balances is null");
            return (Criteria) this;
        }

        public Criteria andBalancesIsNotNull() {
            addCriterion("balances is not null");
            return (Criteria) this;
        }

        public Criteria andBalancesEqualTo(Double value) {
            addCriterion("balances =", value, "balances");
            return (Criteria) this;
        }

        public Criteria andBalancesNotEqualTo(Double value) {
            addCriterion("balances <>", value, "balances");
            return (Criteria) this;
        }

        public Criteria andBalancesGreaterThan(Double value) {
            addCriterion("balances >", value, "balances");
            return (Criteria) this;
        }

        public Criteria andBalancesGreaterThanOrEqualTo(Double value) {
            addCriterion("balances >=", value, "balances");
            return (Criteria) this;
        }

        public Criteria andBalancesLessThan(Double value) {
            addCriterion("balances <", value, "balances");
            return (Criteria) this;
        }

        public Criteria andBalancesLessThanOrEqualTo(Double value) {
            addCriterion("balances <=", value, "balances");
            return (Criteria) this;
        }

        public Criteria andBalancesIn(List<Double> values) {
            addCriterion("balances in", values, "balances");
            return (Criteria) this;
        }

        public Criteria andBalancesNotIn(List<Double> values) {
            addCriterion("balances not in", values, "balances");
            return (Criteria) this;
        }

        public Criteria andBalancesBetween(Double value1, Double value2) {
            addCriterion("balances between", value1, value2, "balances");
            return (Criteria) this;
        }

        public Criteria andBalancesNotBetween(Double value1, Double value2) {
            addCriterion("balances not between", value1, value2, "balances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesIsNull() {
            addCriterion("blocked_balances is null");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesIsNotNull() {
            addCriterion("blocked_balances is not null");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesEqualTo(Double value) {
            addCriterion("blocked_balances =", value, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesNotEqualTo(Double value) {
            addCriterion("blocked_balances <>", value, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesGreaterThan(Double value) {
            addCriterion("blocked_balances >", value, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesGreaterThanOrEqualTo(Double value) {
            addCriterion("blocked_balances >=", value, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesLessThan(Double value) {
            addCriterion("blocked_balances <", value, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesLessThanOrEqualTo(Double value) {
            addCriterion("blocked_balances <=", value, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesIn(List<Double> values) {
            addCriterion("blocked_balances in", values, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesNotIn(List<Double> values) {
            addCriterion("blocked_balances not in", values, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesBetween(Double value1, Double value2) {
            addCriterion("blocked_balances between", value1, value2, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andBlockedBalancesNotBetween(Double value1, Double value2) {
            addCriterion("blocked_balances not between", value1, value2, "blockedBalances");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(String value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(String value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(String value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(String value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(String value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(String value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLike(String value) {
            addCriterion("open_date like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotLike(String value) {
            addCriterion("open_date not like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<String> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<String> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(String value1, String value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(String value1, String value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("cancel_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("cancel_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(String value) {
            addCriterion("cancel_date =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(String value) {
            addCriterion("cancel_date <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(String value) {
            addCriterion("cancel_date >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_date >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(String value) {
            addCriterion("cancel_date <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(String value) {
            addCriterion("cancel_date <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLike(String value) {
            addCriterion("cancel_date like", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotLike(String value) {
            addCriterion("cancel_date not like", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<String> values) {
            addCriterion("cancel_date in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<String> values) {
            addCriterion("cancel_date not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(String value1, String value2) {
            addCriterion("cancel_date between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(String value1, String value2) {
            addCriterion("cancel_date not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andAccountKindIsNull() {
            addCriterion("account_kind is null");
            return (Criteria) this;
        }

        public Criteria andAccountKindIsNotNull() {
            addCriterion("account_kind is not null");
            return (Criteria) this;
        }

        public Criteria andAccountKindEqualTo(String value) {
            addCriterion("account_kind =", value, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindNotEqualTo(String value) {
            addCriterion("account_kind <>", value, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindGreaterThan(String value) {
            addCriterion("account_kind >", value, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindGreaterThanOrEqualTo(String value) {
            addCriterion("account_kind >=", value, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindLessThan(String value) {
            addCriterion("account_kind <", value, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindLessThanOrEqualTo(String value) {
            addCriterion("account_kind <=", value, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindLike(String value) {
            addCriterion("account_kind like", value, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindNotLike(String value) {
            addCriterion("account_kind not like", value, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindIn(List<String> values) {
            addCriterion("account_kind in", values, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindNotIn(List<String> values) {
            addCriterion("account_kind not in", values, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindBetween(String value1, String value2) {
            addCriterion("account_kind between", value1, value2, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountKindNotBetween(String value1, String value2) {
            addCriterion("account_kind not between", value1, value2, "accountKind");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("account_type like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("account_type not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNull() {
            addCriterion("account_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNotNull() {
            addCriterion("account_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusEqualTo(String value) {
            addCriterion("account_status =", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotEqualTo(String value) {
            addCriterion("account_status <>", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThan(String value) {
            addCriterion("account_status >", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThanOrEqualTo(String value) {
            addCriterion("account_status >=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThan(String value) {
            addCriterion("account_status <", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThanOrEqualTo(String value) {
            addCriterion("account_status <=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLike(String value) {
            addCriterion("account_status like", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotLike(String value) {
            addCriterion("account_status not like", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIn(List<String> values) {
            addCriterion("account_status in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotIn(List<String> values) {
            addCriterion("account_status not in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusBetween(String value1, String value2) {
            addCriterion("account_status between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotBetween(String value1, String value2) {
            addCriterion("account_status not between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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