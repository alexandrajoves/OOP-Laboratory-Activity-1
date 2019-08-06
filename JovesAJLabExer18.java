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
public class JovesAJLabExer18 {
     public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        double priceA;
        double priceB;
        double percentA;
        double percentB;
                
        System.out.println("Price per pound package A:");
        String prA = in.readLine();
        priceA= Double.parseDouble(prA);
        
        System.out.println("Percent lean package A:");
        String pcA = in.readLine();
        percentA = Double.parseDouble(pcA);
       
        System.out.println("Price per pound package B:");
        String prB  = in.readLine();
        priceB = Double.parseDouble(prB);
        
        System.out.println("Percent lean package package B:");
        String pcB  = in.readLine();
        percentB = Double.parseDouble(pcB);
        
        percentA /= 100;
        percentB /= 100;

        double packageA = (priceA * 2 - percentA);
        double packageB = (priceB * 2 - percentB);
        
        
        System.out.println("Package A cost per pound of lean:" + packageA);
        System.out.println("Package B cost per pound of lean:" + packageB);
       
        if (packageA < packageB) 
        System.out.println("Package A is the best Value");
        else 
        System.out.println("Package B is the best Value");
  
    }
}
