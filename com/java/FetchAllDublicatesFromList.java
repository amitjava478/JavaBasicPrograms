package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FetchAllDublicatesFromList {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,10,2,55,55,3);
		
List<Integer>	 dublicateList=	list.stream()
		.filter(p->(Collections.frequency(list, p)>1))
		.collect(Collectors.toList());


System.out.println(dublicateList);

	}

}
