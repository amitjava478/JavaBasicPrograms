package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterTheMap2 {

	public static void main(String[] args) {
		
Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(2, "abc");
		
		
		
String  keyValue=		map.entrySet().stream()
		.filter(p->p.getValue().equals("abc"))
		.map(p->p.getKey().toString())
		.collect(Collectors.joining(","));

          System.out.println(keyValue);

	}

}
