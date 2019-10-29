package learning.dps.behavioral.strategy;

public class RedheadDuck extends Duck implements Flyable, Quackable {

    public RedheadDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void swim() {
        System.out.println("Red head duck swimming");
    }

    @Override
    public void display() {
        System.out.println("you're viewing redhead duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Redhead duck flying");
    }

    @Override
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
