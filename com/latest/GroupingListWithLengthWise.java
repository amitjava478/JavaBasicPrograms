package com.latest;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingListWithLengthWise {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("aaa","aa","ab","hgtyy","ydsbb","tyyyyw","a");
		
		
	Map<Object, List<String>> list2=	list.stream()
		.collect(Collectors.groupingBy(p->p.length()));
	
	
	list2.forEach((key,value)->{
		
		System.out.println(key+" "+value);
		
	});
	

	}

}
