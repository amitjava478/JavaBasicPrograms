package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZeroAndNonZeroLeftRight {

	public static void main(String[] args) {
		
		int a[]= {12,0,0,34,0,2,1};
		
		Integer b[]=Arrays.stream(a).boxed().toArray(Integer []::new);
		
		List<Integer> list=Arrays.asList(b);
		
List<Integer>	list2=     Stream.concat(
			list.stream().filter(p->p==0), 
			list.stream().filter(p->p!=0))
	        .collect(Collectors.toList());

System.out.println(list2);

	}

}
