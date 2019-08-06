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
public class JovesAJLabExer7 {
     public static void main(String[] args) throws IOException 
     {
      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Input cents:");
       String name = dataIn.readLine();
        int cents = Integer.parseInt(name);
        int dollars = cents / 100;
        System.out.println("That is " + dollars + " dollars and " + (cents % 100) + " cents");   
     }    
}
