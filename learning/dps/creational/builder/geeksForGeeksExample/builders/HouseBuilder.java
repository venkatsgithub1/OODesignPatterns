package learning.dps.creational.builder.geeksForGeeksExample.builders;

import learning.dps.creational.builder.geeksForGeeksExample.housePlan.House;

public interface HouseBuilder {
    public void buildBasement();
    public void buildStrucure();
    public void buildRoof();
    public void buildInterior();
    public House buildHouse();
}
