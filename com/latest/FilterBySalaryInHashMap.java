package com.latest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.amit.Employee;

public class FilterBySalaryInHashMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();
		map.put(1, new Employee(1, "amit", "HR", 1000L));
		map.put(2, new Employee(2, "komal", "IT", 200L));
		map.put(5, new Employee(10, "babu", "HR", 200L));
		map.put(4, new Employee(0, "raj", "IT", 1000L));

		Map<Integer, Employee> map2 = map.entrySet().stream().filter(p -> p.getValue().getSalary() == 200)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		map2.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}

}
