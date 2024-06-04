import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input how many numbers you would like to add: ");
        int numberPrompt = scan.nextInt();
        int result = 0;

        for (int iteration = 0; iteration < numberPrompt; iteration++) {
            System.out.print("Please enter a value: ");
            int additionNumber = scan.nextInt();
            result = additionNumber + result;
        }

        System.out.println("The sum of the " + numberPrompt + " is " + result);
    }
}
