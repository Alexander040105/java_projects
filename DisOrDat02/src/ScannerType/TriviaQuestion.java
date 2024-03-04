/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScannerType;

import java.util.Scanner;

/**
 *
 * @author Alexander Jon
 */
public class TriviaQuestion extends TriviaAbstract {
    public void trivQuestion(){
        Scanner scan = new Scanner(System.in);
        int playerOneScore = 0;
        String questionOne[] = new String[4];
        questionOne[0] = "The group of birds are called `flock` ";
        questionOne[1] = "False";
        questionOne[2] = "True";
        String retry[] = new String[2];
        String answerRetry;
        retry[0] = "Yes";
        retry[1] = "No";
        int i;
        int lives = 3;
        
        
        
        //checking if the player is correct per question there are 3 chances to a question
        for(i = 0; i < lives; i++){
            System.out.println("True or False");
            System.out.println("Question Number One " + questionOne[0]);

            //Player placing an answer
            System.out.println("Answer: ");
            questionOne[3] = scan.nextLine();
            
            
            if(questionOne[3].equalsIgnoreCase(questionOne[2])){
                playerOneScore++;
                System.out.println("You are correct! You're score is " + playerOneScore);
                break;
            }else if(questionOne[3].equalsIgnoreCase(questionOne[1]) && i != lives - 1){
                System.out.println("You are incorrect!");               
            }else if(questionOne[3].equalsIgnoreCase(questionOne[1]) && i != lives - 1){
                System.out.println("You are incorrect!");               
            }else if(questionOne[3].equalsIgnoreCase(questionOne[1]) && i == lives - 1){
                System.out.println("You Failed");               
            }
            
            
        }
        
        
        
        /*(System.out.println("Do you want to retry?");
        answer = scan.nextLine();  
        if(answer.equalsIgnoreCase(retry[0])){
                
            }
        else if(answer.equalsIgnoreCase(retry[1])){
                
            }*/
    }
}
