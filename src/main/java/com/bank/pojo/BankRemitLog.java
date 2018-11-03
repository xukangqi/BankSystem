package com.bank.pojo;

public class BankRemitLog {
    private String remitId;

    private String remitOutAccount;

    private String remitInAccount;

    private Double amount;

    private String remitGenerateDate;

    private String remitArriveDate;

    public String getRemitId() {
        return remitId;
    }

    public void setRemitId(String remitId) {
        this.remitId = remitId == null ? null : remitId.trim();
    }

    public String getRemitOutAccount() {
        return remitOutAccount;
    }

    public void setRemitOutAccount(String remitOutAccount) {
        this.remitOutAccount = remitOutAccount == null ? null : remitOutAccount.trim();
    }

    public String getRemitInAccount() {
        return remitInAccount;
    }

    public void setRemitInAccount(String remitInAccount) {
        this.remitInAccount = remitInAccount == null ? null : remitInAccount.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getRemitGenerateDate() {
        return remitGenerateDate;
    }

    public void setRemitGenerateDate(String remitGenerateDate) {
        this.remitGenerateDate = remitGenerateDate == null ? null : remitGenerateDate.trim();
    }

    public String getRemitArriveDate() {
        return remitArriveDate;
    }

    public void setRemitArriveDate(String remitArriveDate) {
        this.remitArriveDate = remitArriveDate == null ? null : remitArriveDate.trim();
    }
}