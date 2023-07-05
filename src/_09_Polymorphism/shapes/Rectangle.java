package _09_Polymorphism.shapes;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
    this.height=height;
    this.width=width;
    }


    @Override
    void calculatePerimeter() {
        Double perimeter = 2 * getHeight() * getWidth();
        setPerimeter(perimeter);
    }

    @Override
    void calculateArea() {
        Double area=  getHeight() * getWidth();
        setArea(area);
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
