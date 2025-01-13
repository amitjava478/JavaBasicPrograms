package com.java;

import java.util.Arrays;
import java.util.List;

public class FindFirstEvenNumberInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 90, 20, 21);

		Integer firstEven = list
				.stream()
				.filter(p -> p % 2 == 0)
				.findFirst().orElseThrow();

		System.out.println(firstEven);

	}

}
