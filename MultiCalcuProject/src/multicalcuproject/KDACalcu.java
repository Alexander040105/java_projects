/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicalcuproject;

import java.util.Scanner;

/**
 *
 * @author Alexander Jon
 */
public class KDACalcu {
     public static void kdaCalc(){
    Scanner scan = new Scanner(System.in);
        
        int kill;
        int death;
        int assist;
        int calculation;
        int calculation2;
        
        System.out.println("KDA Calculator");
        System.out.println("");
        //user input
        System.out.print("Please enter the number of your kills : ");
        kill = scan.nextInt();
        
        System.out.print("Please enter the number of your deaths : ");
        death = scan.nextInt();
        
        System.out.print("Please enter the number of your asissts : ");
        assist = scan.nextInt();
        
        if(death == 0){
            calculation = kill + assist;
            System.out.print("Your average kda is " + calculation);
        } else if (death > 0) {
            calculation2 = (kill + assist) / death;
            System.out.print("Your average kda is " + calculation2);
        }
    }
}
