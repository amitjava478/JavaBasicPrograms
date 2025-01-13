package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ZeroOneInList {

	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(1,0,2,34,0,34,56,0,0,0);
		
List<Integer> list2= Stream.concat(
		list.stream().filter(p->p==0),
		list.stream().filter(p->p!=0))
		.collect(Collectors.toList());


System.out.println(list2);

	}

}
