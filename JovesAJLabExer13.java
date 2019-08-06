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
public class JovesAJLabExer13 {
  public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Input x:");
	float x = Integer.parseInt(in.readLine());
               System.out.println("Input y:");
	float y = Integer.parseInt(in.readLine());
         
	float am  = (x+y)/2;
	float hm = 2/(1/x+1/y);
        
        System.out.println("Arithmetic Mean:" + am );
        System.out.println("Harmonic Mean:" + hm);               
}
}
