package com.latest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test23 {

	public static void main(String[] args) {
		
		int a[]= {15,35,55,12,18};
		int target=47;
		
		
		Arrays.stream(a).forEach(number->{
			
			int complementNumber=target-number;
			
			Set<Integer> seenNumber=new HashSet<>();
			Set<String> uniquePair=new HashSet<>();
			
			if(!seenNumber.contains(number))
			{
				
				int smaller=Math.min(complementNumber, number);
				int larger=Math.max(complementNumber, number);
				
				String pair=smaller+","+larger;
				
				uniquePair.add(pair);
				if(uniquePair.contains(pair))
				{
					
					System.out.println("("+pair+")");
				}
			}
			
			seenNumber.add(number);
		});
		
		

	}

}
