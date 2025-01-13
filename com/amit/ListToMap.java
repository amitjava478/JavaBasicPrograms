package com.amit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {

		
		
		List<String> list=new ArrayList<>(Arrays.asList("A","B","c","D"));
		
	Map<String, Integer> map=	list.stream()
		.collect(Collectors.toMap(p->p, p->p.length()));
	
	
	map.forEach((key,value)->{
		System.out.println(key+" "+value);
	});
		
}
	
}