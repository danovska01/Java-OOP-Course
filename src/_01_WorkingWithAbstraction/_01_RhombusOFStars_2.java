package _01_WorkingWithAbstraction;

import java.util.Scanner;

public class _01_RhombusOFStars_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printRhombus(n);

    }

    public static void printRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }

        for (int i = n - 1; i >= 1; i--) {
            printRow(n, i);
        }
    }

    private static void printRow(int n, int i) {
        printSpaces(n - i);
        printStars(i);
        System.out.println();
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("* ");
        }
    }

}
