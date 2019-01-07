package main.java.bad.robot.refactoring;

public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double getCharge(int daysRented) {
        System.out.println("new releases movie getCharge");
        return daysRented * 3;
    }
}
