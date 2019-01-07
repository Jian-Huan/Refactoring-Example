package main.java.bad.robot.refactoring;

/**
 * Movie is just a simple data class.
 */
public class RegularMovie extends Movie {

    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double getCharge(int daysRented) {
        System.out.println("regular movie getCharge");
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
