package com.cg.training.lab5;
import java.util.Scanner;



public class Age {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.println("Enter your age: ");
			int age= scanner.nextInt();
			if(age<15) {
				throw new Age1Exception("You are under-aged, cannot vote");
			}
			System.out.println("You are eligible to vote");

		}catch(Age1Exception e) {
			e.printStackTrace();
		}

	}

}
