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
public class JovesAJLabExer26 {
     public static void main(String[] args) throws IOException
    {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Input right front pressure");
	double rf = Double.parseDouble(in.readLine());
               System.out.println("Input left front pressure");
	double lf = Double.parseDouble(in.readLine());
               System.out.println("Input right rear pressure");
	double rr = Double.parseDouble(in.readLine());
                System.out.println("Input left rear pressure");
        double lr = Double.parseDouble(in.readLine());
                
                if ( rf >= 35 && lf <= 45){
            System.out.println("Good Pressure!");
                }
            else  {
            System.out.println("Warning: Pressure is out of range!");
                     }
                
                 if ( rr >= 35 && lr <= 45){
            System.out.println("Good Pressure!");
            }
        else {
            System.out.println("Warning: Pressure is out of range!");
            }
                 
              
}
}     
