package com.cg.lab6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Excercise1 {

	public static void main(String[] args) {
		
		 HashMap<String, Integer> h = new HashMap<String, Integer>(); 
		
	        h.put("Bhavna", 97); 
	        h.put("abc", 89); 
	        h.put("sanika", 93); 
	        h.put("Shinde", 94); 
	      
	       List<Integer> output = sortByValue(h); 
	       System.out.println("Sorted list:" + output);
   	}

	public static List<Integer> sortByValue(HashMap<String, Integer> h) 

    { 
        List list = new LinkedList(h.entrySet()); 
        System.out.println(list);
        Collections.sort(list, new Sortbyvalue()) ; 
     
       List result = new LinkedList(); 
       Iterator i=list.iterator();
       while(i.hasNext())
       {
    	   Map.Entry map=( Map.Entry )i.next();
          result.add( map.getValue()); 

        } 

        return result; 

    } 

}

	       

		
		

