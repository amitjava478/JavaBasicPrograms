package com.amit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,6,88,99,99,20);
		
	List<Integer> unqiueList=	list.stream()
		.distinct()
		.collect(Collectors.toList());
	
	
	System.out.println(unqiueList);
		

	}

}
