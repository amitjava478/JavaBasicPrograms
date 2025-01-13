package com.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortIngByKeyInHashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(10, "amit");
		map.put(9, "komal");
		map.put(11, "balaG");
		map.put(3, "dhruv");
		
		
Map<Integer, String> sortedMap=		map.entrySet().stream()
		.sorted(Map.Entry.<Integer,String>comparingByKey().reversed())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));


sortedMap.forEach((key,value)->{
	System.out.println(key+" "+value);
});
		

	}

}
