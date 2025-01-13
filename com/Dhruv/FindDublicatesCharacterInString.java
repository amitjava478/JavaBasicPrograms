package com.Dhruv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDublicatesCharacterInString {

	public static void main(String[] args) {

		String s = "Hello World Amit Yadav";

	String s2=findDublicatesInString(s);
	
	System.out.println(s2.substring(1));

		
	}

	private static String findDublicatesInString(String s) {

		List<String> list = Arrays.asList(s.split(""));

		Set<String> set = list.stream().filter(p -> (Collections.frequency(list, p) > 1)).collect(Collectors.toSet());

		String result = set.stream().collect(Collectors.joining(","));
		
		if (result.startsWith(",")) {
			result=result.substring(1);
		}

		return result.trim();
	}

}
