package com.latest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.amit.Employee;

public class PrintSalaryBy20percentHike {

	public static void main(String[] args) {
		

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Amit", "IT", 5000L));
		map.put(10, new Employee(20, "Komal", "HR", 2000L));
		map.put(11, new Employee(5, "Pranay", "IT", 3000L));
		map.put(3, new Employee(10, "Babu", "HR", 4000L));
	
		
Map<Object, Object>	 incrementedSalaryMap=	map.entrySet().stream()
		//.map(p->p.getValue().getSalary()+((p.getValue().getSalary()*20)/100))
		.collect(Collectors.toMap(Map.Entry::getKey, entry->entry.getValue().getSalary()+((entry.getValue().getSalary()*20)/100)));

incrementedSalaryMap.forEach((key,value)->{
	System.out.println(key+" "+value);
});
		

	}

}
