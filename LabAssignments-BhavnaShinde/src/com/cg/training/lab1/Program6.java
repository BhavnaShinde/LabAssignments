package com.cg.training.lab1;
import java.util.*;
public class Program6 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first n natural numbers: ");
int n=sc.nextInt();
System.out.println(calculatedifference(n));
}
public static int calculatedifference(int n){
int sumOfSquares=0;
int squareOfSum=0;
for(int i=0;i<=n;i++){
sumOfSquares+=i*i;
}
for(int i=0;i<=n;i++){
squareOfSum+=i;
}
return (sumOfSquares - (squareOfSum*squareOfSum));
}
}