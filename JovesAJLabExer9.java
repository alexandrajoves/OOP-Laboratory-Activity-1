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
public class JovesAJLabExer9 {
    public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Input voltage:");
	int v = Integer.parseInt(in.readLine());
               System.out.println("Input resistance:");
	int r = Integer.parseInt(in.readLine());
         
	float i  = (float) (v+0.00/r);
        
        System.out.println("Total Current:" + i );              
}    
}
