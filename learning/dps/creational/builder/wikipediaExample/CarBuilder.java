package learning.dps.creational.builder.wikipediaExample;

public interface CarBuilder {
    Car build();

    CarBuilder setColor(String color);

    CarBuilder setWheels(int wheels);
}
