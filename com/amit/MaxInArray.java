package com.amit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,3,4,7,23,89,2};
		
		Integer b[]=Arrays.stream(a).boxed().toArray(Integer []::new);
		
		
		
		 List<Integer> list=new ArrayList<>(Arrays.asList(b));
		 
		 
Optional<Integer> maxValue=list.stream()
		 .max(Integer::compareTo);



if(maxValue.isPresent())
{
	System.out.println(maxValue.get());
}

	}

}
