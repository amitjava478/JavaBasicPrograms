package com.latest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FetchDublicateFromList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12, 34, 67, 68, 68, 69, 69, 34, 34, 56));

		List<Integer> dublicateList = list.stream()
				.filter(p -> Collections.frequency(list, p) > 1)
				.collect(Collectors.toList());
		        

		System.out.println(dublicateList);

	}

}
