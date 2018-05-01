package folder;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private String buildingName;
    private List<Floor> floors = new ArrayList<>();


    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public int getTotalArea() {
        int sumAllFloors = 0;
        for (Floor floor : floors) {
            sumAllFloors += floor.getArea();
        }
        return sumAllFloors;
    }
}
