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
public class JovesAJLabExer28 {
     public static void main(String[] args) throws IOException {
        BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
        
        int start;
        int end;
        
        System.out.println("Enter Start:");
        String s = In.readLine();
        start = Integer.parseInt(s);
        
        System.out.println("Enter End:");
        String e = In.readLine();
        end = Integer.parseInt(e);
        
        System.out.println();
        for (int x = start; x <= end; x++)
                System.out.println(x);
    }
    
}
