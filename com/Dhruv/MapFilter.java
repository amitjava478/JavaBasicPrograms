package com.Dhruv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.amit.Employee;

public class MapFilter {

	public static void main(String[] args) {
		

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "amit", "IT", 2000L));
		list.add(new Employee(2, "komal", "HR", 4000L));
		list.add(new Employee(10, "Dhruv", "IT", 8000L));
		
		
	List<String> list2=	list.stream()
		.filter(p->p.getSalary()>2000L)
		.map(Employee::getName)
		.collect(Collectors.toList());
		
	
	System.out.println(list2);
	

	}

}
