package com.amit;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatableCharacterInStringByJava8 {

	public static void main(String[] args) {

		String s = "Hello world";

		Character repeatableFirstCharacter = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().
				stream().
				filter(p -> p.getValue() > 1)
				.map(p -> p.getKey())
				.findFirst().orElseThrow(null);

		System.out.println(repeatableFirstCharacter);

	}

}
