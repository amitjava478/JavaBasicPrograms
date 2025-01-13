package com.latest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHigestNumberInList {

	public static void main(String[] args) {
		
		int a[] = { 10, 20, 34, 1, 20 };
		
	Integer b[]= Arrays.stream(a)
		 .boxed()
		 .toArray(Integer []::new);
	
	List<Integer> list=Arrays.asList(b);
	
Integer secondHigestNumber=	 list.stream()
	 .sorted(Collections.reverseOrder())
	 .skip(1)
	 .findFirst()
	 .orElseThrow(null);


System.out.println(secondHigestNumber);

	}

}
