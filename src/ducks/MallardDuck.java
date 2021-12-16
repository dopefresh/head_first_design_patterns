package ducks;

import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }
}
