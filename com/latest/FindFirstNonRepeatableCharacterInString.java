package com.latest;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatableCharacterInString {

	public static void main(String[] args) {
		
		String s="Hello world H";
		
		//String s1[]=s.split("");
		
	Character ch=s.chars()
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
