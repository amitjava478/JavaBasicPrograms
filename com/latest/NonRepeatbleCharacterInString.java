package com.latest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatbleCharacterInString {

	public static void main(String[] args) {

		String s = "Hello World H";

		System.out.println(FindFirstNonRepeatble(s));

	}

	private static Character FindFirstNonRepeatble(String s) {

		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (Character ch : s.toCharArray())

		{
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			
		

		}

		for (Map.Entry<Character, Integer> i : map.entrySet()) {
			if (i.getValue() == 1) {
				return i.getKey();
			}
		}

		return null;
	}

}
