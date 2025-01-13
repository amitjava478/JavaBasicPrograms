package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringWithSameCharInList {

	public static void main(String[] args) {

		
		List<String> list=Arrays.asList("Amit","ab","aaa","bbb","ccc","zb","ggg");
		
        List<String> stringWithSameCharList=list.stream()
		.filter(p->p.chars().distinct().count()==1)
		.collect(Collectors.toList());

        System.out.println(stringWithSameCharList);
    
    
	}

}
