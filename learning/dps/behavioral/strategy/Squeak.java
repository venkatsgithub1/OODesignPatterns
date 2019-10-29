package learning.dps.behavioral.strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck goes squeak!");
    }
}
