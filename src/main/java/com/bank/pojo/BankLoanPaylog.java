package com.bank.pojo;

public class BankLoanPaylog {
    private String paylogId;

    private String transId;

    private Double payAmount;

    private String payDate;

    private String account;

    public String getPaylogId() {
        return paylogId;
    }

    public void setPaylogId(String paylogId) {
        this.paylogId = paylogId == null ? null : paylogId.trim();
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate == null ? null : payDate.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }
}