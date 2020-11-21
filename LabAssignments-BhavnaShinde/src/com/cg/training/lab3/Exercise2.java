package com.cg.training.lab3;
import java.util.*; 
public class Exercise2{
	
// Function to reverse a string in Java using StringBuilder
public static String getimage(String s){
return new StringBuilder(s).reverse().toString();
}

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
String s= sc.next(); 
String s1= getimage(s);
System.out.println("Result after reversing a string is : "+s+"|"+s1);
}
}