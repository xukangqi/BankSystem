package com.bank.pojo;

public class BankLoanType {
    private String loanTypeName;

    private Double periodOne;

    private Double periodTwo;

    private Double periodThree;

    private Double fineRate;

    public String getLoanTypeName() {
        return loanTypeName;
    }

    public void setLoanTypeName(String loanTypeName) {
        this.loanTypeName = loanTypeName == null ? null : loanTypeName.trim();
    }

    public Double getPeriodOne() {
        return periodOne;
    }

    public void setPeriodOne(Double periodOne) {
        this.periodOne = periodOne;
    }

    public Double getPeriodTwo() {
        return periodTwo;
    }

    public void setPeriodTwo(Double periodTwo) {
        this.periodTwo = periodTwo;
    }

    public Double getPeriodThree() {
        return periodThree;
    }

    public void setPeriodThree(Double periodThree) {
        this.periodThree = periodThree;
    }

    public Double getFineRate() {
        return fineRate;
    }

    public void setFineRate(Double fineRate) {
        this.fineRate = fineRate;
    }
}