package by.andersen.kudko.simuduck.behavior.implimentation;

import by.andersen.kudko.simuduck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No way! No flying");
    }
}
