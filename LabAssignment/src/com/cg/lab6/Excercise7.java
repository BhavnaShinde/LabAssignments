package com.cg.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Excercise7 {
public static ArrayList<Integer> sortArrayList(ArrayList<Integer> arr) {
			
		Collections.sort(arr);
		return arr;
		
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  size of integer array");
		int n=sc.nextInt();
		int num[]=new int[n];
        System.out.println("Enter  elements of integer array");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
		{
			arr.add(num[i]);
		}
		
		ArrayList<Integer> result=sortArrayList(arr);
		
		for (int i = 0; i < result.size(); i++) {
			  System.out.println(arr.get(i));
		}
		
	}

}
