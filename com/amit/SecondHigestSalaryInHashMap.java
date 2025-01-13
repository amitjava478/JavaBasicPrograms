package com.amit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHigestSalaryInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Amit", "IT", 5000L));
		map.put(10, new Employee(20, "Komal", "HR", 2000L));
		map.put(11, new Employee(5, "Pranay", "IT", 3000L));
		map.put(3, new Employee(10, "Babu", "IT", 4000L));

		Optional<Entry<Integer, Employee>> secondHigestSalary = map.entrySet().stream()
				.sorted(Map.Entry.<Integer,Employee>comparingByValue((e1,e2)->Long.compare(e1.getSalary(), e2.getSalary())).reversed())
				.skip(1)
				.findFirst();
				

		if(secondHigestSalary.isPresent())
		{
			System.out.println(secondHigestSalary.get());
		}

	}

}
