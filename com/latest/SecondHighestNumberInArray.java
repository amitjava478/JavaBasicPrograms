package com.latest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public final class SecondHighestNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {10,23,89,34,78,45};
		
		Integer b[]=Arrays.stream(a)
				.boxed()
				.toArray(Integer []::new);
		
		
		List<Integer> list=Arrays.asList(b);
		
	Optional<Integer> secondHighestValue=list.stream()
		.sorted(Collections.reverseOrder())
		.skip(1)
		.findFirst();
	
	if(secondHighestValue.isPresent())
	{
		System.out.println(secondHighestValue.get());
	}

		
		
	}

}
