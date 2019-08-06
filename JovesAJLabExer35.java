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
public class JovesAJLabExer35 {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        double X;
        double N;
        double ans = 1;
        
        System.out.println("Enter X");
        String x = in.readLine();
        X = Double.parseDouble(x);
        
        System.out.println("Enter N");
        String n = in.readLine();
        N = Double.parseDouble(n);
        if (N > 0) {
            for (int i = 0; i < N; i++)
                ans *= X;
            System.out.println();
            System.out.println( X + " raised to the power of " + N + " is: " + ans);
        }
        else
            System.out.println("N must be a positive integer!");
    }
    
}

