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
public class JovesAJLabExer10 {
        public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Enter cost per kilowatt-hour in cents");
	double x = Double.parseDouble(in.readLine());
               System.out.println("Enter kilowatt-hours used per year ");
	double y = Double.parseDouble(in.readLine());
	double z=x*y;
               System.out.println("Annual cost: "+z);
     }
}
