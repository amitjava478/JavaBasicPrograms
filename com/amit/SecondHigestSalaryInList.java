package com.amit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondHigestSalaryInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1, "amit", "IT",  1000L));
		list.add(new Employee(2, "komal", "IT", 2000L));
		list.add(new Employee(4, "babu", "Hr",  1000L));
		list.add(new Employee(3, "pranay", "IT",5000L));
		
		
		
	Employee secondHigestSalary=	list.stream()
		.sorted(Comparator.comparing(Employee::getSalary).reversed())
		.skip(1)
		.findFirst()
		.orElseThrow(null);
	
	
	
	System.out.println(secondHigestSalary.getSalary());
		

	}

}
