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
public class JovesAJLabExer33 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        double avg = 0;
        double avgSq = 0;
        double num;
        double N;
        double sd;
        
        System.out.println("Enter N:");
        String n = in.readLine();
        N = Integer.parseInt(n);
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < N; i++) {
            String nm = in.readLine();
            num = Integer.parseInt(nm);
            avg += num;
            avgSq += num * num;
        }
        
                avg /= N;
                avg *= avg;
                avgSq /= N;
                sd = Math.sqrt(avgSq - avg);
        
        System.out.println("Standard Deviation is: " + sd);
    
}
 }
