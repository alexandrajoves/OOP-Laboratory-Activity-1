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
public class JovesAJLabExer11 {
        public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input seconds");
        double a = Double.parseDouble(in.readLine());
	double y = 32.174;
	double z= ((1/2)*(y*(a*a)));
               System.out.println("Total: "+z);
}
}

