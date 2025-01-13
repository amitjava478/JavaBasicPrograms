package com.amit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FindOccurenceOFSpecialCharacterInString {

	public static void main(String[] args) {

		String s = "amit@^&78@@#8!#$%*^";

		List<String> list = new ArrayList<>(Arrays.asList(s.split("")));

		Map<String, Long> specialCharacterCount = list.stream()
				.filter(p -> p.matches(Pattern.compile("[^a-zA-Z0-9]").toString()))
				.collect(Collectors.groupingBy(p -> p, Collectors.counting()));

		specialCharacterCount.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}

}
