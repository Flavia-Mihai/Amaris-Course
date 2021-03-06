package folder;

public class Main {

    public static void main(String[] args) {
        Room roomOne = new Room(10, 10, 10);
        Room roomTwo = new Room(2, 2, 2);

        Floor floorOne = new Floor();
        floorOne.addRoomLisandro(roomTwo);
        floorOne.addRoomLisandro(roomOne);

        Room roomThree = new Room(1, 1, 1);
        Floor floorTwo = new Floor();
        floorTwo.addRoomLisandro(roomThree);

        Building building = new Building();
        building.addFloorLisandro(floorOne);
        building.addFloorLisandro(floorTwo);

        System.out.println("Total area of building " + building.getTotalAreaLisandro());
    }

}
