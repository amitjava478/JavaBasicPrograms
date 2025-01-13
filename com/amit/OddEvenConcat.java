package com.amit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Integer a[]= {12,3,4,23,89,34,347621,37};
	
	List<Integer> list=Arrays.asList(a);
	
     List<String> list2=	list.stream()
	.map(p->p%2==0?p+"E":p+"O")
	.collect(Collectors.toList());


System.out.println(list2);
		

	}

}
