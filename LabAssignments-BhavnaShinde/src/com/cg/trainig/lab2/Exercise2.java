package com.cg.trainig.lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	 private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter no. of arrays");
		 int size = Integer.parseInt(sc.nextLine());
		String arr[]=new String[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
			}
		
		sort(arr);
	}

	private static void sort(String[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		String sortArr;
		int len=arr.length;
		for(int i=0;i<len;i++) {
			if(i<=len/2) {
				sortArr=arr[i].toUpperCase();
				}
			else {
				sortArr=arr[i].toLowerCase();
			}
			
			

			System.out.println(sortArr);
		}
		
			
			
		
		
	}

}