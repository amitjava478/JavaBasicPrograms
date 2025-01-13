package com.Dhruv;

import java.util.Arrays;
import java.util.HashSet;

public class FindUniuePair {

	public static void main(String[] args) {
		
	int a[]= {1,2,3,4,5,6,8,0};
	int targetSum=6;
	
	Integer b[]=Arrays.stream(a)
			    .boxed()
			    .toArray(Integer[]::new);
	
	
	HashSet<Integer> seenNumber=new HashSet<>();
	HashSet<String> uniquePair=new HashSet<>();
	Arrays.stream(b).forEach(number->{
			
		int complement=targetSum-number;
		
		if(seenNumber.contains(complement))
		{
			int smaller=Math.min(number, complement);
			int larger=Math.max(number, complement);
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
