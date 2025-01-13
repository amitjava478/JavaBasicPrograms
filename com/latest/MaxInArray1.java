package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxInArray1 {

	public static void main(String[] args) {
		
		int a[]= {10,23,78,24,89,56};
		
		Integer b[]=Arrays.stream(a).boxed().toArray(Integer []::new);
		
		
		   List<Integer> list=Arrays.asList(b);
		   
		  Optional<Integer> maxElement=  list.stream()
		    .max(Integer::compareTo);
		  
		  
		  if(maxElement.isPresent())
		  {
			  System.out.println(maxElement.get());
		  }
	}

}
