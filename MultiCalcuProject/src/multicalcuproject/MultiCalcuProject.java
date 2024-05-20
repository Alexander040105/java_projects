/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicalcuproject;
import static multicalcuproject.MeasurementConv.measurement;
import java.util.Scanner;
import static multicalcuproject.KDACalcu.kdaCalc;
public class MultiCalcuProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("type kda if you want to use the KDA calculator and type inch to feet if you want to use the Inch to Feet Converter");
        System.out.print("Type here: ");
        String type = scan.nextLine();
        
        if(type.equalsIgnoreCase("kda")){
            kdaCalc();
        }else if(type.equalsIgnoreCase("inch to feet")){
            measurement();
        }
    }
    
}
