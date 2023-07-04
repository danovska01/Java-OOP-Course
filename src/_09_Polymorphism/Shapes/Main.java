package _09_Polymorphism.Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.12);
        Rectangle rectangle = new Rectangle(2d, 3d);

        circle.calculateArea();
        circle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
