package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import com.amit.Employee;

public class SecondHigestSalaryInHashMap {

	public static void main(String[] args)
	{
      Map<Integer, Employee> map=new HashMap<>();
      map.put(1, new Employee(1, "amit", "IT", 1000L));
      map.put(2, new Employee(10, "komal", "IT", 2000L));
      map.put(10, new Employee(9, "Dhruv", "HR", 4000L));
      map.put(9, new Employee(5, "Balag", "IT", 3000L));
      
      
      
   Entry<Integer, Employee> secondHigestSalary=       map.entrySet().stream()
         .sorted(Map.Entry.<Integer,Employee>comparingByValue((e1,e2)->Long.compare(e1.getSalary(), e2.getSalary())).reversed())
         .skip(1)
         .findFirst()
         .orElseThrow(null);
   
   
  System.out.println(secondHigestSalary.getValue().getSalary());
      
	}

}
