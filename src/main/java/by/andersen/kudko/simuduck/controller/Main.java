package by.andersen.kudko.simuduck.controller;

import by.andersen.kudko.simuduck.behavior.implimentation.FlyRocketPowered;
import by.andersen.kudko.simuduck.model.Duck;
import by.andersen.kudko.simuduck.model.ModelDuck;
import by.andersen.kudko.simuduck.model.RedHeadDuck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();

        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
        duck.performQuack();
        duck.display();



    }
}
