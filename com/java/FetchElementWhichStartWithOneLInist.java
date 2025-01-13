package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchElementWhichStartWithOneLInist {

	public static void main(String[] args) {

		
		List<Integer> list=Arrays.asList(10,10,2,55,55,3,134,1,190);
		
	List<Integer> listStartWithOne=	list.stream()
		//.filter(p->p.toString().startsWith("1"))
		.filter(p->String.valueOf(p).startsWith("1"))
		.collect(Collectors.toList());
	
	
	System.out.println(listStartWithOne);
		
		
	}

}
