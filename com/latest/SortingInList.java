package com.latest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.amit.Employee;

public class SortingInList {

	public static void main(String[] args) {
		
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1, "amit", "HR", 12000L) );
		list.add(new Employee(2, "komal", "IT", 11000L) );
		list.add(new Employee(10, "dhruv", "HR", 10000L) );
		list.add(new Employee(4, "babu", "IT", 14000L) );
		list.add(new Employee(0, "zaheen", "HR", 1000L) );
		
		
List<Employee> sortedEmployee=list.stream()
		.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed())
		.collect(Collectors.toList());


for (Employee emp : sortedEmployee) 
{
	System.out.println(emp);
}

		
		

	}

}
