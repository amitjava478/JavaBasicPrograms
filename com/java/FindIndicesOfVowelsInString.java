package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindIndicesOfVowelsInString {

	public static void main(String[] args) {

		String s = "Hello WorldA";

		List<String> vowelList = Arrays.asList("A", "a", "O", "o", "U", "u", "e", "E", "I", "i");

		List<Integer> indices = IntStream.range(0, s.length())
				.filter(i -> vowelList.contains(String.valueOf(s.charAt(i))))
				.boxed()
				.collect(Collectors.toList());

		System.out.println(indices);

	}

}
