package main.java.bad.robot.refactoring;

public class ChildrenMovie extends Movie {

    public ChildrenMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double getCharge(int daysRented) {
        System.out.println("children movie getCharge");
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
