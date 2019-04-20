
package com.msarangal.carfaxproject.data.network.model;

import com.squareup.moshi.Json;

public class MonthlyPaymentEstimate {

    @Json(name = "price")
    private double price;
    @Json(name = "downPaymentPercent")
    private double downPaymentPercent;
    @Json(name = "interestRate")
    private double interestRate;
    @Json(name = "termInMonths")
    private int termInMonths;
    @Json(name = "loanAmount")
    private double loanAmount;
    @Json(name = "downPaymentAmount")
    private double downPaymentAmount;
    @Json(name = "monthlyPayment")
    private double monthlyPayment;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDownPaymentPercent() {
        return downPaymentPercent;
    }

    public void setDownPaymentPercent(double downPaymentPercent) {
        this.downPaymentPercent = downPaymentPercent;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(double downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

}
