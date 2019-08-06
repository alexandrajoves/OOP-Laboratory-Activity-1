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
public class JovesAJLabExer24 {
     public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Input the balance of your checking account");
	double c = Double.parseDouble(in.readLine());
               System.out.println("Input the balance of your savings account");
	double s = Double.parseDouble(in.readLine());
        
        if ( c < 1000 || s < 1500){
            System.out.println("You have a service charge of  $0.15 per check.");
            }
        else {
            System.out.println("No service charge.");
            }
            
        }
    
}
