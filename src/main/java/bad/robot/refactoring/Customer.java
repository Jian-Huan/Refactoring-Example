package main.java.bad.robot.refactoring;

import java.util.ArrayList;
import java.util.List;

/**
 * The customer class represents the customer of the store.
 * It has data and accessors.
 */
public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

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
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental record for " + getName() + "\n";
        for (Rental each : rentals) {
            double thisAmount = 0;
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDREN:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1)
                frequentRenterPoints++;

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";

            totalAmount += thisAmount;
        }

        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";

        return result;
    }
}

// A sample statement:
// Rental Record for Jian-Huan
//      Shawnshank redemption   5.0
//      Star war    5.0
// Amount owed is 10.0
// You earned 10 frequent renter points.



//public String htmlStatement() {
//    double totalAmount = 0;
//    int frequentRenterPoints = 0;
//
//    String result = "<h1>Rental record for <b>" + getName() + "</b></h1>\n";
//    for (Rental each : rentals) {
//        double thisAmount = 0;
//        switch (each.getMovie().getPriceCode()) {
//            case Movie.REGULAR:
//                thisAmount += 2;
//                if (each.getDaysRented() > 2)
//                    thisAmount += (each.getDaysRented() - 2) * 1.5;
//                break;
//            case Movie.NEW_RELEASE:
//                thisAmount += each.getDaysRented() * 3;
//                break;
//            case Movie.CHILDREN:
//                thisAmount += 1.5;
//                if (each.getDaysRented() > 3)
//                    thisAmount += (each.getDaysRented() - 3) * 1.5;
//                break;
//        }
//
//        // add frequent renter points
//        frequentRenterPoints++;
//        // add bonus for a two day new release rental
//        if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1)
//            frequentRenterPoints++;
//
//        // show figures for this rental
//        result += "<p>" + each.getMovie().getTitle() + "\t" + thisAmount + "</p>\n";
//
//        totalAmount += thisAmount;
//    }
//
//    result += "<p>Amount owed is <b>" + totalAmount + "</b></p>\n";
//    result += "<p>You earned <b>" + frequentRenterPoints + " frequent renter points</b></p>";
//
//    return result;
//}







//public String htmlStatement() {
//    String result = "<h1>Rental record for <b>" + getName() + "</b></h1>\n";
//
//    for (Rental rental : rentals) {
//        result += "<p>" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "</p>\n";
//    }
//
//    result += "<p>Amount owed is <b>" + getTotalCharge() + "</b></p>\n";
//    result += "<p>You earned <b>" + getTotalFrequentRenterPoints() + " frequent renter points</b></p>";
//
//    return result;
//}