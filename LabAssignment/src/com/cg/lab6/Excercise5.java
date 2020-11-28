package com.cg.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Excercise5 {
	 private static int getSecondSmallest(int[] input)
	{
		List<Integer> numbers= new ArrayList<>();
		for(int i=0;i<input.length;i++)
		{
			numbers.add(input[i]);
		}
		
		Collections.sort(numbers);
		return numbers.get(1);
		 
	}
	 public static void main(String[] args)
	    
	    {
		    Scanner sc=new Scanner(System.in);
			System.out.println("Enter  size of integer array");
			int n=sc.nextInt();
			int num[]=new int[n];
	        System.out.println("Enter  elements of integer array");
	        for(int i=0;i<n;i++)
	        {
	            num[i]=sc.nextInt();
	        }
	        int output=getSecondSmallest(num);
	        System.out.println("second smallest element:="+output);
	     
	    }
    }
