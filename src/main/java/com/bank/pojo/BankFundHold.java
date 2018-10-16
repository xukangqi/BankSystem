package com.bank.pojo;

public class BankFundHold extends BankFundHoldKey {
    private String custId;

    private Double share;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public Double getShare() {
        return share;
    }

    public void setShare(Double share) {
        this.share = share;
    }
}