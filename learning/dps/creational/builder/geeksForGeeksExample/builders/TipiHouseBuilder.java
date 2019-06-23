package learning.dps.creational.builder.geeksForGeeksExample.builders;

import learning.dps.creational.builder.geeksForGeeksExample.housePlan.House;

public class TipiHouseBuilder implements HouseBuilder {

    private House house;

    public TipiHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStrucure() {
        house.setStructure("Wood and Ice");
    }

    @Override
    public void buildRoof() {
        house.setRood("Fire Wood");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wood, caribou and seal skins");
    }

    @Override
    public House buildHouse() {
        return this.house;
    }
}

