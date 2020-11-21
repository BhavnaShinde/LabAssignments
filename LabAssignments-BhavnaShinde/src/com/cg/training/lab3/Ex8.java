package com.cg.training.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
	static boolean isAlphabaticOrder(String s)  
    {  
        // length of the string  
        int n = s.length();  
        
        // create a character array  
        // of the length of the string  
        char c[] = new char [n];  
        
        // assign the string  
        // to character array  
        for (int i = 0; i < n; i++) {  
            c[i] = s.charAt(i);  
        }  
        
        // sort the character array  
        Arrays.sort(c);  
        
        // check if the character array  
        // is equal to the string or not  
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String s= sc.nextLine(); 
        if (isAlphabaticOrder(s))  
            System.out.println("True");  
         else
             System.out.println("false");  
             
	}

}
