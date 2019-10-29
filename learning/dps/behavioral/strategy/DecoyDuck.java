package learning.dps.behavioral.strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Mute());
    }

    @Override
    public void swim() {
        System.out.println("Decoy duck swimming");
    }

    @Override
    public void display() {
        System.out.println("you're viewing Decoy duck");
    }

    @Override
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
