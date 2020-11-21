package com.cg.training.lab5;

import java.util.Scanner;

public class EmployeeNameDemo {

	static void validageName(String fname,String lname) throws EmployeeName
	  {
		  if(fname.isEmpty() || lname.isEmpty())
			  throw new EmployeeName("balnk value entered");
		  else
			  System.out.println("Your name is : "+ fname + " "+lname);
	  }
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fisrt name");
		String fname=sc.nextLine();
		System.out.println("Enter last name");
		String lname=sc.nextLine();
	    try
	    {
	    	validageName(fname,lname);
	    }catch(EmployeeName e)
	    {
	    	System.out.println("Exception occured for blank name" + e);
	    }
		}

	}