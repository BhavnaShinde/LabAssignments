package com.cg.lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Excercise4 {
	public static void main(String[] args) {
		
		 HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
		
	        hm.put("158", 98); 
	        hm.put("102", 85); 
	        hm.put("148", 74); 
	        hm.put("109", 35); 
	        hm.put("108", 67); 
	      
	     HashMap<String, String>  output = getStudents(hm); 
	     System.out.println("students details:" + output);
  	}

	private static HashMap<String, String> getStudents(HashMap<String, Integer> hm)
	{
		HashMap<String, String>  result=new HashMap<>();
		Set<String> s=hm.keySet();
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			String str=i.next();
			int mark=hm.get(str);
			if(mark>=90)
				result.put(str, "GOLD");
			else if(mark>=80 && mark<90)
				result.put(str, "SILVER");
			else if(mark>=70 && mark<80)
				result.put(str, "BRONZE");
			
			
		}
		return result;
		
		
		
	}

}
