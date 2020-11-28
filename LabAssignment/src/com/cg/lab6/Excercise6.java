package com.cg.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Excercise6 {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Map<Integer,Integer> person_map = new HashMap<>();
	
	System.out.println("enter number of persons:");
	int n= sc.nextInt();
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter ID:");
	Integer a = sc.nextInt();
	System.out.println("Enter age");
	Integer b = sc.nextInt();
	person_map.put(a, b); 
	}
	List<Integer> age = votersList(person_map);
	for(int i : age)
	{
	System.out.println("valid person for voting:"+i);
	}
	}
	static List<Integer> votersList(Map<Integer, Integer> hash)
	{
	List<Integer> l = new ArrayList<Integer>();
	for (Map.Entry<Integer, Integer> entry : hash.entrySet())
	{
	if(entry.getValue()>18)
	{
	int i = entry.getKey();
	l.add(i);
	}
	}
	return l;
	}

}
