package com.cg.training.lab1;

import java.util.Scanner;

public class Example2 {
	private static final int Red=0;
	private static final int Yelow=1;
	private static final int Green=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter ur choic");
int choice =sc.nextInt();
switch(choice)
{
case Red:
	System.out.println("stop");
	break;
case Yelow:
	System.out.println("ready");
	break;
case Green :
	
	
	System.out.println("go");

break;
	}

	}
}
