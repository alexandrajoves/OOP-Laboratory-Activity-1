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
public class JovesAJLabExer32 {
      public static void main(String[] args) throws IOException 
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int n;
        double sum = 0;
        System.out.println("Enter N:");
        String x = in.readLine();
        n = Integer.parseInt(x);
        for (int i = 1; i <= n; i++)
            sum += 1.0 / i;
        System.out.println();
        System.out.println("The sum is: " + sum);
    
}
}
