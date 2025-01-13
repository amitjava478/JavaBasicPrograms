package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicatFromList {

	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,6,88,99,99,20);
		
		
	List<Integer> list2=list.stream()
		.distinct()
		.collect(Collectors.toList());
	
	System.out.println(list2);
		

	}

}
