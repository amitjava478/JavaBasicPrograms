package com.latest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.amit.Employee;

public class SortingMapByKey {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();
		map.put(1, new Employee(10, "amit", "HR", 12000L));
		map.put(10, new Employee(100, "zaheen", "IT", 1000L));
		map.put(5, new Employee(50, "Dr", "HR", 5000L));
		map.put(2, new Employee(40, "amit", "IT", 7000L));
		map.put(0, new Employee(1, "amit", "HR", 4000L));

		Map<Integer, Employee> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.<Integer,Employee>comparingByKey().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		sortedMap.forEach((key, value) -> {

			System.out.println(key + " " + value);
		});

	}

}
