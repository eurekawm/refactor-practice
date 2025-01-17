package com.refactor.practice;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals;

    public Customer(String name, Vector rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String statement() {
//        double totalAmount = 0;
//        int frequentRenterPoints = 0;
//        Enumeration rentals = this.rentals.elements();
//        String result = "Rental Record for " + getName() + "\n";
//        while (rentals.hasMoreElements()) {
//            double thisAmount = 0D;
//            Rental each = (Rental) rentals.nextElement();
//
//            //determine amounts for each line
//            switch (each.getMovie().getPriceCode()) {
//                case Movie.REGULAR:
//                    thisAmount += 2;
//                    if (each.getDayRented() > 2) {
//                        thisAmount += (each.getDayRented() - 2) * 1.5;
//                    }
//                    break;
//                case Movie.NEW_RELEASE:
//                    thisAmount += each.getDayRented() * 3;
//                    break;
//                case Movie.CHILDRENS:
//                    thisAmount += 1.5;
//                    if (each.getDayRented() > 3) {
//                        thisAmount += (each.getDayRented() - 3) * 1.5;
//                    }
//                    break;
//            }
//            //add frequent renter points
//            frequentRenterPoints++;
//            //add bonus for a two day new release rental
//            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
//                    each.getDayRented() > 1) {
//                frequentRenterPoints++;
//            }
//
//            //show figures for this rental
//            result += "\t" + each.getMovie().getTitle() +
//                    "\t" + String.valueOf(thisAmount) + "\n";
//            totalAmount += thisAmount;
//        }
//        //add footer lines
//        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
//        result += "You earned" + String.valueOf(frequentRenterPoints) +
//                " frequent renter points";
//        return result;
        Enumeration rentalss = rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        while (rentalss.hasMoreElements()) {
            Rental each = (Rental) rentalss.nextElement();
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(each.getCharge()).append("\n");
        }
        //add footer lines
        result.append("Amount owed is ").append(getTotalCharge()).append("\n");
        result.append("You earned ").append(getTotalFrequentRenterPoints()).append(" frequent enter points");
        return result.toString();
    }

    // 这里单独抽取一个方法 就不放在一起了
    public double getTotalCharge() {
        double result = 0;
        Enumeration rentalss = rentals.elements();
        while (rentalss.hasMoreElements()) {
            Rental each = (Rental) rentalss.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    // 同上
    public int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentalss = rentals.elements();
        while (rentalss.hasMoreElements()) {
            Rental each = (Rental) rentalss.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
