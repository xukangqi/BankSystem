package com.bank.pojo;

public class BankLoanPaylog {
    private Long paylogId;

    private Double payAmount;

    private String payDate;

    private String account;

    public Long getPaylogId() {
        return paylogId;
    }

    public void setPaylogId(Long paylogId) {
        this.paylogId = paylogId;
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