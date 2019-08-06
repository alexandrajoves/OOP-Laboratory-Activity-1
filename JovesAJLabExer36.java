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
public class JovesAJLabExer36 {
     public static void main(String[] args) throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      
        System.out.println("Initial number of stars:");
        String a = in.readLine();
        int num = Integer.parseInt(a);
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num - i; j++)
                System.out.print("*");
               System.out.println();
    
}
   }
      }