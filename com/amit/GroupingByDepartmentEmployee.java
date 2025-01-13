package com.amit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GroupingByDepartmentEmployee {

	public static void main(String[] args) {
		
		
		

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Amit", "IT", 5000L));
		map.put(10, new Employee(20, "Komal", "HR", 2000L));
		map.put(11, new Employee(5, "Pranay", "IT", 3000L));
		map.put(3, new Employee(10, "Babu", "IT", 4000L));
		

	Map<String, List<Entry<Integer, Employee>>> empByDepartment=	map.entrySet().stream()
		.collect(Collectors.groupingBy(p->p.getValue().getDepartmentName()));
	
	empByDepartment.forEach((key,value)->{
		
		System.out.println(key+" "+value);
		
	});
	

	}

}
