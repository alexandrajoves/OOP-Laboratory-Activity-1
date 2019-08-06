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
public class JovesAJLabExer23 {
     public static void main(String[] args) throws IOException
    {
	System.out.println("Welcome to Yertle's Quest:"); 
       try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
       {

            System.out.println("Please enter the name of your character: ");
            String name = br.readLine();

            System.out.println("Enter Strength (1-10):");
            int strength = Integer.parseInt(br.readLine());

            System.out.println("Enter Health (1-10):");
            int health = Integer.parseInt(br.readLine());

            System.out.println("Enter Luck (1-10):");
            int luck = Integer.parseInt(br.readLine());
            
            int total = (strength + health + luck);
            if (total > 15) {
                System.out.println("You have given your character too many points!");
                System.out.println("Default values have been assigned: Strength: 5, Health: 5, Luck: 5"); }
                else {
                       System.out.println("Total Points:"+total);
                      }
                            }
            
       }
       

     }

