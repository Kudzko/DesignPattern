package by.andersen.kudko.simuduck.model;

import by.andersen.kudko.simuduck.behavior.implimentation.FlyWithWings;
import by.andersen.kudko.simuduck.behavior.implimentation.Quack;

public class MalladDuck extends Duck {
    public MalladDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am real MalladDuck!");
    }
}
