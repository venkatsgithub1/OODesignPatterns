package learning.dps.creational.builder;

import java.awt.*;

public class BedroomBuilder {
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public BedroomBuilder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public BedroomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public BedroomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public BedroomBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public BedroomBuilder setDouble(boolean aDouble) {
        isDouble = aDouble;
        return this;
    }

    public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
        return this;
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

    public Bedroom build() {
        return new Bedroom(dimensions, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, isDouble, hasEnsuite);
    }
}
