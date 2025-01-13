package com.amit;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeatableCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello world welcome";

		System.out.println(findFirstRepeatableCharacterInString(s));

	}

	private static Character findFirstRepeatableCharacterInString(String s) {

		Map<Character, Integer> countedMap = new LinkedHashMap<>();

		for (Character ch : s.toCharArray()) {
			countedMap.put(ch, countedMap.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> map : countedMap.entrySet()) {
			if (map.getValue() > 1) {
				return map.getKey();
			}

		}

		return null;
	}

}
