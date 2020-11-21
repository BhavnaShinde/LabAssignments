package com.cg.trainig.lab2;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of arrays");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[size];
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		for(int s:arr) {
			
			System.out.println("Element in array is "+s);
		}
		int length = arr.length;
		length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++) {  
           System.out.print(arr[i]+" ");
        }
        

	}

	private static int removeDuplicateElements(int[] arr, int n) {
		
		if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    
		// TODO Auto-generated method stub
		
	}
}