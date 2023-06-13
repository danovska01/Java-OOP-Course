package _01_WorkingWithAbstraction;

public class Rectangle {
    // // Rectangle should hold 2 Points – its bottom left and top right corners.
    private int coordinatesX;
    private int coordinatesY;

    public Rectangle(int i, int i1, int i2, int i3) {

    }

    public void Point (int coordinateX, int coordinatesY) {
        this.coordinatesX = coordinateX;
        this.coordinatesY = coordinatesY;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public boolean contains(Point point) {
        return false;
    }
}
