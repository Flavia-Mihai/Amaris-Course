package folder;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private String buildingName;
    private List<Floor> floors = new ArrayList<>();


    public void addFloorLisandro(Floor floor) {
        floors.add(floor);
    }

    public int getTotalAreaLisandro() {
        int sumAllFloors = 0;
        for (Floor floor : floors) {
            sumAllFloors += floor.getAreaLisandro();
        }
        return sumAllFloors;
    }
}
