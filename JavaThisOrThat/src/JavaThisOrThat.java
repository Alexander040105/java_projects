
import java.util.Scanner;
          
public class JavaThisOrThat {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        
        String item[] = new String[2];
        
        System.out.println("Enter the first choice : ");
        item[0] = scan.nextLine();
        
        System.out.println("Enter the second choice : ");
        item[1] = scan.nextLine();
        
        System.out.println("Enter the correct answer : ");
        item[2] = scan.nextLine();
        
        System.out.println("Type your answer: ");
        String answer = scan.nextLine();
        //System.out.println("Type your answer : ");
        //String answer = scan.nextLine();
        
       /* if(answer.equalsIgnoreCase(item[0])){
            if(item[0].equalsIgnoreCase(item[2])){
                System.out.println("Your answer is correct!");
            }
            else{
                System.out.println("Your answer is wrong!");
            }
        } else if(answer.equalsIgnoreCase(item[1])){
            if(item[1].equalsIgnoreCase(item[2])){
                System.out.println("Your answer is correct!");
            }
            else{
                System.out.println("Your answer is wrong");
            }
        }*/
       
       if(item[2].equalsIgnoreCase(item[0])){
               
           while(!answer.equalsIgnoreCase(item[2])){
               System.out.print("Type your answer: " + answer);
               if (answer.equalsIgnoreCase(item[0])){
                   System.out.println("You are correct ");
                   break;   
               }
           }
       }
    }
    
}
