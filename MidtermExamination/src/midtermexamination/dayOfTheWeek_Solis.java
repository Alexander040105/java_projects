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
public class dayOfTheWeek_Solis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input week number: ");
        int week = scan.nextInt();
        
        if(week == 1){
            System.out.println("The number " + week + "corresponds to Monday");
        } else if(week == 2){
            System.out.println("The number " + week + "corresponds to Tuesday");
        } else if(week == 3){
            System.out.println("The number " + week + "corresponds to Wednesday");
        } else if(week == 4){
            System.out.println("The number " + week + "corresponds to Thursday");
        } else if(week == 5){
            System.out.println("The number " + week + "corresponds to Friday");
        } else if(week == 6){
            System.out.println("The number " + week + "corresponds to Saturday");
        } else if(week == 7){
            System.out.println("The number " + week + "corresponds to Sunday");
        } else{
            System.out.println("The number " + week + "is our of Range!");
        }
    }
    
}
