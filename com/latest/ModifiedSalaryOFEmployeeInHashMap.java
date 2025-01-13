package com.latest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.amit.Employee;

public class ModifiedSalaryOFEmployeeInHashMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map=new HashMap<>();
		map.put(1, new Employee(1, "Amit", "IT", 5000L));
		map.put(10, new Employee(20, "Komal", "HR", 2000L));
		map.put(11, new Employee(5, "Pranay", "IT", 3000L));
		map.put(3, new Employee(10, "Babu", "HR", 4000L));
		
		
	Map<Integer, Employee> sortedMap=	map.entrySet().stream()
		 .map(entry->{
			 Employee emp=entry.getValue();
			 long incrementSalary=emp.getSalary()+(emp.getSalary()*20/100);
			 return new HashMap.SimpleEntry<>(entry.getKey(),new Employee(emp.getId(), emp.getName(), emp.getDepartmentName(), incrementSalary));
		 })
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
	sortedMap.forEach((key,value)->{
		System.out.println(key+" "+value);
	});
	

	}

}
