package com.amit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTheList {

	public static void main(String[] args) {
		
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1, "amit", "IT", 200L));
		list.add(new Employee(10, "komal", "IT", 300L));
		list.add(new Employee(11, "anil", "HR", 400L));
		list.add(new Employee(100, "BalaG", "IT", 600L));
		
		
List<Employee> filterList =list.stream()
		  .filter(p->p.getName().equals("amit"))
		  .collect(Collectors.toList());


System.out.println(filterList);
		

	}

}
