package com.Dhruv;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		
		
		String s="Hello WorldH";
		
		System.out.println(FindFirstNonRepeatedCharaterInString(s));
		
		

	}

	private static Character FindFirstNonRepeatedCharaterInString(String s) {
		
		Map<Character, Integer> map=new LinkedHashMap<>();
		
		
		for(Character ch:s.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		
		for(Map.Entry<Character, Integer> i:map.entrySet())
		{
			if(i.getValue()==1)
			{
				return i.getKey();
			}
		}
			
		return null;
	}

}
