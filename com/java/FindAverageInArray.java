package com.java;

import java.util.Arrays;
import java.util.List;

public class FindAverageInArray {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5};
		Integer b[]=Arrays.stream(a)
				.boxed()
				.toArray(Integer []::new);
		
		List<Integer> list=Arrays.asList(b);
		
double average=		list.stream()
		.filter(p->p%2==0)
		.mapToInt(p->p*2)
		.average()
		.orElse(0.0);


System.out.println(average);

	}

}
