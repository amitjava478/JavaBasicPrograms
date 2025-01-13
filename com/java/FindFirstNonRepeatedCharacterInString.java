package com.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		
		String s="Hello world";
		
		System.out.println(findFirstNonRepeatedCharacterInString(s));
		

	}

	private static Character findFirstNonRepeatedCharacterInString(String s) {
		
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
