package learning.dps.creational.builder.listBuilder;

import java.awt.*;
import java.util.List;

public class Architect {
    public static void main(String[] args) {
        List<Room> roomsList = new RoomListBuilder().createRoomsList().addRoom().
                setDimensions(new Dimension(10, 20)).setFloorNumber(2).setNumberOfDoors(2).
                setNumberOfWindows(3).setWallColor(Color.MAGENTA).addToRoomsList().addRoom().
                setDimensions(new Dimension(30, 40)).setWallColor(Color.ORANGE).setNumberOfWindows(4).
                setNumberOfDoors(3).setFloorNumber(1).addToRoomsList().buildList();

        System.out.println(roomsList);
    }
}
