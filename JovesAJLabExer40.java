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
public class JovesAJLabExer40 {
     public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        double weight = 1;
        double shipping = 0;
        
        while (true) {
            
            System.out.println("Weight of Order:");
            String w = in.readLine();
            weight = Double.parseDouble(w);
           
            if (weight == 0)
                break;
            shipping = 0;
            if (weight > 10)
                shipping += 5.5;
            else
                shipping += 3;
            System.out.println("Shipping cost: " + shipping);
        }
        
        System.out.println("Thank you, Bye!");
}
}
