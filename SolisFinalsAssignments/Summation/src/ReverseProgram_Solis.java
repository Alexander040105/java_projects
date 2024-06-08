import java.util.Scanner;

public class ReverseProgram_Solis {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Reverse Program");
        System.out.println("[1] While");
        System.out.println("[2] Do While");
        System.out.println("[3] For");
        System.out.print("Enter a number: ");
        int menuNumber = scan.nextInt();

        System.out.print("Enter the Starting Number: ");
        int startingNumber = scan.nextInt();
        System.out.print("Enter the Ending Number: ");
        int endingNumber = scan.nextInt();
        int iteration = startingNumber;
        if (menuNumber == 1){
            while(iteration >= endingNumber){
                System.out.println(iteration);
                iteration--;
            }
        } else if (menuNumber == 2){
            do{
                System.out.println(iteration);
                iteration--;
            }while(iteration >= endingNumber);
        } else if (menuNumber == 3){
            for(iteration = startingNumber; iteration >= endingNumber; iteration--){
                System.out.println(iteration);
            }
        }
        
    }
}
