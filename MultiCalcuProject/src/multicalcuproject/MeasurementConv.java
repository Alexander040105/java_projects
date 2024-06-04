package multicalcuproject;


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
public class MeasurementConv {
    public static void measurement(){
        Scanner scan = new Scanner(System.in);
        
        //arrays of two choices A=Inches to Feet B=foot to inches
        String[] symbols = {"F", "I"};
        
        //Conversions
        double inchesToFoot;
        double footToInches;
        String userChoice;
        double userNumberInput;
        
        //Value of inches and feet
        inchesToFoot = 0.083;
        footToInches = 12;
        
        System.out.println("Type F if you want to convert from Inches to Feet and I if you want to convert from feet to Inches: ");
        userChoice = scan.nextLine();
        
        System.out.println("Input the number of Inches/Feet you want to convert.");
        userNumberInput = scan.nextDouble();
        
        //magic hehehehe
        if(userChoice.equalsIgnoreCase(symbols[0])){
            double conversionToFeet = userNumberInput*inchesToFoot;
            System.out.println(userNumberInput + "in = " + conversionToFeet + "ft");
        }
        else if(userChoice.equalsIgnoreCase(symbols[1])){
            double conversionToInches = userNumberInput*footToInches;
            System.out.println(userNumberInput + "ft = " + conversionToInches + "in");
        }
        else{
            System.out.println("Thank you for using the conversion calculator");
        }
    }
}
