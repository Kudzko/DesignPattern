package by.andersen.kudko.simuduck.behavior.implimentation;

import by.andersen.kudko.simuduck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeack");
    }
}
