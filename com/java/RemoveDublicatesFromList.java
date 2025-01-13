package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicatesFromList {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("amit", "amit", "Anjali", "Dhruv", "balag");

		List<String> removeDublicateList = list.stream()
				.distinct()
				.collect(Collectors.toList());

		System.out.println(removeDublicateList);

	}

}
