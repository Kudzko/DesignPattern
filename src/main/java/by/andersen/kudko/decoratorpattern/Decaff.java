package by.andersen.kudko.decoratorpattern;

public class Decaff extends Beverage {
    public Decaff() {
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
