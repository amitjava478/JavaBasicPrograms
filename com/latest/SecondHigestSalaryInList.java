package com.latest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.amit.Employee;

public class SecondHigestSalaryInList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "amit", "HR", 200L));
		list.add(new Employee(10, "komal", "It", 100L));
		list.add(new Employee(2, "babu", "It", 300L));
		list.add(new Employee(5, "Dhruv", "It", 400L));
		list.add(new Employee(4, "JohnCena", "It", 500L));

		Employee secondHigestSalry = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(1)
				.findFirst()
				.orElseThrow(null);

		System.out.println(secondHigestSalry.getSalary());

	}

}
