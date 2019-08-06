package JovesAJLabActivity101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandra
 */
public class JovesAJLabExer20 {
    public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        float price;
        
        System.out.println("Enter the item:");
        String item = in.readLine();
        
        System.out.println("Enter the price:");
        String prc = in.readLine();
        price = Float.parseFloat(prc);
            float rs1 = (price + 200);
            float rs2 = (price + 300);
        if (price > 1000)
        { 
        System.out.println(""+ rs1);
        }
        if (price < 1000) 
        {
        System.out.println(""+ rs2);
        }
        System.out.println("Do you want overnight delivery? (0==no, 1==yes)");
        String on = in.readLine();
        int overnight = Integer.parseInt(on);
            float os3 = (price + 500); 
                switch (overnight){
                    case 0:
                        System.out.println("Invoice:"); 
                        System.out.println(item + "\t" + price);
                        System.out.println("shipping\t" + os3 );
                        System.out.println("total\t" + (price + os3));
                    case 1:
                        System.out.println("Invoice:"); 
                        System.out.println(item + "\t" + price );
                        System.out.println("shipping\t" + rs1 );
                        System.out.println("total\t" + (price + rs1));
        }   
        
      
            
        } 
         
    }
         
