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
public class JovesAJLabExer12 {
      public static void main(String[] args) throws IOException 
     {
     BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a double:");
        
        String x = dataIn.readLine();
        double a = Double.parseDouble(x); 
        double ans = Math.log(a) / Math.log(2);
        System.out.println("Base 2 log of " + a + " is " + ans);
     }
    
}
