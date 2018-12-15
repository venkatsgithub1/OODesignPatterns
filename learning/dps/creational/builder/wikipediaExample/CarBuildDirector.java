package learning.dps.creational.builder.wikipediaExample;

public class CarBuildDirector {
    private CarBuilder carBuilder;

    public CarBuildDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct() {
        return this.carBuilder.setColor("blue").setWheels(4).build();
    }

    public static void main(String[] args) {
        final CarBuilderImpl builder = new CarBuilderImpl();
        final CarBuildDirector director = new CarBuildDirector(builder);
        System.out.println(director.construct());
    }
}
