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
public class JovesAJLabExer14 {
     public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter amount of purchase:");
       
        String p = in.readLine();
        int item = Integer.parseInt(p);
        double disc = (item * .10);
        double total = (item - disc);
       
        if (item > 1000) 
        System.out.println("Discounted price: " + total);
        else 
            System.out.println("Sorry, your item is not discounted, Your total is:" + item);
        }
}     
        
        
