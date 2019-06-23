package learning.dps.creational.builder.geeksForGeeksExample;

import learning.dps.creational.builder.geeksForGeeksExample.builders.IglooHouseBuilder;

public class TestClass {
    public static void main(String[] args) {
        IglooHouseBuilder iglooHouseBuilder = new IglooHouseBuilder();

        CivilEngineer engineer = new CivilEngineer(iglooHouseBuilder);

        engineer.constructHouse();

        System.out.println(engineer.buildHouse());
    }
}
