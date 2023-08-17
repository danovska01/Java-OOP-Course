package _14_Exceptions;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] range = scanner.nextLine().split(" ");

        int startOfRange = Integer.parseInt(range[0]);
        int endOfRange = Integer.parseInt(range[1]);

        System.out.printf("Range: [%d...%d]\n", startOfRange, endOfRange);
        int validNumber = readValidNumber(scanner, startOfRange, endOfRange);
        System.out.println("Valid number: " + validNumber);


    }

    private static int readValidNumber(Scanner scanner, int startOfRange, int endOfRange) {

        for(;;){
            String input = scanner.nextLine();
            try{
                int numberFromInput = Integer.parseInt(input);
                if(numberFromInput>=startOfRange && numberFromInput <=endOfRange){
                    return numberFromInput;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid number: "+ input);
            }
        }
    }
}
