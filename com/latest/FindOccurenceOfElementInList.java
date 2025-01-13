package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurenceOfElementInList {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("amit","anil","pankaj","amit","komal","komal");
		
	Map<String,Long> mapCount=	list.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	
	mapCount.forEach((key,value)->{
		System.out.println(key+" "+value);
	});
		
		

	}

}
