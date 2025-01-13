package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenConcatInList {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		
	List<String> oddEvenList=	list.stream()
		.map(p->p%2==0?p+"E":p+"O")
		.collect(Collectors.toList());
	
	System.out.println(oddEvenList);

	}

}
