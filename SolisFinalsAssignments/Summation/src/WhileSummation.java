import java.util.Scanner;
public class WhileSummation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numberPrompt = scan.nextInt();
        int result = 0;
        int iteration = 0;
        while (iteration < numberPrompt){
            System.out.print("Please enter a value: ");
            int additionNumber = scan.nextInt();
            result = additionNumber + result;
            iteration++;
        }

        System.out.println("The sum of the " + numberPrompt + " is " + result);
    }
}
