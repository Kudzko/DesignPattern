package by.andersen.kudko.simuduck.behavior.implimentation;

import by.andersen.kudko.simuduck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silent quack");
    }
}
