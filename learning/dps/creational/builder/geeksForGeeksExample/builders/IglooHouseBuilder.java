package learning.dps.creational.builder.geeksForGeeksExample.builders;

import learning.dps.creational.builder.geeksForGeeksExample.housePlan.House;

public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice bars");
    }

    @Override
    public void buildStrucure() {
        house.setStructure("Ice blocks");
    }

    @Override
    public void buildRoof() {
        house.setRood("Ice carvings");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice Dome");
    }

    @Override
    public House buildHouse() {
        return this.house;
    }
}
