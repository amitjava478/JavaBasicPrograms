package com.amit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindIndicesForVovels {

	public static void main(String[] args) {

		String s = "My Name is Amit Yadav";

		List<String> vowelList = new ArrayList<>(Arrays.asList("A", "a", "I", "i", "E", "e", "O", "o", "U", "u"));

		List<Integer> indices = IntStream.range(0, s.length())
				.filter(i -> vowelList.contains(String.valueOf(s.charAt(i)))).boxed().collect(Collectors.toList());

		System.out.println(indices);

	}

}
