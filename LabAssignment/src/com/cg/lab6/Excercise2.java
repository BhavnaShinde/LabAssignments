package com.cg.lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Excercise2 {
	private static HashMap<Character, Integer> countChar(char[] input)
    {
         
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
       for (char ch : input)
        {
            if(charMap.containsKey(ch))
            {
                   charMap.put(ch, charMap.get(ch)+1);
            }
            else
            {
                 charMap.put(ch, 1);
            }
        }
      
       return charMap;
    }
  
    public static void main(String[] args)
    
    {
       	Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        char[] chr=str.toCharArray();
    	HashMap<Character, Integer> charMap=countChar(chr);
    	System.out.println(charMap);
  
     
    }
}


