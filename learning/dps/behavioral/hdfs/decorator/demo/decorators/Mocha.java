package learning.dps.behavioral.hdfs.decorator.demo.decorators;

import learning.dps.behavioral.hdfs.decorator.demo.Beverage;

public class Mocha extends CondimentDecorator {

    // class has a beverage
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
