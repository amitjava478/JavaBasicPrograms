package com.amit;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchElementWhichStartWithOneInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(101, 98, 99, 10, 17, 57, 21, 1001);

		List<Integer> list2 = list.stream()
				//.filter(p -> p.toString().startsWith("1"))
				.filter(p ->String.valueOf(p).startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(list2);
	}

}
