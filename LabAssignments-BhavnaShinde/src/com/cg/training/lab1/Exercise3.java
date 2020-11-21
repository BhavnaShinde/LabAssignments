package com.cg.training.lab1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number n to print the faboniccs series ");
        Scanner ob=new Scanner(System.in);
        short num=ob.nextShort();
        Series ob1=new Series();
        long b=ob1.FibonacciCount(num);
        System.out.println("The "+num+"th number of the faboniccs series is "+b);

	}

}
class Series 
{
    
    int a=1;
    int b=1;
    int c=0;
    int count;
    
   public int FibonacciCount(int num)
    {
        count=num;
        count=fabo(count);
        return count;
    }
    
   public int fabo(int count)
    {
        if(count!=0)
        {
            c=a+b;
            a=b;
            b=c;
            fabo(--count);
        }
        return c;
    }
}