package _01_Abstraction.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //Create a class Point and a class Rectangle. The Point should hold coordinates X and Y and the
        // Rectangle should hold 2 Points – its bottom left and top right corners.

        String rectangleCoordinates = scanner.nextLine();
        int[] input = Arrays.stream(rectangleCoordinates.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Point bottomLeft= new Point(input[0], input[1]);
        Point topRight= new Point(input[2], input[3]);

        Rectangle rectangle = new Rectangle(bottomLeft,topRight);

        int numberOfPointsToCheck = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPointsToCheck; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);

            System.out.println(rectangle.contains(point));
        }



    }
}
