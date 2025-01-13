package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHigestNumberInList2 {

	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(11,22,33,78,89,90,11);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Second Higest Number In List"+" "+list.get(list.size()-2));

	}

}
