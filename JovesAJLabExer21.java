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
public class JovesAJLabExer21 {
     public static void main(String[] args) throws IOException
    {   
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            
        
    
        System.out.println("What is the Air temperature?:");
        String tr = in.readLine();
        int Tair = Integer.parseInt(in.readLine());
        
        System.out.println("What is the Steam temperature?:");
        String ts = in.readLine();
        int Tsteam = Integer.parseInt(in.readLine());
        
        double efficiency = 1 - Tair / Tsteam;
        if (Tsteam < 373){
            System.out.println("Efficiency is zero.");
         }
        else {
            System.out.println("Efficiency is:" +efficiency);
        }
}
}