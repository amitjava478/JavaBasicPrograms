package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDublicateFromList {

	public static void main(String[] args) 
	{

		List<String> list=Arrays.asList("a","b","b","b","c","c");
		
	Set<String> nonDublicateElement=	  list.stream()
		  .collect(Collectors.toSet());
		
	System.out.println(nonDublicateElement);
		
	}

}
