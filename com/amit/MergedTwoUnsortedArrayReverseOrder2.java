package com.amit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergedTwoUnsortedArrayReverseOrder2 {

	public static void main(String[] args) {
		
		
		  int a[]= {10,23,1,90,23};
			
		  int b[]= {101,230,10,900,232};
		  
		  
	Integer mergerArray[]=IntStream.concat(Arrays.stream(a), Arrays.stream(b))
		  .boxed()
		  .distinct()
		  .sorted(Comparator.reverseOrder())
		  .toArray(Integer[]::new);
			
	System.out.println(Arrays.toString(mergerArray));

	}

}
