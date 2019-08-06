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
public class JovesAJLabExer31 {
    public static void main(String[] args) throws IOException 
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int times;
        int num;
        int sum = 0;
        
        System.out.println("How many integers will be added?:");
        String tm = in.readLine();
        times = Integer.parseInt(tm);
       
        
        for (int i = 0; i < times; i++) {
            System.out.println("Enter an integer:");
            String n = in.readLine();
            num = Integer.parseInt(n);
            sum += num;
        }
        System.out.println("The sum is: " + sum);
        
}
}
