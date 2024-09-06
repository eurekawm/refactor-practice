package com.refactor.practice.billing;

/**
 * 这是一个计费方式的抽象类 子类有具体的实现
 */
public abstract class BillingMethod {
    // 计费方式code
    public abstract int getPriceCode();

    // 计算费用
    public abstract double getFee(int daysRented);

    // 获取积分的方式
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
