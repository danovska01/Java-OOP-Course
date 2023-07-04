package _09_Polymorphism.Shapes;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius) {
        this.radius=radius;
    }

    @Override
    void calculatePerimeter() {
        Double perimeter= 2*Math.PI*getRadius();
        setPerimeter(perimeter);
    }

    @Override
    void calculateArea() {
        Double area= Math.PI*radius*getRadius();
        setArea(area);
    }

    public final Double getRadius() {
        return radius;
    }
}
