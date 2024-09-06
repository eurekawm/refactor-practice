package com.refactor.practice.billing;

import com.refactor.practice.Movie;

class NewReleaseMovieMethod extends BillingMethod {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getFee(int daysRented) {
        return daysRented * 3;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
