package com.refactor.practice.billing;

import com.refactor.practice.Movie;

public class ChildrenMovieMethod extends BillingMethod {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getFee(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
