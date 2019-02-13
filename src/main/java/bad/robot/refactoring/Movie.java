package main.java.bad.robot.refactoring;

/**
 * Movie is just a simple data class.
 */
public class Movie {

    // Movie price code (based on movie type)
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

    // Mutator methods
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
