package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDublicatesFromList1 {

	public static void main(String[] args)
	{

		
		List<String> list = Arrays.asList("amit", "amit", "Anjali", "Dhruv", "balag");
		
Set<String> removeDublicates=		list.stream()
		.collect(Collectors.toSet());

System.out.println(removeDublicates);
		
	}

}
