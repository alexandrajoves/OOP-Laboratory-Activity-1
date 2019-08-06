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
public class JovesAJLabExer15 {
    public static void main(String[] args) throws IOException
            //bP = bolt price; nP = nutPrice; wP = washerPrice;
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        final int bP = 5;
        final int nP = 3;
        final int wP = 1;
                
        System.out.println("Number of bolts:");
        String b = in.readLine();
        int bolts = Integer.parseInt(b);
        
        System.out.println("Number of nuts:");
        String n = in.readLine();
        int nuts = Integer.parseInt(n);
        
        System.out.println("Number of washer:");
        String w = in.readLine();
        int washer = Integer.parseInt(w);
        
        int Total = (bolts * bP) + (nuts * nP) +(washer * wP);
        System.out.println("Check the order \n\n" + "Total cost: " + Total);
}
}
