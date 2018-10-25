package com.bank.pojo;

public class BankDepositRate {
    private String updateDate;

    private Double currentRate;

    private Double zczqTmRate;

    private Double zczqHyRate;

    private Double zczqOyRate;

    private Double zczqTwyRate;

    private Double zczqTyRate;

    private Double zczqFyRate;

    private Double otherOyRate;

    private Double otherTyRate;

    private Double otherFyRate;

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }

    public Double getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(Double currentRate) {
        this.currentRate = currentRate;
    }

    public Double getZczqTmRate() {
        return zczqTmRate;
    }

    public void setZczqTmRate(Double zczqTmRate) {
        this.zczqTmRate = zczqTmRate;
    }

    public Double getZczqHyRate() {
        return zczqHyRate;
    }

    public void setZczqHyRate(Double zczqHyRate) {
        this.zczqHyRate = zczqHyRate;
    }

    public Double getZczqOyRate() {
        return zczqOyRate;
    }

    public void setZczqOyRate(Double zczqOyRate) {
        this.zczqOyRate = zczqOyRate;
    }

    public Double getZczqTwyRate() {
        return zczqTwyRate;
    }

    public void setZczqTwyRate(Double zczqTwyRate) {
        this.zczqTwyRate = zczqTwyRate;
    }

    public Double getZczqTyRate() {
        return zczqTyRate;
    }

    public void setZczqTyRate(Double zczqTyRate) {
        this.zczqTyRate = zczqTyRate;
    }

    public Double getZczqFyRate() {
        return zczqFyRate;
    }

    public void setZczqFyRate(Double zczqFyRate) {
        this.zczqFyRate = zczqFyRate;
    }

    public Double getOtherOyRate() {
        return otherOyRate;
    }

    public void setOtherOyRate(Double otherOyRate) {
        this.otherOyRate = otherOyRate;
    }

    public Double getOtherTyRate() {
        return otherTyRate;
    }

    public void setOtherTyRate(Double otherTyRate) {
        this.otherTyRate = otherTyRate;
    }

    public Double getOtherFyRate() {
        return otherFyRate;
    }

    public void setOtherFyRate(Double otherFyRate) {
        this.otherFyRate = otherFyRate;
    }
}