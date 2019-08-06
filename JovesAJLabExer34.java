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
public class JovesAJLabExer34 {
public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int upper;
        int sumS = 0;
        int sumC = 0, j;
        
        System.out.println("Upper limit:");
        String x = in.readLine();
        upper = Integer.parseInt(x);
        for (int i = 1; upper <= i ; i++) {
            j = i * i;
            sumS += j;
            sumC += j * i;
        }
        System.out.println("The sum of the Squares is: " + sumS);
        System.out.println("The sum of the Cubes is: " + sumC);
    }
    
}
