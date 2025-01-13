package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchNumberWhichStartWithOne {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,40,101,301,11,121,151);
		
	List<Integer> numberList=list.stream()
		//.filter(p->p.toString().startsWith("1"))
		.filter(p->String.valueOf(p).startsWith("1"))
		.collect(Collectors.toList());
	
	System.out.println(numberList);

	}

}
