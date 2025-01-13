package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUniquePair {

	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,6,7,2,0};
		
		Integer b[]=Arrays
				.stream(a)
				.boxed()
				.toArray(Integer []::new);
		int targetSum=6;
		
		Set<String> uniquePair=new HashSet<>();
		Set<Integer> seenNumber=new HashSet<>();
		
		
		Arrays.stream(b).forEach((number)->{
			
			int complement=targetSum-number;
			
			if(seenNumber.contains(complement))
			{
				int smaller=Math.min(complement, number);
				int larger=Math.max(complement, number);
				String pair=smaller+","+larger;
				
				if(!uniquePair.contains(pair))
				{
					uniquePair.add(pair);
					System.out.println("("+pair+")");
				}
			}
			
			seenNumber.add(number);
		});
		

	}

}
