package com.amit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNonRepeatableCharacterInStringByJava8 {

	public static void main(String[] args) {

		String s = "Hello world welcome to java world H";

		Map<Character, Long> countedMap = s.chars().mapToObj(p -> (char) p)
				.collect(Collectors.groupingBy(p -> p, LinkedHashMap::new, Collectors.counting()));

		Character nonRepeatedChar = countedMap.entrySet().stream().filter(p -> p.getValue() == 1).map(p -> p.getKey())
				.findFirst().orElseThrow(null);

		System.out.println(nonRepeatedChar);
	}

}
