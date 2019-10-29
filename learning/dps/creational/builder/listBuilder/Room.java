package learning.dps.creational.builder.listBuilder;

import java.awt.*;
import java.util.Objects;

public class Room {
    private Dimension dimensions;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;

    public Room(Dimension dimensions, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors) {
        this.dimensions = dimensions;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }

    public Dimension getDimensions() {
        return dimensions;
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

    @Override
    public String toString() {
        return "Room{" +
                "dimensions=" + dimensions +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return floorNumber == room.floorNumber &&
                numberOfWindows == room.numberOfWindows &&
                numberOfDoors == room.numberOfDoors &&
                Objects.equals(dimensions, room.dimensions) &&
                Objects.equals(wallColor, room.wallColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, floorNumber, wallColor, numberOfWindows, numberOfDoors);
    }
}
