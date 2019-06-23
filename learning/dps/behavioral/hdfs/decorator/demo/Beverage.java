package learning.dps.behavioral.hdfs.decorator.demo;

public abstract class Beverage {
    // beverage description
    String description = "Unknown beverage";

    // abstract methods
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
