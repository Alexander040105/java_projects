/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disOrDat;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 63947
 */
public class fontWatermelon {
    public static void watermelon() {
 
        Font watermelon;
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("Watermelon .ttf");
        
        try {
            //watermelon = Font.createFont(Font.TRUETYPE_FONT, new File("CoffeeCake.ttf")).deriveFont(30f);
            watermelon = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Watermelon Days.ttf"))).deriveFont(30f);
            //watermelon = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(30f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, stream));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Watermelon Days.ttf"))));
        } catch (FontFormatException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        /*try {
         GraphicsEnvironment ge = 
         GraphicsEnvironment.getLocalGraphicsEnvironment();
         ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Watermelon Days.ttf")));
        }catch (IOException|FontFormatException e) {
         //Handle exception
        }  */  
        
        
        
   /* Font[] fonts;
    fonts =
     GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts( );
        for (int i = 0; i < fonts.length; i++) {
          System.out.print(fonts[i].getFontName( ) + " : ");
          System.out.print(fonts[i].getFamily( ) + " : ");
          System.out.print(fonts[i].getName( ));
          System.out.println( );
        }*/
    } 
}
