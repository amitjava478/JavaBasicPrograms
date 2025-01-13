package com.latest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import com.amit.Employee;

public class SecondHighestSalaryInHashMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map=new HashMap<>();
		map.put(1, new Employee(10, "amit", "IT", 100L));
		map.put(10, new Employee(100, "komal", "IT", 200L));
		map.put(9, new Employee(200, "baba", "HR", 400L));
		map.put(100, new Employee(400, "druv", "IT", 300L));
		
Optional<Entry<Integer, Employee>> secondHigestSalary=  map.entrySet().stream()
		.sorted(Map.Entry.<Integer,Employee>comparingByValue((e1,e2)->Long.compare(e1.getSalary(), e2.getSalary())).reversed())
		.skip(1)
		.findFirst();
 	

if(secondHigestSalary.isPresent())
{
	System.out.println(secondHigestSalary.get().getValue().getSalary());
}
 	
		

	}

}
