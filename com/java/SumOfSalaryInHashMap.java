package com.java;

import java.util.HashMap;
import java.util.Map;

import com.amit.Employee;

public class SumOfSalaryInHashMap {

	public static void main(String[] args) {
		
	Map<Integer, Employee> map=new HashMap<>();
	
	map.put(1, new Employee(1, "amit", "HR", 100L));
	map.put(10, new Employee(10, "komal", "It", 200L));
	map.put(11, new Employee(111, "balag", "HR", 300L));
	map.put(5, new Employee(1111, "dhruv", "HR", 400L));
	
	
Long sum=	map.entrySet().stream()
	.map(p->p.getValue().getSalary())
	//.reduce(0L,Long::sum);
      .reduce(0L,(a,b)->(a+b));

System.out.println(sum);
	}

}
