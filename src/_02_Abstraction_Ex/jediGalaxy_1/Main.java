package _02_Abstraction_Ex.jediGalaxy_1;

import java.util.Scanner;

public class Main {
    static int rowPeter = 0;
    static int colPeter = 0;
    static int peterPoints = 0;
    static int rowEvil = 0;
    static int colEvil = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputSize = scanner.nextLine().split(" ");
        int rowsCount = Integer.parseInt(inputSize[0]);
        int colsCount = Integer.parseInt(inputSize[1]);
        int[][] matrix = new int[rowsCount][colsCount];
        int startValue = 0;

        fillMatrix(rowsCount, colsCount, matrix, startValue);


        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            String[] inputPeter = command.split("\\s+");
            String[] inputEvil = scanner.nextLine().split("\\s+");

            initialiseCoordinates(inputPeter, inputEvil);
            changeCoordinates();

            while (checkIndexesIfInsideMatrix(rowsCount, colsCount)) {
                if (rowPeter == rowEvil && colPeter == colEvil) {
                    changeCoordinates();
                    continue;
                }
                peterPoints += matrix[rowPeter][colPeter];
                changeCoordinates();
            }
            command = scanner.nextLine();
        }
        System.out.println(peterPoints);
    }

    private static boolean checkIndexesIfInsideMatrix(int rowsCount, int colsCount) {
        return rowPeter <= rowsCount && rowEvil <= rowsCount && colPeter <= colsCount && colEvil <= colsCount && rowPeter >= 0 && rowEvil >= 0 && colPeter >= 0 && colEvil >= 0;
    }

    private static void initialiseCoordinates(String[] inputPeter, String[] inputEvil) {
        rowPeter = Integer.parseInt(inputPeter[0]);
        colPeter = Integer.parseInt(inputPeter[1]);
        rowEvil = Integer.parseInt(inputEvil[0]);
        colEvil = Integer.parseInt(inputEvil[1]);
    }

    private static void changeCoordinates() {
        rowPeter--;
        colPeter++;
        rowEvil--;
        colEvil--;
    }

    private static void fillMatrix(int rows, int cols, int[][] matrix, int startNumber) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = startNumber;
                startNumber++;
            }

        }
    }
}
