package _14_Exceptions;

import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        calculateSquareRoot();
    }

    public static void calculateSquareRoot() {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException("Invalid number");
            }

            double squareRoot = Math.sqrt(number);
            System.out.printf("%.2f%n", squareRoot);
        } catch (Exception e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }

        scanner.close();
    }
}
