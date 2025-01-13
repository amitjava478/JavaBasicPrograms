package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEvenConcat {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,23,45,78,90,20,12);
		
		
		List<String> list2= list.stream()
		               .map(p->p%2==0?p+"E":p+"O")
		               .collect(Collectors.toList());
		
		System.out.println(list2);
		        
	}

}
