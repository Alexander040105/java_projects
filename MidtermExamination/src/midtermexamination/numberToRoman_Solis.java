/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamination;

import java.util.Scanner;

/**
 *
 * @author Alexander Jon
 */
public class numberToRoman_Solis {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        StringBuilder finalOutput = new StringBuilder();
        
        //elements are equal with these 2 arrays
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","I"};
        
        
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int userInput = number;
        
        for(int i = 0; i < romans.length; i++){
            while(number >= values[i]){
                finalOutput.append(romans[i]);
                number -= values[i];
            }
        }
        String finalN = finalOutput.toString();
        System.out.println("The equivalent of " + userInput + " is " + finalN);
        
    }
}
