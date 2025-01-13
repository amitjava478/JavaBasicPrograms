package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterTheMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "abc");
		map.put(2, "xyz");
		
		
	Map<Integer, String> filterMap=	map.entrySet().stream()
		.filter(p->p.getValue().equals("abc"))
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	
	
	filterMap.forEach((key,value)->{
		System.out.println(key);
	});

	}

}
