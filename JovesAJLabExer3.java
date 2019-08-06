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
public class JovesAJLabExer3 {
public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Rainfall for April:");
	int x = Integer.parseInt(in.readLine());
               System.out.println("Rainfall for May:");
	int y = Integer.parseInt(in.readLine());
         System.out.println("Rainfall for June:");
	int z  = Integer.parseInt(in.readLine());
	double sum = (x+y+z);
    float avg = (float) ((x+y+z)/3);
    
    System.out.println("Total Rainfall:" + sum + "\nAverage Rainfall:" + avg);
               
}
}
