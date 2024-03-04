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
public class WhoIsThatPokemon {
    public void guessThePokemon(){
        Scanner scan = new Scanner(System.in);
        
        //using an 2D array to assign the answers onto specific questions
        String pokemonQAndA[][] = new String[2][12];
        pokemonQAndA[0][0] = "It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.";
        pokemonQAndA[0][1] = "Charmander";
        pokemonQAndA[0][2] = "Squirtle";
        pokemonQAndA[0][3] = "Bulbasaur";
        pokemonQAndA[0][4] = "Litten";
        
        //second question
        pokemonQAndA[1][0] = "It lives close to water. Its long tail is ridged with a fin, which is often mistaken for a mermaid’s.";
        pokemonQAndA[1][1] = "Gyarados";
        pokemonQAndA[1][2] = "Dewgong";
        pokemonQAndA[1][3] = "Seaking";
        pokemonQAndA[1][4] = "Vaporeon";
        
        //lives system
        int playerOneScore = 0;
        int i;
        int lives = 3;
        
        for(i = 0; i < lives; i++){
            System.out.println("Choose the right pokemon based on the Pokedex Entry");
            System.out.println("1." + pokemonQAndA[0][0]);
            System.out.println("");
            System.out.println("Here are the choices");
            System.out.println(pokemonQAndA[0][1]);
            System.out.println(pokemonQAndA[0][2]);
            System.out.println(pokemonQAndA[0][3]);
            System.out.println(pokemonQAndA[0][4]);
            
            //player placing an answer
            System.out.print("Answer: ");
            pokemonQAndA[0][5] = scan.nextLine();
            
            if(pokemonQAndA[0][5].equalsIgnoreCase(pokemonQAndA[0][1])){
                playerOneScore++;
                System.out.println("You are a Pokemon Geek! Please touch some grass! You're score is " + playerOneScore);
                System.out.println("");
                break;
            } else{
                System.out.println("You are incorrect. Please try again!");
            }
        }
        
        for(i = 0; i < lives; i++){
            System.out.println("Choose the right pokemon based on the Pokedex Entry");
            System.out.println("2." + pokemonQAndA[1][0]);
            System.out.println("");
            System.out.println("Here are the choices");
            System.out.println(pokemonQAndA[1][1]);
            System.out.println(pokemonQAndA[1][2]);
            System.out.println(pokemonQAndA[1][3]);
            System.out.println(pokemonQAndA[1][4]);
            
            //player placing an answer
            System.out.print("Answer: ");
            pokemonQAndA[1][5] = scan.nextLine();
            
            if(pokemonQAndA[1][5].equalsIgnoreCase(pokemonQAndA[1][4])){
                playerOneScore++;
                System.out.println("You are a Pokemon Geek! Please touch some more grass! You're score is " + playerOneScore);
                System.out.println("");
                break;
            } else{
                System.out.println("You are incorrect. Please try again!");
            }
        }
    }
}
