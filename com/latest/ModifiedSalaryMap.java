package com.latest;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.amit.Employee;

public class ModifiedSalaryMap {

	public static void main(String[] args) 
	{
		
		

		Map<Integer, Employee> map=new HashMap<>();
		map.put(1, new Employee(1, "Amit", "IT", 5000L));
		map.put(10, new Employee(20, "Komal", "HR", 2000L));
		map.put(11, new Employee(5, "Pranay", "IT", 3000L));
		map.put(3, new Employee(10, "Babu", "HR", 4000L));
		
		
	Map<Integer, Long> map2=	map.entrySet()
		.stream()
		.collect(Collectors.toMap(Map.Entry::getKey, p->p.getValue().getSalary()+(p.getValue().getSalary()*20)/100));
	
	
	System.out.println(map2);
		
	}

}
