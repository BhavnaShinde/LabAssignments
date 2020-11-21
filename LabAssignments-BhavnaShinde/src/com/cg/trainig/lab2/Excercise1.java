package com.cg.trainig.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("enter no of the arrays");
int size=sc.nextInt();
int arr[]=new int [size];
System.out.println("enetr ele");
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
for(int s:arr)
	
{
	System.out.println("ele are"+s);
}

	Arrays.sort(arr);
	System.out.println("2nd small ekle" +arr[1]);
}
	}



