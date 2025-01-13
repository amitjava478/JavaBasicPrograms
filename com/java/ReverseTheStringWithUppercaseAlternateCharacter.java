package com.java;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseTheStringWithUppercaseAlternateCharacter {

	public static void main(String[] args) {
		
		String str="Hello World";
		
		StringBuilder sb=new StringBuilder(str);
		
		StringBuilder reverse=sb.reverse();
		System.out.println(reverse);
		
		
	   String result= IntStream.range(0, reverse.length())
		   .mapToObj(i->i%2==0?Character.toString(Character.toUpperCase(reverse.charAt(i))):Character.toString((reverse.charAt(i))))
		   .collect(Collectors.joining());
	
	     System.out.println(result);
		   

	}

}
