package _02_Abstraction_Ex.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long sum= 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        int startValue = 0;
        fillMatrix(rows, cols, matrix, startValue);

        String command = scanner.nextLine();
        //long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] peterInputCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilInputCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evilRow = evilInputCoordinates[0];
            int evilCol = evilInputCoordinates[1];

            moveEvilCoordinates(matrix, evilRow, evilCol);

            int peterRow = peterInputCoordinates[0];
            int peterCol = peterInputCoordinates[1];

            movePeterCoordinates(matrix, peterRow, peterCol);

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static void movePeterCoordinates(int[][] matrix, int peterRow, int peterCol) {
        while (peterRow >= 0 && peterCol < matrix[1].length) {
            if (peterRow >= 0 && peterRow < matrix.length && peterCol >= 0 && peterCol < matrix[0].length) {
                sum += matrix[peterRow][peterCol];
            }

            peterCol++;
            peterRow--;
        }
    }

    private static void moveEvilCoordinates(int[][] matrix, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow >= 0 && evilRow < matrix.length && evilCol >= 0 && evilCol < matrix[0].length) {
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static void fillMatrix(int rows, int cols, int[][] matrix, int value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
    }
}
