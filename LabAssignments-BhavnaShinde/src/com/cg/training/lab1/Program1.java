package com.cg.training.lab1;
import java.util.*; 
import java.lang.*; 
class Program1 
{ 
  
    /* Returns the sum of series */
    public static int sumOfSeries(int n) 
    { 
        int sum = 0; 
        for (int x=1; x<=n; x++) 
            sum += x*x*x; 
        return sum; 
    } 
  
// Driver Function 
    public static void main(String[] args) 
    { 
        int n = 5; 
        System.out.println(sumOfSeries(n)); 
  
    } 
} 