package _01_WorkingWithAbstraction;

public class Point {
    private int coordinatesX;
    private int coordinatesY;

    public Point(int coordinateX, int coordinatesY) {
        this.coordinatesX = coordinateX;
        this.coordinatesY = coordinatesY;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }
}