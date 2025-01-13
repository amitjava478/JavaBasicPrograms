package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxInArray3 {

	public static void main(String[] args) {

		int a[] = { 12, 34, 89, 45, 90 };

		Integer b[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> list = Arrays.asList(b);

		Optional<Integer> max = list.stream().max(Integer::compareTo);

		if (max.isPresent()) {
			System.out.println(max.get());
		}

	}

}
