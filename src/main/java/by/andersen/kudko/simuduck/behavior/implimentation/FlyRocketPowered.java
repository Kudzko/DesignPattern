package by.andersen.kudko.simuduck.behavior.implimentation;

import by.andersen.kudko.simuduck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Rocket flying");
    }
}
