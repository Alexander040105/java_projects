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
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String gameModeChoices[] = new String[3];
        gameModeChoices[0] = "Trivia Questions";
        gameModeChoices[1] = "Dis or Dat";
        gameModeChoices[2] = "Who's that Pokemon";
        int i;
        
        TriviaAbstract trivia = new TriviaQuestion();
        WhoIsThatPokemon pokemonQuiz = new WhoIsThatPokemon();
        DisOrDat deez = new DisOrDat();
         
        for(i = 0; i<99; i++){
            System.out.println("Choose a game mode: ");
            System.out.println("Trivia Questions");
            System.out.println("Dis or Dat");
            System.out.println("Who's that Pokemon");

            System.out.println("Please enter the game mode that you want to play: ");
            String gameMode = scan.nextLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");    
            
            if(gameMode.equalsIgnoreCase(gameModeChoices[0])){
            trivia.trivQuestion();
            break;
            }else if(gameMode.equalsIgnoreCase(gameModeChoices[2])){
                pokemonQuiz.guessThePokemon();
                break;
            }else if(gameMode.equalsIgnoreCase(gameModeChoices[1])){
                deez.disOrDat();
                break;
            }else if(!gameMode.equals(gameModeChoices[1])){
                System.out.println("Please enter among the choices");
            }
        }
    }
}
