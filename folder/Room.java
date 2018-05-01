package folder;

public class Room {

    private int width;
    private int length;
    private int height;


    public Room(int widthConstructor, int lengthConstructor, int heightConstructor) {
        width = widthConstructor;
        length = lengthConstructor;
        height = heightConstructor;
    }

    public int getArea() {
        return width * length * height;
    }
}
