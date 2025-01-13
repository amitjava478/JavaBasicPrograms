package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.amit.Employee;

public class GroupingByDepartmentInMap {

	public static void main(String[] args) {

		
		Map<Integer,Employee> map=new HashMap<Integer,Employee>();
		
		map.put(1,new Employee(1, "amit", "IT", 1000L));
		map.put(0,new Employee(10, "komal", "IT", 2000L));
		map.put(10,new Employee(100, "Dhruv", "IT", 50000L));
		map.put(9,new Employee(11, "Satendra", "HR", 11000L));
		
		
		
	Map<String, List<Entry<Integer, Employee>>> groupByDepartment=	map.entrySet().stream()
		.collect(Collectors.groupingBy(p->p.getValue().getDepartmentName()));
	
	groupByDepartment.forEach((key,value)->{
		
		System.out.println(key+" "+value);
	});
	}

}
