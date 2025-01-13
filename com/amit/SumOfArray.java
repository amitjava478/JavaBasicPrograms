package com.amit;

import java.util.Arrays;
import java.util.List;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[] = { 10, 20, 30 };

		List<Integer> list = Arrays.asList(a);

		Integer sumValue = list.stream().reduce(0, Integer::sum);

		Integer value = list.stream().mapToInt(Integer::intValue).sum();

		System.out.println(value);

		System.out.println(sumValue);

	}

}
