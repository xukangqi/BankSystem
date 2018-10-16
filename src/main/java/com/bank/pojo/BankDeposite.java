package com.bank.pojo;

public class BankDeposite {
    private Long depositeId;

    private String custId;

    private String account;

    private String depositeType;

    private Double depositeMoney;

    private Double depositeRate;

    private String depositeDate;

    private String depositeDuration;

    private String transferWay;

    private String reviewerId;

    public Long getDepositeId() {
        return depositeId;
    }

    public void setDepositeId(Long depositeId) {
        this.depositeId = depositeId;
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

    public String getDepositeType() {
        return depositeType;
    }

    public void setDepositeType(String depositeType) {
        this.depositeType = depositeType == null ? null : depositeType.trim();
    }

    public Double getDepositeMoney() {
        return depositeMoney;
    }

    public void setDepositeMoney(Double depositeMoney) {
        this.depositeMoney = depositeMoney;
    }

    public Double getDepositeRate() {
        return depositeRate;
    }

    public void setDepositeRate(Double depositeRate) {
        this.depositeRate = depositeRate;
    }

    public String getDepositeDate() {
        return depositeDate;
    }

    public void setDepositeDate(String depositeDate) {
        this.depositeDate = depositeDate == null ? null : depositeDate.trim();
    }

    public String getDepositeDuration() {
        return depositeDuration;
    }

    public void setDepositeDuration(String depositeDuration) {
        this.depositeDuration = depositeDuration == null ? null : depositeDuration.trim();
    }

    public String getTransferWay() {
        return transferWay;
    }

    public void setTransferWay(String transferWay) {
        this.transferWay = transferWay == null ? null : transferWay.trim();
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId == null ? null : reviewerId.trim();
    }
}