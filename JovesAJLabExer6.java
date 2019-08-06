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
public class JovesAJLabExer6 {
public static void main(String[] args) throws IOException
    {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Input Radius:");
	int r = Integer.parseInt(in.readLine());
        double a = (r*r)*(Math.PI);
             System.out.println("The Radius is:"+r);
             System.out.println("The Area is:"+a);
    
}
}