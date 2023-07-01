package _01_Abstraction.pointInRectangle;

public class Rectangle {
    // // Rectangle should hold 2 Points – its bottom left and top right corners.
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public boolean contains(Point pointToCheck) {
//

        return ((pointToCheck.getCoordinatesX() >= getBottomLeft().getCoordinatesX())
                && (pointToCheck.getCoordinatesX() <= getTopRight().getCoordinatesX())
                && (pointToCheck.getCoordinatesY() >= getBottomLeft().getCoordinatesY())
                && (pointToCheck.getCoordinatesY() <= getTopRight().getCoordinatesY()));

    }
}
