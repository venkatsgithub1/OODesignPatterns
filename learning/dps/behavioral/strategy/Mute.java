package learning.dps.behavioral.strategy;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is silent!");
    }
}
