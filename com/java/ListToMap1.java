package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMap1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("abb", "amit", "komal");

		Map<Integer, String> map = IntStream.range(0, list.size())
				.boxed().collect(Collectors.toMap(i -> i, list::get));
		
		map.forEach((key,value)->{
			System.out.println(key+" "+value);
		});

	}

}
