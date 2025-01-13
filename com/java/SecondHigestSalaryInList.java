package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.amit.Employee;

public class SecondHigestSalaryInList {

	public static void main(String[] args) 
	{
    
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1, "amit", "IT", 1000L));
		list.add(new Employee(10, "komal", "HR", 2000L));
		list.add(new Employee(5, "Dhruv", "IT", 4000L));
		
		
	Employee secondHihestSalary=	list.stream()
		.sorted(Comparator.comparing(Employee::getSalary).reversed())
		.skip(1)
		.findFirst()
		.orElseThrow(null);
	
	
	System.out.println(secondHihestSalary.getSalary());
		
	
		
	}

}
