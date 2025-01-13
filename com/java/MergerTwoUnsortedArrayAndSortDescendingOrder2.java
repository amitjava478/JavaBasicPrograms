package com.java;

import java.util.Arrays;
import java.util.Collections;

import java.util.stream.IntStream;

public class MergerTwoUnsortedArrayAndSortDescendingOrder2 {
	
	
	public static void main(String[] args) {
		
		
		int a[] = { 12, 1, 3, 5, 90, 45 };
		int b[] = { 11, 8, 9, 4, 3, 2, 2 };
		
	Integer mergerArray[]=IntStream.concat(Arrays.stream(a), Arrays.stream(b))
		          .boxed()
		          .distinct()
		          .sorted(Collections.reverseOrder())
		          .toArray(Integer[]::new);
	
	
	System.out.println(Arrays.toString(mergerArray));
	
		
		
	}

}
