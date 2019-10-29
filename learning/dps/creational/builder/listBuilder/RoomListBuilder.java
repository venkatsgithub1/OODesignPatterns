package learning.dps.creational.builder.listBuilder;

import java.util.ArrayList;
import java.util.List;

public class RoomListBuilder {
    private List<Room> roomsList;

    public RoomListBuilder createRoomsList() {
        roomsList = new ArrayList<>();
        return this;
    }

    public RoomBuilder addRoom() {
        return new RoomBuilder(this);
    }

    public RoomBuilder addRoom(Room room) {
        roomsList.add(room);
        return new RoomBuilder(this);
    }

    public List<Room> buildList() {
        return roomsList;
    }
}
