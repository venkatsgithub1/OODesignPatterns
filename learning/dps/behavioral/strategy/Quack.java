package learning.dps.behavioral.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck goes quack!");
    }
}
