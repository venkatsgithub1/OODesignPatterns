package learning.dps.creational.builder;

import java.awt.*;

public class Architect {
    public static void main(String[] args) {
        Bedroom bedroom = new BedroomBuilder().setDimensions(new Dimension(20, 10)).
                setCeilingHeight(10).setFloorNumber(3).setWallColor(Color.YELLOW).setNumberOfWindows(1).
                setNumberOfDoors(2).setDouble(true).setHasEnsuite(false).build();

        System.out.println(bedroom);
    }
}
