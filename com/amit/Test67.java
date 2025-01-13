package com.amit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test67 {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "amit");
		map.put(10, "komal");
		map.put(9, "babu");
		map.put(11, "cemel");
		
		
	Map<Integer,String> sortedMap=	map.entrySet().stream()
		.sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
	
	sortedMap.forEach((key,value)->{
		
		System.out.println(key+" "+value);
	});
	

	}

}
