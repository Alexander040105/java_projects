import java.util.Scanner;
public class SumOfArray_Solis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements of your Array: ");
        int numberOfElements = scan.nextInt();

        int[] elements = new int[numberOfElements];
        int result = 0;

        for (int iteration = 0; iteration < numberOfElements; iteration++) {
            System.out.print("Number: ");
            elements[iteration] = scan.nextInt();
            result += elements[iteration];
        }
        
        for (int iteration = 0; iteration < numberOfElements; iteration++) {
            System.out.println("num[" + iteration + "] = " + elements[iteration]);
        }

        System.out.println("Sum: " + result);
    }
}