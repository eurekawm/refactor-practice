package com.refactor.practice.billing;

import com.refactor.practice.Movie;

public class RegularMovieMethod extends BillingMethod {

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getFee(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
