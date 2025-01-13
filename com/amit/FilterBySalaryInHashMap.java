package com.amit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FilterBySalaryInHashMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Amit", "IT", 5000L));
		map.put(10, new Employee(20, "Komal", "HR", 2000L));
		map.put(11, new Employee(5, "Pranay", "IT", 3000L));
		map.put(3, new Employee(10, "Babu", "IT", 4000L));

		Map<Integer, Employee> filterResultBySalary = map.entrySet().stream()
				.filter(p -> p.getValue().getSalary() > 2000L)
				.sorted(Map.Entry.<Integer,Employee>comparingByValue((e1,e2)->Long.compare(e1.getSalary(), e2.getSalary())).reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		filterResultBySalary.forEach((key, value) -> {

			System.out.println(key + " " + value);

		});

	}

}
