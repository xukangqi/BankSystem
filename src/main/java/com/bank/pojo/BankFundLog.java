package com.bank.pojo;

public class BankFundLog {
    private String fundTxId;

    private String custId;

    private String account;

    private String fundId;

    private String type;

    private Double amount;

    private Double share;

    private String txDate;

    private String reviewId;

    public String getFundTxId() {
        return fundTxId;
    }

    public void setFundTxId(String fundTxId) {
        this.fundTxId = fundTxId == null ? null : fundTxId.trim();
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

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getShare() {
        return share;
    }

    public void setShare(Double share) {
        this.share = share;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate == null ? null : txDate.trim();
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId == null ? null : reviewId.trim();
    }
}