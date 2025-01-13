package com.latest;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatableCharacterInString 

{
	public static void main(String[] args) 
	{
		
		String s="Hello worldH";
		
		System.out.println(findNonRepeatableCharcter(s));

	}

	private static Character findNonRepeatableCharcter(String s) {
		
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
