package com.bank.pojo;

public class BankTransferLog {
    private String transferId;

    private String transferOutAccount;

    private String transferInAccount;

    private Double amount;

    private String transferDate;

    private String receiveDate;

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId == null ? null : transferId.trim();
    }

    public String getTransferOutAccount() {
        return transferOutAccount;
    }

    public void setTransferOutAccount(String transferOutAccount) {
        this.transferOutAccount = transferOutAccount == null ? null : transferOutAccount.trim();
    }

    public String getTransferInAccount() {
        return transferInAccount;
    }

    public void setTransferInAccount(String transferInAccount) {
        this.transferInAccount = transferInAccount == null ? null : transferInAccount.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate == null ? null : transferDate.trim();
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate == null ? null : receiveDate.trim();
    }
}