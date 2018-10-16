package com.bank.pojo;

public class BankRemitLog {
    private Long remitId;

    private String remitOutAccount;

    private String remitInAccount;

    private Double amount;

    private String remitGenerateDate;

    public Long getRemitId() {
        return remitId;
    }

    public void setRemitId(Long remitId) {
        this.remitId = remitId;
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
}