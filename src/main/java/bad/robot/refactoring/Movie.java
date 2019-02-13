package main.java.bad.robot.refactoring;

/**
 * Movie is just a simple data class.
 */
public class Movie {

    // Movie price code
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    // Private fields
    private String title;
    private int priceCode;

    // A class constructor
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    // Accessor methods
    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    // TODO: Replacing the conditional logic on price code with Polymorphism when the story, adding more movie types,
    // comes
    public double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            case REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                result += daysRented * 3;
                break;
            case CHILDREN:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1)
            return 2;
        return 1;
    }

    // Mutator methods
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
