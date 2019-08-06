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
public class JovesAJLabExer22 {
     public static void main(String[] args) throws IOException
    {
    {   
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("What is the number of items to be heated?:");
        String i = in.readLine();
        int items = Integer.parseInt(i);
        
        System.out.println("What is the single item heating time?:");
        String t = in.readLine();
        double time = Double.parseDouble(t);
        
        switch (items) {
            case 1: System.out.println("Recommended heating time is:" +time); 
            break;
            case 2: System.out.println("Recommended heating time is:" +time * 1.5); 
            break;
            case 3: System.out.println("Recommended heating time is:" +time * 2.0); 
            break;
            default:
                System.out.println("Sorry, It is not recommended to heat up more than 3 items at once");
                
        }
    }
    }
 }