package com.bank.pojo;

public class BankDeposit {
    private String depositId;

    private String custId;

    private String account;

    private String depositType;

    private Double depositMoney;

    private Double depositRate;

    private String depositDate;

    private String depositDuration;

    private String transferWay;

    private String reviewerId;

    private String depositFlag;

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId == null ? null : depositId.trim();
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

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType == null ? null : depositType.trim();
    }

    public Double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(Double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public Double getDepositRate() {
        return depositRate;
    }

    public void setDepositRate(Double depositRate) {
        this.depositRate = depositRate;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate == null ? null : depositDate.trim();
    }

    public String getDepositDuration() {
        return depositDuration;
    }

    public void setDepositDuration(String depositDuration) {
        this.depositDuration = depositDuration == null ? null : depositDuration.trim();
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

    public String getDepositFlag() {
        return depositFlag;
    }

    public void setDepositFlag(String depositFlag) {
        this.depositFlag = depositFlag == null ? null : depositFlag.trim();
    }
}