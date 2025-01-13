package com.Dhruv;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.amit.Employee;

public class ListToMap3 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "amit", "IT", 2000L));
		list.add(new Employee(2, "komal", "HR", 4000L));
		list.add(new Employee(10, "Dhruv", "IT", 8000L));

		Map<Integer, List<Employee>> map = list.stream()
				.collect(Collectors.groupingBy(Employee::getId));

		map.forEach((key, value) -> {

			System.out.println(key + " " + value);
		});

	}

}
