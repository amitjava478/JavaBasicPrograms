package com.amit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingByKeyInHashMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Amit", "IT", 5000L));
		map.put(10, new Employee(20, "Komal", "HR", 2000L));
		map.put(2, new Employee(5, "Pranay", "IT", 3000L));
		map.put(3, new Employee(10, "Babu", "HR", 4000L));
		
		
		
	Map<Integer,Employee> soretdMap= map.entrySet().stream()
		//.sorted(Map.Entry.comparingByKey())
		.sorted(Map.Entry.<Integer,Employee>comparingByKey().reversed())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
	
	soretdMap.forEach((key,value)->{
		
		System.out.println(key+"="+value);
	});
		
		
		

	}

}
