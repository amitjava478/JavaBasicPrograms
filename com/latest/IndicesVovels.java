package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndicesVovels {

	public static void main(String[] args) {
		
		String s="Hello World";
		
		List<String> vovelsList=Arrays.asList("A","a","E","e","O","o","I","i","U","u");
		
	List<Integer> vowelsIndices=	IntStream.range(0,s.length())
		.filter(i->vovelsList.contains(String.valueOf(s.charAt(i)))).boxed()
		.collect(Collectors.toList());
	
	System.out.println(vowelsIndices);

	}

}
