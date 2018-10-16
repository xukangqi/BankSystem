package com.bank.pojo;

public class BankLoadType {
    private String loadTypeName;

    private Double periodOne;

    private Double periodTwo;

    private Double periodThree;

    public String getLoadTypeName() {
        return loadTypeName;
    }

    public void setLoadTypeName(String loadTypeName) {
        this.loadTypeName = loadTypeName == null ? null : loadTypeName.trim();
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
}