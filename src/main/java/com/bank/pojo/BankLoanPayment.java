package com.bank.pojo;

public class BankLoanPayment {
    private String paymentId;

    private String transId;

    private Short insNum;

    private Double paymentAmount;

    private String paymentDate;

    private String isFinished;

    private Double fineRate;

    private Double allPaymentAmount;

    private Double reimbursement;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId == null ? null : paymentId.trim();
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public Short getInsNum() {
        return insNum;
    }

    public void setInsNum(Short insNum) {
        this.insNum = insNum;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate == null ? null : paymentDate.trim();
    }

    public String getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(String isFinished) {
        this.isFinished = isFinished == null ? null : isFinished.trim();
    }

    public Double getFineRate() {
        return fineRate;
    }

    public void setFineRate(Double fineRate) {
        this.fineRate = fineRate;
    }

    public Double getAllPaymentAmount() {
        return allPaymentAmount;
    }

    public void setAllPaymentAmount(Double allPaymentAmount) {
        this.allPaymentAmount = allPaymentAmount;
    }

    public Double getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(Double reimbursement) {
        this.reimbursement = reimbursement;
    }
}