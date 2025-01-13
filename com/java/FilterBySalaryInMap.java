package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.amit.Employee;

public class FilterBySalaryInMap 
{

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "amit", "HR", 1000L));
		map.put(10, new Employee(2, "komal", "IT", 2000L));
		map.put(9, new Employee(10, "dhruv", "HR", 4000L));
		map.put(0, new Employee(11, "Raja", "HR", 5000L));

		Map<Integer, Employee> filterMap = map.entrySet().stream().filter(p -> p.getValue().getSalary() > 2000L)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		

		filterMap.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}

}
