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
public class JovesAJLabExer39 {
     public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("In-range Adder");
        
        int low;
        int high;
        int data;
        int inRange = 0;
        int notInRange = 0;
        
             System.out.println("Low end of range:");
             String l = in.readLine();
             low = Integer.parseInt(l);
        
              System.out.println("High end of range:");
              String h = in.readLine();
              high = Integer.parseInt(h);
        
          while (true) {
              System.out.println("Enter data:");
              String d = in.readLine();
              data = Integer.parseInt(d);
            
            if (data == 0)
                break;
            if (data >= 20 && data <= 50)
                inRange += data;
            else
                notInRange += data;
            }
        
            System.out.println("Sum of in range values: " + inRange);
            System.out.println("Sum of out range values: " + notInRange);
}
}

