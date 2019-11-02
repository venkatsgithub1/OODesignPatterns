package learning.dps.structural.adapter.duckExample;

public class BlackTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("Turkey is trying to fly fly fly!");
    }

    @Override
    public void gobble() {
        System.out.println("Turkey is gobbling");
    }
}
