package com.amit;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatableCharacterInString {

	public static void main(String[] args) {
	
		
		String s="Hello world welcome H";
		
		
		System.out.println(findFirstNonRepeatableCharcterInString(s));
		
		
	}

	private static Character findFirstNonRepeatableCharcterInString(String s) {
		
		Map<Character, Integer> countedMap=new LinkedHashMap<>();
		
		for(Character ch:s.toCharArray())
		{
			
			countedMap.put(ch, countedMap.getOrDefault(ch, 0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> map:countedMap.entrySet())
		{
			if(map.getValue()==1)
			{
				return map.getKey();
			}
		}
		
		
		return null;
	}

}
