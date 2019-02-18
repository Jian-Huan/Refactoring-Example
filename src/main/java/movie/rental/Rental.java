package main.java.movie.rental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    // Private fields
    private Movie movie;
    private int daysRented;

    // A class constructor
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    // Accessor methods
    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
