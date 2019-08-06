/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JovesAJLabActivity101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alexandra
 */
public class JovesAJLabExer38 {
     public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               
            System.out.println("MILES PER GALLON PROGRAM");
              
               double inmi;
               double fimi;
               double gallons;
               double miga;
               
                    System.out.println("Initial Miles:");
                    String im = in.readLine();
                    inmi = Double.parseDouble(im);
               
                    if (inmi <= 0) {
                   System.out.println("No More Cars, Bye.");
                   }
                    else {
                   System.out.println("Final Miles:");
                   String fm = in.readLine();
                    fimi = Double.parseDouble(fm);
            
                    System.out.println("Gallons");
                    String g = in.readLine();
                    gallons = Double.parseDouble(g);
            
                    double miles = (fimi - inmi) / gallons;
                    System.out.println("Miles per Gallon: " + miles);
                    }               
 
}
}