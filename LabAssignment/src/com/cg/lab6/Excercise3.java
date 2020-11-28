package com.cg.lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Excercise3 {
  private static HashMap<Integer, Integer> getSquares(int[] input)
    {
        HashMap<Integer, Integer> square=new HashMap<>();
        for(int i:input)
        {
        	int result=i*i;
        	square.put(i, result);
        	
        }
        return square;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  size of integer array");
		int n=sc.nextInt();
		int num[]=new int[n];
        System.out.println("Enter  elements of integer array");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> squareMap=getSquares(num);
    
    	System.out.println(squareMap);
  
     

	}

}
