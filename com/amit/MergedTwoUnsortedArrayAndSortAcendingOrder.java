package com.amit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergedTwoUnsortedArrayAndSortAcendingOrder {

	public static void main(String[] args) {
		
		int a[]= {10,23,1,90,23};
		
		int b[]= {101,230,10,900,232};
		
		
int combinedArray[]	= IntStream.concat(Arrays.stream(a), Arrays.stream(b))
            .distinct()
            .sorted()
		    .toArray();

System.out.println(Arrays.toString(combinedArray));

	}

}
