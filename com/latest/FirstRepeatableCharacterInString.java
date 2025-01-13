package com.latest;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatableCharacterInString {

	public static void main(String[] args) {

		String s = "Amit Yiadav";

		System.out.println(findFirstRepeatableCharacterInString(s));

	}

	private static Character findFirstRepeatableCharacterInString(String s) {
		
		Map<Character, Integer> mapCount=new LinkedHashMap<>();
		
		for(Character ch:s.toCharArray())
		{
			mapCount.put(ch, mapCount.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> i:mapCount.entrySet())
		{
			 if(i.getValue()>1)
			  {
			  return i.getKey();
				
			 }
	
	}
		return null;

}}
