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
public class JovesAJLabExer19 {
     public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Year of Birth *last two digits only* :");
	int x = Integer.parseInt(in.readLine());
               System.out.println("Current Year *last two digits only*:");
	int y = Integer.parseInt(in.readLine());
         
	int age = y-x;
        
        System.out.println("Your Age:" + age );
       
    
}
}