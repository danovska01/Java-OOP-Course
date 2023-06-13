package _01_WorkingWithAbstraction;

import java.util.Scanner;

public class _01_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

            printTop(n);
            
           printBottom(n);




    }

    private static void printBottom(int count) {
        for (int i = 1; i <=count ; i++) {
            printString(i, " ");
            printString(count-i, "* ");
            System.out.println();
        }
    }

    public static void printTop (int rowsCount){
        for (int i = 1; i <=rowsCount ; i++) {
        printString(rowsCount-i, " ");
        printString(i, "* ");
            System.out.println();
        }
    }

    /*private static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("* ");
        }
    }

    private static void printPaddingSpaces(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(" ");
        }
    }*/
    private static void printString (int count, String str){
        for (int j = 0; j < count; j++) {
            System.out.print(str);
        }
    }
}


