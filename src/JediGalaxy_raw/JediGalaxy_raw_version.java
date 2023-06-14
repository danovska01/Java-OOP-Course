package JediGalaxy_raw;

import java.util.Scanner;

public class JediGalaxy_raw_version {
    static int rowPeter = 0;
    static int colPeter = 0;
    static int peterPoints = 0;
    static int rowEvil = 0;
    static int colEvil = 0;
    static int evilPoints = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputSize = scanner.nextLine().split(" ");
        int r = Integer.parseInt(inputSize[0]);
        int c = Integer.parseInt(inputSize[1]);
        int[][] matrix = new int[r][c];
        int num = 0;

        fillMatrix(r, c, matrix, num);


        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            String[] inputPeter = command.split(" ");
            String[] inputEvil = scanner.nextLine().split(" ");

            initialisePosition(inputPeter, inputEvil);

            changePosition();

            while (rowPeter<=r && rowEvil<=r && colPeter<=c && colEvil<=c && rowPeter>=0 && rowEvil>=0 && colPeter>=0 && colEvil>=0) {

                if (rowPeter == rowEvil && colPeter == colEvil) {
                    evilPoints += matrix[rowEvil][colEvil];
                    changePosition();
                    continue;
                }
                peterPoints += matrix[rowPeter][colPeter];
                evilPoints += matrix[rowEvil][colEvil];

                changePosition();

            }



            command = scanner.nextLine();
        }

        System.out.println(peterPoints);
    }

    private static void initialisePosition(String[] inputPeter, String[] inputEvil) {
        rowPeter = Integer.parseInt(inputPeter[0]);
        colPeter = Integer.parseInt(inputPeter[1]);
        rowEvil = Integer.parseInt(inputEvil[0]);
        colEvil = Integer.parseInt(inputEvil[1]);
    }

    private static void changePosition() {
        rowPeter--;
        colPeter++;
        rowEvil--;
        colEvil--;
    }

    private static void fillMatrix(int rows, int cols, int[][] matrix, int number) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = number;
                number++;
            }

        }
    }
}
