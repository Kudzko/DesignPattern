package by.andersen.kudko.decoratorpattern.controller;

import by.andersen.kudko.decoratorpattern.Beverage;
import by.andersen.kudko.decoratorpattern.DarkRoast;
import by.andersen.kudko.decoratorpattern.Espresso;
import by.andersen.kudko.decoratorpattern.decorator.Mocha;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + ", cost:  " + beverage.cost() + "$");

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()
                + ", cost:  " + beverage2.cost() + "$");

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Mocha(beverage3);

        System.out.println(beverage3.getDescription()
                + ", cost:  " + beverage3.cost() + "$");
    }
}
