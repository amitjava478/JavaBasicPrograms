package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergerTwoUnsortedArrayAndSortDescendingOrder3 {

	public static void main(String[] args) {
		
		int a[] = { 12, 1, 3, 5, 90, 45 };
		int b[] = { 11, 8, 9, 4, 3, 2, 2};
		
		
Integer mergedArray[]=	IntStream.concat(Arrays.stream(a), Arrays.stream(b))
		.boxed()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.toArray(Integer []::new);
		
		System.out.println(Arrays.toString(mergedArray));
		

	}

}
