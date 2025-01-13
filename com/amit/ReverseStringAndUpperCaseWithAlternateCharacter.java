package com.amit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringAndUpperCaseWithAlternateCharacter {
	public static void main(String[] args) {
		
		
		String input="Hello World";
		
		String reverseString=new StringBuilder(input).reverse().toString();
		
		System.out.println(reverseString);
		
		
	String result=	IntStream.range(0, reverseString.length())
		.mapToObj(i->i%2==0?Character.toString(Character.toUpperCase(reverseString.charAt(i))):Character.toString(reverseString.charAt(i)))
		.collect(Collectors.joining());
		
	
	System.out.println(result);
		
		
		
		
		
		
		
		
	}
}
