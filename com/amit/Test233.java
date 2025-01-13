package com.amit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s="Hello World H";
		String s="AbcdeAbcdefg";
		
		System.out.println(findFirstNonRepeatble(s));
		
		
		

	}

	private static Character findFirstNonRepeatble(String s) {
		
	HashMap<Character, Integer> countMap=new LinkedHashMap<>();
	
	//String s1[]=s.split("");
	
	
	for(char i:s.toCharArray())
	{
		countMap.put(i, countMap.getOrDefault(i, 0)+1);
	}
		
	
	for(Map.Entry<Character, Integer> j:countMap.entrySet())
	{
		if(j.getValue()==1)
		{
			return j.getKey();
		}
	}
		
		return null;
	}

}
