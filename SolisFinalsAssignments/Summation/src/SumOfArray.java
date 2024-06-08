import java.util.Scanner;
public class SumOfArray{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array elements: ");
        int numberOfElements = scan.nextInt();

        int[] elements = new int[numberOfElements];
        int result = 0;
        for (int iteration = 0; iteration < numberOfElements; iteration++){
            System.out.print("Number: ");
            elements[numberOfElements - 1] = scan.nextInt();
            System.out.println("num["+ iteration + "]" + elements[iteration]);
            result =  elements[iteration] + result;

        }
    }
}