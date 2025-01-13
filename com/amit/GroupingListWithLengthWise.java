package com.amit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingListWithLengthWise {

	public static void main(String[] args) {
	
		
		List<String> list=Arrays.asList("apple","mango","bannana","orange","grapes","Strawberry", "Avocado","Kiwi", "Figs");
		
	Map<Integer, List<String>> lengthWiseList=	list.stream()
		.collect(Collectors.groupingBy(p->p.length()));
	
	
	
	lengthWiseList.forEach((key,value)->{
		System.out.println(key+" "+value);
	});
		
		
		
		

	}

}
