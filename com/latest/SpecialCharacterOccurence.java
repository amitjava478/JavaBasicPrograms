package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SpecialCharacterOccurence {

	public static void main(String[] args) {

		String s = "amit@##$%%^**!hty";

		List<String> list = Arrays.asList(s.split(""));

		Map<String, Long> count = list.stream().filter(p -> p.matches(Pattern.compile("[^0-9A-Za-z]").toString()))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		count.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}

}
