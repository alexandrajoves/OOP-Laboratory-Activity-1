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
public class JovesAJLabExer29 {
    public static void main(String[] args) throws IOException {
        BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a word:");
        String word = In.readLine();
    
        int times = word.length();
        System.out.println();
        for (int i = 0; i < times; i++)
            System.out.println(word);
       
     
    }
}
