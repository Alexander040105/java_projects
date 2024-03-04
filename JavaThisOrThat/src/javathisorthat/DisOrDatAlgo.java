package javathisorthat;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Jon
 */
public class DisOrDatAlgo {
    public static void algorithm(){
        Scanner scan  = new Scanner(System.in);

            String item[] = new String[3];
            
            System.out.print("Enter the question : ");
            String prompt = scan.nextLine();

            System.out.print("Enter the first choice : ");
            item[0] = scan.nextLine();

            System.out.print("Enter the second choice : ");
            item[1] = scan.nextLine();

            System.out.print("Enter the correct answer : ");
            item[2] = scan.nextLine();

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(prompt);
            System.out.println(item[0] + " or " + item[1]);

            System.out.print("Type your answer: ");
            String answer = scan.nextLine();
            
            //if answer == [0}
           if(item[2].equalsIgnoreCase(item[0])){

               if (answer.equalsIgnoreCase(item[2])){
                   System.out.println("You are correct!");
                }else{
                   while(!answer.equalsIgnoreCase(item[2])){
                   System.out.print("Type your answer: " );
                   String answer2 = scan.nextLine();
                   if (answer2.equalsIgnoreCase(item[2])){
                       System.out.println("You are correct ");
                       break;   
                   } else{
                       System.out.println("You lose!");
                       break;
                       }
                   }
               }
             System.out.println("Do you want to restart?");
             String dYRestart1 = scan.nextLine();
             if(dYRestart1.equalsIgnoreCase("yes")){
                   restart();
               }
           }
           //if item[1] is the correct answer
           if(item[2].equalsIgnoreCase(item[1])){

               if (answer.equalsIgnoreCase(item[2])){
                   System.out.println("You are correct!");
               } else{
                   while(!answer.equalsIgnoreCase(item[2])){
                   System.out.print("Type your answer: " );
                   String answer2 = scan.nextLine();
                   if (answer2.equalsIgnoreCase(item[2])){
                       System.out.println("You are correct ");
                       break;   
                    } else{
                       System.out.println("You lose!");
                       break;
                           }
                     }
                 }
               
               System.out.println("Do you want to restart?");
               String dYRestart2 = scan.nextLine();
               
               if(dYRestart2.equalsIgnoreCase("yes")){
                   restart();
               }
           }
        }
        
        public static void restart(){
            Scanner scan  = new Scanner(System.in);

            String item[] = new String[3];
            
            System.out.print("Enter the question : ");
            String prompt = scan.nextLine();

            System.out.print("Enter the first choice : ");
            item[0] = scan.nextLine();

            System.out.print("Enter the second choice : ");
            item[1] = scan.nextLine();

            System.out.print("Enter the correct answer : ");
            item[2] = scan.nextLine();

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(prompt);
            System.out.println(item[0] + " or " + item[1]);

            System.out.print("Type your answer: ");
            String answer = scan.nextLine();
            
            //if answer == [0}
           if(item[2].equalsIgnoreCase(item[0])){

               if (answer.equalsIgnoreCase(item[2])){
                   System.out.println("You are correct!");
                }else{
                   while(!answer.equalsIgnoreCase(item[2])){
                   System.out.print("Type your answer: " );
                   String answer2 = scan.nextLine();
                   if (answer2.equalsIgnoreCase(item[2])){
                       System.out.println("You are correct ");
                       break;   
                   } else{
                       System.out.println("You lose!");
                       break;
                       }
                   }
               }
             System.out.println("Do you want to restart?");
             String dYRestart1 = scan.nextLine();
             if(dYRestart1.equalsIgnoreCase("yes")){
                   restart();
               }
           }
           //if item[1] is the correct answer
           if(item[2].equalsIgnoreCase(item[1])){

               if (answer.equalsIgnoreCase(item[2])){
                   System.out.println("You are correct!");
               } else{
                   while(!answer.equalsIgnoreCase(item[2])){
                   System.out.print("Type your answer: " );
                   String answer2 = scan.nextLine();
                   if (answer2.equalsIgnoreCase(item[2])){
                       System.out.println("You are correct ");
                       break;   
                    } else{
                       System.out.println("You lose!");
                       break;
                           }
                     }
                 }
               
               System.out.println("Do you want to restart?");
               String dYRestart2 = scan.nextLine();
               if(dYRestart2.equalsIgnoreCase("yes")){
                   restart();
               }
           }
        }
    }
