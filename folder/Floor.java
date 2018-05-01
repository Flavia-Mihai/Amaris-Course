package folder;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    private Building building;
    private List<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public int getArea() {
        int sumAreaRooms = 0;
        for (Room room : roomList) {
            sumAreaRooms += room.getArea();
        }
        return sumAreaRooms;
    }
}
