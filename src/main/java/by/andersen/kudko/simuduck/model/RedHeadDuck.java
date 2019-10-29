package by.andersen.kudko.simuduck.model;

import by.andersen.kudko.simuduck.behavior.implimentation.FlyNoWay;
import by.andersen.kudko.simuduck.behavior.implimentation.Squeak;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am real RedHeadDuck");
    }
}
