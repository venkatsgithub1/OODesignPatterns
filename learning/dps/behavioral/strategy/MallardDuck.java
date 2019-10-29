package learning.dps.behavioral.strategy;

public class MallardDuck extends Duck implements Flyable, Quackable {

    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void swim() {
        System.out.println("Mallard duck swimming");
    }

    @Override
    public void display() {
        System.out.println("you're viewing mallard duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck flying");
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
