package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankFundProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankFundProductExample() {
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

        public Criteria andPurchaseDateIsNull() {
            addCriterion("purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(String value) {
            addCriterion("purchase_date =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(String value) {
            addCriterion("purchase_date <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(String value) {
            addCriterion("purchase_date >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_date >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(String value) {
            addCriterion("purchase_date <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(String value) {
            addCriterion("purchase_date <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLike(String value) {
            addCriterion("purchase_date like", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotLike(String value) {
            addCriterion("purchase_date not like", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<String> values) {
            addCriterion("purchase_date in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<String> values) {
            addCriterion("purchase_date not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(String value1, String value2) {
            addCriterion("purchase_date between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(String value1, String value2) {
            addCriterion("purchase_date not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andFundIdIsNull() {
            addCriterion("fund_id is null");
            return (Criteria) this;
        }

        public Criteria andFundIdIsNotNull() {
            addCriterion("fund_id is not null");
            return (Criteria) this;
        }

        public Criteria andFundIdEqualTo(String value) {
            addCriterion("fund_id =", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotEqualTo(String value) {
            addCriterion("fund_id <>", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThan(String value) {
            addCriterion("fund_id >", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThanOrEqualTo(String value) {
            addCriterion("fund_id >=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThan(String value) {
            addCriterion("fund_id <", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThanOrEqualTo(String value) {
            addCriterion("fund_id <=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLike(String value) {
            addCriterion("fund_id like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotLike(String value) {
            addCriterion("fund_id not like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdIn(List<String> values) {
            addCriterion("fund_id in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotIn(List<String> values) {
            addCriterion("fund_id not in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdBetween(String value1, String value2) {
            addCriterion("fund_id between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotBetween(String value1, String value2) {
            addCriterion("fund_id not between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateIsNull() {
            addCriterion("purchase_rate is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateIsNotNull() {
            addCriterion("purchase_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateEqualTo(Double value) {
            addCriterion("purchase_rate =", value, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateNotEqualTo(Double value) {
            addCriterion("purchase_rate <>", value, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateGreaterThan(Double value) {
            addCriterion("purchase_rate >", value, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateGreaterThanOrEqualTo(Double value) {
            addCriterion("purchase_rate >=", value, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateLessThan(Double value) {
            addCriterion("purchase_rate <", value, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateLessThanOrEqualTo(Double value) {
            addCriterion("purchase_rate <=", value, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateIn(List<Double> values) {
            addCriterion("purchase_rate in", values, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateNotIn(List<Double> values) {
            addCriterion("purchase_rate not in", values, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateBetween(Double value1, Double value2) {
            addCriterion("purchase_rate between", value1, value2, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseRateNotBetween(Double value1, Double value2) {
            addCriterion("purchase_rate not between", value1, value2, "purchaseRate");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueIsNull() {
            addCriterion("net_asset_value is null");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueIsNotNull() {
            addCriterion("net_asset_value is not null");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueEqualTo(Double value) {
            addCriterion("net_asset_value =", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueNotEqualTo(Double value) {
            addCriterion("net_asset_value <>", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueGreaterThan(Double value) {
            addCriterion("net_asset_value >", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueGreaterThanOrEqualTo(Double value) {
            addCriterion("net_asset_value >=", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueLessThan(Double value) {
            addCriterion("net_asset_value <", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueLessThanOrEqualTo(Double value) {
            addCriterion("net_asset_value <=", value, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueIn(List<Double> values) {
            addCriterion("net_asset_value in", values, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueNotIn(List<Double> values) {
            addCriterion("net_asset_value not in", values, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueBetween(Double value1, Double value2) {
            addCriterion("net_asset_value between", value1, value2, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andNetAssetValueNotBetween(Double value1, Double value2) {
            addCriterion("net_asset_value not between", value1, value2, "netAssetValue");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateIsNull() {
            addCriterion("redemption_rate is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateIsNotNull() {
            addCriterion("redemption_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateEqualTo(Double value) {
            addCriterion("redemption_rate =", value, "redemptionRate");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateNotEqualTo(Double value) {
            addCriterion("redemption_rate <>", value, "redemptionRate");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateGreaterThan(Double value) {
            addCriterion("redemption_rate >", value, "redemptionRate");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateGreaterThanOrEqualTo(Double value) {
            addCriterion("redemption_rate >=", value, "redemptionRate");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateLessThan(Double value) {
            addCriterion("redemption_rate <", value, "redemptionRate");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateLessThanOrEqualTo(Double value) {
            addCriterion("redemption_rate <=", value, "redemptionRate");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateIn(List<Double> values) {
            addCriterion("redemption_rate in", values, "redemptionRate");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateNotIn(List<Double> values) {
            addCriterion("redemption_rate not in", values, "redemptionRate");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateBetween(Double value1, Double value2) {
            addCriterion("redemption_rate between", value1, value2, "redemptionRate");
            return (Criteria) this;
        }

        public Criteria andRedemptionRateNotBetween(Double value1, Double value2) {
            addCriterion("redemption_rate not between", value1, value2, "redemptionRate");
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