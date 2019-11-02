package learning.dps.structural.adapter.duckExample;

public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("Mallard Duck flies");
    }

    @Override
    public void quack() {
        System.out.println("Mallard Duck quacks");
    }
}
