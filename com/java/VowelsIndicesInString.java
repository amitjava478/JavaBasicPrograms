package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VowelsIndicesInString {

	public static void main(String[] args) {
		
		
		String s="Hello World";
		
		List<String> vowelsList=Arrays.asList("A","a","I","i","O","o","U","u","e","E");
		
List<Integer> indices=		IntStream.range(0, s.length())
		.filter(i->vowelsList.contains(String.valueOf(s.charAt(i)))).boxed()
		.collect(Collectors.toList());


System.out.println(indices);
		
		
		

	}

}
