package learning.dps.creational.builder.wikipediaExample;

public class Car {

    private int wheels;
    private String color;

    public Car() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "[Car: (color:"+this.color+", wheels:"+this.wheels+")]";
    }
}
