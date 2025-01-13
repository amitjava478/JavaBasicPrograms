package com.amit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test1 {

	public static void main(String[] args) {
		
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1, "amit", "HR", 10000L));
		list.add(new Employee(4, "komal", "HR", 50000L));
		list.add(new Employee(2, "balag", "IT", 70000L));
		list.add(new Employee(5, "anjali", "HR", 120000L));
		
		
		
	Optional<Employee>	secondHigestSalary=list.stream()
		.sorted(Comparator.comparing(Employee::getSalary).reversed())
		.skip(1)
		.findFirst();
		
	
	
	if(secondHigestSalary.isPresent())
	{
		System.out.println(secondHigestSalary.get().getSalary());
	}
	

	}

}
