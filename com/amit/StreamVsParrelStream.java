package com.amit;

import java.util.Arrays;
import java.util.List;

public class StreamVsParrelStream {

	public static void main(String[] args)
	{
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		
		list.stream()
		.forEach(System.out::println);
		
		System.out.println("................");
		
		List<Integer> list2=Arrays.asList(1,2,3,4,5,6,7);
		
		list2.parallelStream()
		.forEach(System.out::println);
		
	
		System.out.println("...ordered in pareel stream");
		
		
		List<Integer> list3=Arrays.asList(1,2,3,4,5,6,7);
		
		list3.parallelStream()
		.forEachOrdered(System.out::println);
		
		
		
		
		
		

	}

}
