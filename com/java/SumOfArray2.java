package com.java;

import java.util.Arrays;
import java.util.List;

public class SumOfArray2 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 50 };

		Integer b[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> list = Arrays.asList(b);

		Integer sum = list.stream().reduce(0, (a1, b1) -> (a1 + b1));

		System.out.println(sum);
	}

}
