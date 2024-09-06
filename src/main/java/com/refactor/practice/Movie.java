package com.refactor.practice;

import com.refactor.practice.billing.BillingMethod;
import com.refactor.practice.billing.BillingStrategy;

public class Movie {

    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    private String title;
    private int priceCode;
    private BillingMethod billingMethod;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        BillingMethod billingMethod = BillingStrategy.getBillingMethod(priceCode);
        if (billingMethod == null) {
            throw new RuntimeException("there is no this mothod");
        }
        this.billingMethod = billingMethod;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }


    public double getCharge(int daysRented) {
        return billingMethod.getFee(daysRented);
    }


    public int getFrequentRenterPoints(int daysRented) {
        return billingMethod.getFrequentRenterPoints(daysRented);
    }
}