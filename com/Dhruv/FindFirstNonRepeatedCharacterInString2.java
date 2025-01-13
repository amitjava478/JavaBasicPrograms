package com.Dhruv;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacterInString2 {

	public static void main(String[] args) {
		
		String s="Hello WorldH";
		
		
	  // List<String> list=Arrays.asList(s.split(""));
		
Character ch=		s.chars()
		.mapToObj(p->(char)p)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
	    .filter(p->p.getValue()==1)
	    .map(p->p.getKey())
	    .findFirst()
	    .orElseThrow(null);
	     
	
System.out.println(ch);
	  
		

	}

}
