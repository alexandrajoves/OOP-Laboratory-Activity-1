package JovesAJLabActivity101;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandra
 */
public class JovesAJLabExer37 {
     public static void main(String[] args) throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7 - i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < 3; i++)
            System.out.println("     ***");
    
}
   }
      

