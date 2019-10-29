package by.andersen.kudko.simuduck.model;

import by.andersen.kudko.simuduck.behavior.FlyBehavior;
import by.andersen.kudko.simuduck.behavior.QuackBehavior;

public abstract class Duck {
    private  String name;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void swim(){
        System.out.println("all ducks swim!");
    }


    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
