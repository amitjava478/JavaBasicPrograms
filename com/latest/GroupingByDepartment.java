package com.latest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.amit.Employee;

public class GroupingByDepartment {

	public static void main(String[] args) {
		
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1, "amit", "Hr", 1000L));
		list.add(new Employee(10, "komal", "IT", 3000L));
		list.add(new Employee(41, "Dhruv", "Hr", 2000L));
		list.add(new Employee(2, "zeenYadav", "IT", 500000L));

		
		
	Map<String, List<Employee>> list2=	list.stream()
		.collect(Collectors.groupingBy(Employee::getDepartmentName));
		
	
	
	list2.forEach((key,value)->{
		
		System.out.println(key+" "+value);
	});
		
		
	}

}
