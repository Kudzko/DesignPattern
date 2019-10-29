package by.andersen.kudko.decoratorpattern;

public class DarkRoast  extends  Beverage{
    public DarkRoast() {
        description = "Dark roasted";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
