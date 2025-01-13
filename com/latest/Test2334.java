package com.latest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test2334 {

	public static void main(String[] args) {

		
		Integer a[]= {10,23,45,89,35};
		
		List<Integer> list=Arrays.asList(a);
		
	Integer secondHigestNumber=	list.stream()
		.sorted(Collections.reverseOrder())
		.skip(1)
		.findFirst()
		.orElseThrow(null);
	
	System.out.println(secondHigestNumber);
		
	}

}
