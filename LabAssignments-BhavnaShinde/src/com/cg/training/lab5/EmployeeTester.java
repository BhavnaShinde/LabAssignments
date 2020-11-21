package com.cg.training.lab5;

import java.util.Scanner;



public class EmployeeTester {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.println("Enter your salary: ");
			int salary= scanner.nextInt();
			if(salary<3000) {
				throw new EmployeeException("Salary is below 3000");
			}
			System.out.println("Salary is above 3000");

		}catch(EmployeeException e) {
			e.printStackTrace();
		}

	}

}