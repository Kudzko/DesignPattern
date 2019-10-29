package by.andersen.kudko.simuduck.model;

import by.andersen.kudko.simuduck.behavior.implimentation.FlyNoWay;
import by.andersen.kudko.simuduck.behavior.implimentation.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am real Model Duck. I am Terminator");
    }
}
