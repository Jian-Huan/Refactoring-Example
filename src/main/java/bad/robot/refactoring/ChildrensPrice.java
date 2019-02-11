package main.java.bad.robot.refactoring;

public class ChildrensPrice extends Price {
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    public double getCharge(int daysRented){
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}