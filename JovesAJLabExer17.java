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
public class JovesAJLabExer17 {
    public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("What is your weight? (in lbs.)");
	double w = Double.parseDouble(in.readLine());
        if ( w >= 30 && w <= 250){
            System.out.println("You are allowed to enter the contest!");
            }
        else {
            System.out.println("You are not allowed to enter the contest!");
            }
            
        }
        
        
    
}
