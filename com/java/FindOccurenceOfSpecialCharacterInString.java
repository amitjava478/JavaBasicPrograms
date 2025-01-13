package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FindOccurenceOfSpecialCharacterInString {

	public static void main(String[] args) {
		
		String s="amoit@3##%!@^()%%";
		
		List<String> list=Arrays.asList(s.split(""));
		
Map<String, Long> specialCharaterCount=		list.stream()
		.filter(p->p.matches(Pattern.compile("[^A-Za-z0-9]").toString()))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		

specialCharaterCount.forEach((key,value)->{
	
	System.out.println(key+" "+value);
	
});

	}

}
