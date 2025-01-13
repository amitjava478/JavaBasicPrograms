package com.amit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstEvenNumberInList {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,3,4,5,6,8);
		
	Integer firstEvenNumber=	list.stream()
		.filter(p->p%2==0)
		.map(p->p)
		.findFirst()
		.orElseThrow(null);
	
	System.out.println(firstEvenNumber);
		
		
	}

}
