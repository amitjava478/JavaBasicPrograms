package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingLengthWiseInList {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("amit", "aa", "b", "satendatra", "anuj", "bb");

		Map<Integer, List<String>> groupingMap = list.stream()
				.collect(Collectors.groupingBy(p -> p.length(), Collectors.toList()));

		groupingMap.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}

}
