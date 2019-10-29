package learning.dps.behavioral.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck can fly!");
    }
}
