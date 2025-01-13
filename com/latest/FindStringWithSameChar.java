package com.latest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringWithSameChar {

	public static void main(String[] args) {
		
	List<String> list=Arrays.asList("aa","bb","cc","cgh","abc","dty","AGB","AAA");
	
	 List<String> list2=           list.stream()
	            .filter(p->p.chars().distinct().count()==1)
	            .collect(Collectors.toList());
	            
	 
	 System.out.println(list2);
	                     

	}

}
