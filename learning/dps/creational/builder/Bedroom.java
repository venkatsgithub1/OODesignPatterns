package learning.dps.creational.builder;

import java.awt.*;
import java.util.Objects;

public class Bedroom {
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public int getCeilingHeight() {
        return ceilingHeight;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Color getWallColor() {
        return wallColor;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isDouble() {
        return isDouble;
    }

    public boolean isHasEnsuite() {
        return hasEnsuite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bedroom bedroom = (Bedroom) o;
        return ceilingHeight == bedroom.ceilingHeight &&
                floorNumber == bedroom.floorNumber &&
                numberOfWindows == bedroom.numberOfWindows &&
                numberOfDoors == bedroom.numberOfDoors &&
                isDouble == bedroom.isDouble &&
                hasEnsuite == bedroom.hasEnsuite &&
                Objects.equals(dimensions, bedroom.dimensions) &&
                Objects.equals(wallColor, bedroom.wallColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, isDouble, hasEnsuite);
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "dimensions=" + dimensions +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                ", isDouble=" + isDouble +
                ", hasEnsuite=" + hasEnsuite +
                '}';
    }
}
