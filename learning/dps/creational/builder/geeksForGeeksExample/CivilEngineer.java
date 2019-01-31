package learning.dps.creational.builder.geeksForGeeksExample;

import learning.dps.creational.builder.geeksForGeeksExample.builders.HouseBuilder;
import learning.dps.creational.builder.geeksForGeeksExample.housePlan.House;

public class CivilEngineer {
    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        houseBuilder.buildBasement();
        houseBuilder.buildStrucure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }

    public House buildHouse() {
        return houseBuilder.buildHouse();
    }
}
