package com.refactor.practice;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }


    public double getCharge() {
        return movie.getCharge(this.dayRented);
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(this.dayRented);

    }
}