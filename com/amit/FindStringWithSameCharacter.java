package com.amit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringWithSameCharacter {

	public static void main(String[] args) {

		List<String> list=new ArrayList<>(Arrays.asList("Amit","aaa","bbb","bcb","dfd","dd"));
		
	List<String> sameCharString=	list.stream()
		.filter(p->p.chars().distinct().count()==1)
		.collect(Collectors.toList());
		
	System.out.println(sameCharString);
		
		
	}

}
