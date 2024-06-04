package SolisFinals;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input how many numbers you would like to add: ");
        int numberPrompt = scan.nextInt();
        int result = 0;

        for (int i = 0; i < numberPrompt; i++) {
            System.out.print("Please enter a value: ");
            int additionNumber = scan.nextInt();
            result = additionNumber + additionNumber;
        }

        System.out.println("The sum of the " + numberPrompt + " is " + result);
    }
}
