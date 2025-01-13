package com.latest;

import java.util.HashMap;
import java.util.Map;

import com.amit.Employee;

public class SumOfSalaryInHashMap {

	public static void main(String[] args) {
		
		

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Amit", "IT", 5000L));
		map.put(10, new Employee(20, "Komal", "HR", 2000L));
		map.put(11, new Employee(5, "Pranay", "IT", 3000L));
		map.put(3, new Employee(10, "Babu", "HR", 4000L));
		
		
		
	Long sumOfSalary=	map.entrySet().stream()
		.map(p->p.getValue().getSalary())
		.reduce(0L,Long::sum);
	
	
	System.out.println(sumOfSalary);
		
		

	}

}
