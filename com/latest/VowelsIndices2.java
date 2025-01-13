package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VowelsIndices2 {

	public static void main(String[] args) {

		String s = "Hello world";

		List<String> vowelsList = Arrays.asList("A", "a", "B", "b", "O", "o", "E", "e", "U", "u");

		List<Integer> vowelsIndices = IntStream.range(0, s.length())
				.filter(i -> vowelsList.contains(String.valueOf(s.charAt(i))))
				.boxed()
				.collect(Collectors.toList());

		System.out.println(vowelsIndices);

	}

}
