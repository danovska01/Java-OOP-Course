package ClassBox;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        try {
            ClassBox cb = new ClassBox(length, width, height);
            cb.calculateSurfaceArea();
            cb.calculateLateralSurfaceArea();
            cb.calculateVolume();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
