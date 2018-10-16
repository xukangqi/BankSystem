package com.bank.pojo;

public class BankLoad {
    private Long transId;

    private String custId;

    private String account;

    private String transDate;

    private Double loadAmount;

    private Short insCount;

    private Double loadInterest;

    private Double loadAmountSum;

    private String expirationDate;

    private Double recoveredAmount;

    private Boolean isFinished;

    private String reviewerId;

    private String loadTypeName;

    public Long getTransId() {
        return transId;
    }

    public void setTransId(Long transId) {
        this.transId = transId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate == null ? null : transDate.trim();
    }

    public Double getLoadAmount() {
        return loadAmount;
    }

    public void setLoadAmount(Double loadAmount) {
        this.loadAmount = loadAmount;
    }

    public Short getInsCount() {
        return insCount;
    }

    public void setInsCount(Short insCount) {
        this.insCount = insCount;
    }

    public Double getLoadInterest() {
        return loadInterest;
    }

    public void setLoadInterest(Double loadInterest) {
        this.loadInterest = loadInterest;
    }

    public Double getLoadAmountSum() {
        return loadAmountSum;
    }

    public void setLoadAmountSum(Double loadAmountSum) {
        this.loadAmountSum = loadAmountSum;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate == null ? null : expirationDate.trim();
    }

    public Double getRecoveredAmount() {
        return recoveredAmount;
    }

    public void setRecoveredAmount(Double recoveredAmount) {
        this.recoveredAmount = recoveredAmount;
    }

    public Boolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId == null ? null : reviewerId.trim();
    }

    public String getLoadTypeName() {
        return loadTypeName;
    }

    public void setLoadTypeName(String loadTypeName) {
        this.loadTypeName = loadTypeName == null ? null : loadTypeName.trim();
    }
}