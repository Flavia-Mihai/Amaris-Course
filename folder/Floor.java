package folder;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    private Building building;
    private List<Room> roomList = new ArrayList<>();

    public void addRoomLisandro(Room room) {
        roomList.add(room);
    }

    public int getAreaLisandro() {
        int sumAreaRooms = 0;
        for (Room room : roomList) {
            sumAreaRooms += room.getAreaLisandro();
        }
        return sumAreaRooms;
    }
}
