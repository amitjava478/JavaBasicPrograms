package com.latest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatble {

	public static void main(String[] args) {

		String s = "Hello worldH";

		List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        
		Map<String, Long> mapCount = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		String ch = mapCount.entrySet().stream().filter(p -> p.getValue() == 1).map(p -> p.getKey()).findFirst()
				.orElseThrow();

		System.out.println(ch);

	}

}
