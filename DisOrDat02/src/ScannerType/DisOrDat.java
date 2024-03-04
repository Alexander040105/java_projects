/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScannerType;

import java.util.Scanner;

/**
 *
 * @author 63947
 */
public class DisOrDat extends DisOrDatAbstract{
    public void disOrDat(){
        Scanner scan = new Scanner(System.in);
        String qAndA[] = new String[4];  
        String answerP2;
        int i;
        int lives = 3;
        
        System.out.println("Welcome to Dis or Dat Player One!!");
        System.out.println("Dis or Dat is a Pass and Play game for two Players");
        System.out.println("Where Player one is going to give questions while Player two will be the one to answer.");
        System.out.println("");
        System.out.println("Enter your Question for Player Two");
        qAndA[0] = scan.nextLine();
        
        System.out.println("");
        System.out.println("Enter the option for Dis: ");
        qAndA[1] = scan.nextLine();
        System.out.println("");        
        System.out.println("Enter the option for Dat: "); 
        qAndA[2] = scan.nextLine();
        System.out.println("");
        System.out.println("Enter the correct answer for this question: ");
        qAndA[3] = scan.nextLine();
        
        //player 2 prompt   
        for(i = 0; i < lives; i++){
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(qAndA[0]);
            System.out.println(qAndA[1] + " or " + qAndA[2]);
            System.out.println("Please enter your answer here: ");
            answerP2 = scan.nextLine(); 
            if(qAndA[3].equalsIgnoreCase(answerP2)){
             System.out.println("You are correct!");
             break;
            }else if(!answerP2.equals(qAndA[3]) && i != lives - 1){
                 System.out.println("You are incorrect!");
            }else if(!answerP2.equals(qAndA[3]) && i != lives - 1){
                 System.out.println("You are incorrect!");
            }else if(!answerP2.equals(qAndA[3]) && i != lives - 1){
                 System.out.println("You failed!");
            }    
        }   
    }
}
