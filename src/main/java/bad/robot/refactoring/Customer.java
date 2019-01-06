package main.java.bad.robot.refactoring;

import java.util.ArrayList;
import java.util.List;

/**
 * The customer class represents the customer of the store.
 * It has data and accessors.
 */
public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        String result = "Rental record for " + getName() + "\n";
        for (Rental each : rentals) {
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        for (Rental each : rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental each : rentals) {
            result += each.getCharge();
        }
        return result;
    }

}

// A sample statement:
// Rental Record for Jian-Huan
//      Shawnshank redemption   5.0
//      Star war    5.0
// Amount owed is 10.0
// You earned 10 frequent renter points.