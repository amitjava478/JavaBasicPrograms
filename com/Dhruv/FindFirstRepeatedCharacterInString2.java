package com.Dhruv;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacterInString2 {

	public static void main(String[] args) {
		
		String s="Hello Worlde";
		
	Map<Character, Long> map=	s.chars()
		.mapToObj(p->(char)p)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	
	
Character ch=	map.entrySet().stream()
	.filter(p->p.getValue()>1)
	.map(p->p.getKey())
	.findFirst()
	.orElseThrow(null);


System.out.println(ch);

	}

}
