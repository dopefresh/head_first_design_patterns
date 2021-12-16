package ducks;

import behaviors.fly.FlyBehavior;
import behaviors.quack.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior newFlyBehavior) {
        this.flyBehavior = newFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior newQuackBehavior) {
        this.quackBehavior = newQuackBehavior;
    }
}
